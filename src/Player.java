import java.util.ArrayList;

public class Player extends People {

    private int maxHealthPoints;
    private int healthPoints;
    private static int xCord;
    private static int yCord;
    private static ArrayList<Things> Inventory = new ArrayList<Things>();
    private Things hatSlot;
    private Weapons weapon = new Weapons("Fists", "*POW POW*", 2,4);
    private static Places map;
    private int totalEXP;
    private int level = 1;


    public Player(String name, boolean isCanadian, int healthPoints, Places maps) {
        super(name, isCanadian);
        this.healthPoints = healthPoints;
        xCord = 5;
        yCord = 9;
        map = maps;
    }

    public static void spawn() {
        map.playerMove('f');
        System.out.print(map);

    }



    public static void interact() {
    }

    ;


    public static void putOnHead() {
    }

    ;

    public static void equipWeapon() {

    }

    ;

    public void openInventory() {
        for (int i = 0; i < Inventory.size(); i++) {
            System.out.println("Item " + (i + 1) + ": " + Inventory.get(i));
        }
    }

    ;

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
            System.out.println(e.getHealthPoints() + "   " + healthPoints);
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
