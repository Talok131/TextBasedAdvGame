import java.util.Scanner;

public class Tester {
    static Coins coin = new Coins();
    static LowerDeck ld = new LowerDeck();
    static UpperDeck ud = new UpperDeck();
    static char[][] o = {{'a'}};
    static Places map;
    static Player Talon = new Player("Talon", false, 100);

    public static void main(String [] args){
        switchMap(1);
        Talon.spawn();
        if ((MyTools.readString("Press enter to begin...")).equals("tgm"))
            Talon.tgm();
        //How the program runs. Literally everything stems from interactions here.
        while(true) {
            playerChoice(MyTools.readChar("What would you like to do? (Type H for help)"));
        }
    }

    public static void switchMap(int num){
        switch (num){
            case 1:
                map = ld;
                break;
            case 2:
                map = ud;
                break;
            case 3:
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n The map is in your IMMMAGINATIONNNN");
                break;
        }
    }

    public static void ratTile(char action){
        System.out.println("A large rat stares you down menacingly...");
        System.out.println( "________________________________________" +
                          "\n|                FIGHT!                |" +
                          "\n¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
        switch (map.getMapID()) {
            case 1:
                map.playerMove(action);
                Rat rat = new Rat(15, 15, 1, 3, 10, null);
                Talon.beginAttack(rat);
                map.setCurrentTile('_');
                System.out.print(map);
        }
    }

    public static void chestTile(char action){
        switch (map.getMapID()) {
            case 1:
                map.playerMove(action);
                System.out.print(map);
                ld.cabinChest.collectChest(Talon);
        }
    }

    public static void lockedDoorTile(char action){
        switch (map.getMapID()) {
            case 1:
                if (Talon.isInventoryEmpty()) {
                    System.out.println("You need a key to open this door.");
                } else {
                    Talon.openInventory();
                    int temp = MyTools.readInt("Select the inventory location with the desired Key");
                    try {
                        if (ld.cabinDoor.keyTest(Talon.useKey(temp - 1))) {
                            System.out.println("You use the key to open the door.");
                            map.getMap()[8][6] = '_';
                            break;
                        } else {
                            System.out.println("You need the Cabin Key to open this door.");
                            break;
                        }
                    } catch (ClassCastException e) {
                        System.out.println("You must select a key.");
                        break;
                    }
                }
                break;
        }
    }

    public static void gilbertGodfreyTile(char action){
        switch (map.getMapID()){
            case 1:
                map.playerMove(action);
                System.out.print(map);
                ld.gilbertGodfrey.Interaction();
                break;
        }
    }

    public static void zoneDoorTile(char action){
        switch (map.getMapID()){
            case 1:
                ld.getMap()[1][5] = '_';
                ld.getMap()[1][7] = '_';
                switchMap(2);
                Talon.spawn();
                break;
            case 2:
                ud.getMap()[1][5] = '_';
                ud.getMap()[1][7] = '_';
                ld.setPlayerStartingX(6);
                ld.setPlayerStartingY(2);
                switchMap(1);
                Talon.spawn();
                break;
        }
    }

    public static void pirateTile(char action){
        switch (map.getMapID()){
            case 2:
                map.playerMove(action);
                System.out.print(map);
                ud.pirates.interaction();
                break;
        }
    }

    public static void playerChoice(char action) {
        switch (testNextTile(action)) {
            case 94:
                ratTile(action);
                break;
            case 69:
                chestTile(action);
                break;
            case 420:
                ud.captain.interaction(Talon);
            case 5:
                lockedDoorTile(action);
                break;
            case 1028:
                gilbertGodfreyTile(action);
                break;
            case 13:
                pirateTile(action);
                break;
            case 10:
                zoneDoorTile(action);
                break;
            case 1:
                System.out.println("You push up against a wall and realize you aren't a ghost.");
                break;
            case 0:
                map.playerMove(action);
                System.out.print(map);
                break;
            case -1:
                break;
        }
    }

    public static void altAction(char action){
        switch (action){
            case 'o':
                Talon.openInventoryMenu();
                break;
            case 'h':
                System.out.println("Type N, S, W, E to move." +
                        "\nType O to open your inventory menu." +
                        "\nType M to re-open the map.");
                break;
            case 'm':
                System.out.println(map);
                break;
            default :
                System.out.println("Type H for help.");
                break;
        }
    }

    public static int testNextTile(char action) {
        int x = Talon.getxCord();
        int y = Talon.getyCord();
        boolean moved = true;
        switch (action) {
            case 'n':
                y -= 1;
                break;
            case 's':
                y += 1;
                break;
            case 'w':
                x -= 1;
                break;
            case 'e':
                x += 1;
                break;
            default:
                moved = false;
                altAction(action);
                break;
        }
        if (moved) {
            switch (map.getMap()[y][x]) {
                //Walls
                case '/':
                case '-':
                case '|':
                case '\\':
                case '║':
                case 'Ø':
                case '~':
                    return 1;
                //Gilbert Godfrey
                case 'G':
                    return 1028;
                //Doors
                case 'X':
                    return 5;
                //Zone Doors
                case 'D':
                    return 10;
                //Rats
                case 'r':
                    return 94;
                //Chests
                case 'c':
                    return 69;
                case 'C':
                    return 420;
                //YAR HAR FIDDILEY DEE
                case 'P':
                    return 13;
                //Walking Tiles
                default:
                    return 0;
            }
        }
        return -1;
    }
}
