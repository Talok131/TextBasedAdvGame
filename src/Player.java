import java.util.ArrayList;

public class Player extends People {

    private int maxHealthPoints = 100;
    private int healthPoints;
    private static int xCord;
    private static int yCord;
    private static ArrayList<Things> Inventory = new ArrayList<Things>();
    private Things hatSlot;
    private Weapons weapon = new Weapons("Fists", "*POW POW*", 2,4);
    private int totalEXP;
    private int level = 1;


    public Player(String name, boolean isCanadian, int healthPoints) {
        super(name, isCanadian);
        this.healthPoints = healthPoints;
        xCord = 5;
        yCord = 9;
    }

    public void tgm(){
        maxHealthPoints = 99999;
        healthPoints = maxHealthPoints;
        equipWeapon(new Weapons("God Sword", "MOVE B**** GET OUT THE WAY", 100, 200));
        addItem(new DoorKey("Cabin Key", 12345));
    }

    public void spawn() {
        xCord = Tester.map.getPlayerStartingX();
        yCord = Tester.map.getPlayerStartingY();
        Tester.map.playerMove('f');
        System.out.print(Tester.map);
    }



    public static void interact() {
    }

    ;


    public static void putOnHead() {
    }

    ;

    public void equipWeapon(Weapons wep){
        weapon = wep;
    }

    public void equipWeapon() {

        try {
            int loco = -1 + MyTools.readInt("Enter the inventory location of your desired weapon.");
            Weapons temp;
            temp = weapon;
            weapon = (Weapons) Inventory.get(loco);
            removeItem(loco);
            Inventory.add(temp);
            System.out.println("You equip the " + weapon.toString());
        } catch (ClassCastException e){
            System.out.println("You can only equip weapons.");
            equipWeapon();
        }
    }

    ;

    public void openInventory() {
        for (int i = 0; i < Inventory.size(); i++) {
            System.out.println("Item " + (i + 1) + ": " + Inventory.get(i));
        }
    }

    public void openInventoryMenu() {
        boolean menuUp = true;
        System.out.println("\'I\': Inventory\n" +
                "\'C\': Check Self\n" +
                "\'E\': Equip weapon\n" +
                "\'U\': Use item\n" +
                "\'D\': Drop item\n" +
                "\'Q\': Exit menu");
        while (menuUp){
            char act = MyTools.readChar("");
            switch (act) {
                case 'i':
                    openInventory();
                    break;
                case 'c':
                    System.out.println("Health: " + healthPoints + "/" + maxHealthPoints);
                    System.out.println("Level: " + level);
                    System.out.println("Weapon: " + weapon.toString());
                    break;
                case 'e':
                    if (isInventoryEmpty()) {
                        System.out.println("Your inventory is empty");
                        break;
                    } else {
                        openInventory();
                        equipWeapon();
                        break;
                    }
                case 'u':
                    break;
                case 'q':
                    menuUp = false;
                    break;
                case 'd':
                    int index = MyTools.readInt("Select the item you would like to drop.");
                    removeItem(index-1);
            }
        }


    }
    ;

    public void removeItem(int index) {
        Inventory.remove(index);
    }

    public  void addItem(Things thing) {
        Inventory.add(thing);
    }

    public static void addCharacter() {

    }

    public DoorKey useKey(int index) {
        try {
            return (DoorKey) Inventory.get(index);
        } catch (IndexOutOfBoundsException e){
            DoorKey key = new DoorKey("This doesnt exsist", 0);
            return key;
        }
    }

    public void beginAttack(Enemies e){
        while (true){
            String eHitBar = "_________________\n|";
            String pHitBar = "_________________\n|";
            for (float temp = healthPoints; temp > 0.0; temp -=(float)(maxHealthPoints/10.0)){
                pHitBar+="█";
            }
            for (float temp = e.getHealthPoints(); temp > 0.0; temp-=(float)(e.getMaxHealthPoints()/10.0)){
                eHitBar+="█";
            }
            for (int i = pHitBar.length(); i < 29; i = pHitBar.length()){
                pHitBar+="■";
            }
            for (int i = eHitBar.length(); i < 29; i = eHitBar.length()){
                eHitBar+="■";
            }
            eHitBar+="|\n¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯";
            pHitBar+="|\n¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯";
            System.out.println(eHitBar);
            System.out.println(pHitBar);
            if (e.getHealthPoints() <= 0) {
                System.out.println("You defeated the enemy!");
                System.out.println("You gained " + e.getExpReward() + " EXP!");
                addEXP(e.getExpReward());
                if (e.getDrops() != null){
                    addItem(e.getDrops());
                    System.out.println("The enemy dropped a " + e.getDrops());
                }
                break;
            }
            getCombatAction(e);
            e.attack(this);
        }
    }

    public void addEXP(int exp){
        totalEXP += exp;
        testLevel();
    }

    public boolean isInventoryEmpty(){
        return Inventory.isEmpty();
    }

    public void testLevel(){
        if (level == 1){
            if (totalEXP == 10){
                System.out.println("You leveled up!");
                maxHealthPoints += 20;
                healthPoints = maxHealthPoints;
                level = 2;
            }
        } else if (totalEXP >= 5*(level-1)*10){
            System.out.println("You leveled up!");
            maxHealthPoints += 20;
            healthPoints = maxHealthPoints;
            level++;
        }
    }

    public void getCombatAction(Enemies e){
        int action = MyTools.readInt(   "__________  ____________  _______  ________  \n" +
                                                "|1.Attack|  |2.Use Item|  |3.Run|  |4.Talk|  \n" +
                                                "¯¯¯¯¯¯¯¯¯¯  ¯¯¯¯¯¯¯¯¯¯¯¯  ¯¯¯¯¯¯¯  ¯¯¯¯¯¯¯¯  \n");
        switch (action){
            case 1:
                boolean hitOrMiss;
                if(Math.random()*100 > (80+ level)){
                    hitOrMiss = false;
                } else {
                    hitOrMiss = true;
                }
                if(hitOrMiss) {
                    int temp = (int) Math.round((level-1)+(Math.random() * (weapon.getDamageMax() - weapon.getDamageMin())) + weapon.getDamageMin());
                    e.takeDamage(temp);
                    System.out.println("You attack for " + temp + " damage!");
                } else {
                    System.out.println("You go to attack... but miss!");
                }
                break;
            case 2:
                this.openInventory();
                int temp = -1 + MyTools.readInt("Select the item number.");
                System.out.println(Inventory.get(temp).getCombatUse(e));
                break;
            case 3:

            case 4:

        }
    }

    public static int getxCord() {
        return xCord;
    }

    public static int getyCord() {
        return yCord;
    }

    public static void setxCord(int x) {
        xCord = x;
    }

    public static void setyCord(int y) {
        yCord = y;
    }

    public void takeDamage(int dam){ healthPoints -= dam; }
}
