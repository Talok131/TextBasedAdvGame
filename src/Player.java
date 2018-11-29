import java.util.ArrayList;

public class Player extends People {

    private int healthPoints;
    private static int xCord;
    private static int yCord;
    private static ArrayList<Things> Inventory = new ArrayList<Things>();
    private Things hatSlot;
    private Things weapon;
    private static Places map;


    public Player(String name, boolean isCanadian, int healthpoints, Places maps) {
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

    public static void openInventory() {
        for (int i = 0; i < Inventory.size(); i++) {
            System.out.println("Item " + (i + 1) + ": " + Inventory.get(i).getName());
        }
    }

    ;

    public static void addItem(Things thing) {
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

    ;

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
}
