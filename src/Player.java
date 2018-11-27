public class Player extends People{
    public Player(String name, boolean isCanadian, int healthpoints){
        super(name,isCanadian);
        this.healthPoints = healthPoints;
        xCord = 5;
        yCord = 9;
    }
    private int healthPoints;
    private static int xCord;
    private static int yCord;
    private Things[] inventory;
    private Things hatSlot;
    private Things weapon;

    public static void spawn(Places maps){
        maps.playerMove('f');
        System.out.print(maps);
    };
    public static void moveNorth(){};
    public static void moveSouth(){};
    public static void moveWest(){};
    public static void moveEast(){};
    public static void interact(){};

    public static void putOnHead(){};
    public static void equipWeapon(){};
    public static void openInventory(){};
    public static void useItem(){};

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
