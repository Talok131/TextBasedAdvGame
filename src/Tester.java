import java.util.Scanner;

public class Tester {
    static Places map = new LowerDeck();
    static Player Talon = new Player("Talon", false, 100, map);
    static GilbertGodfrey gilbertGodfrey = new GilbertGodfrey("Gilber Godfrey", false);
    static KeyDoor cabinDoor = new KeyDoor("Cabin Door", 12345);
    static DoorKey cabinKey = new DoorKey("Cabin Key", 12345);
    public static void main(String [] args){
        Talon.spawn();
        //How the program runs. Literally everything stems from interactions here.
        while(true) {
            playerChoice(whereTo());
        }



    }

    public static char whereTo(){
        String temp = MyTools.readString("Where would you like to go? (n,s,e,w)");
        return temp.charAt(0);
    }
    public static void playerChoice(char action) {
        switch (testNextTile(action)) {
            case 3:
                if(cabinDoor.keyTest(Talon.useKey(0))){
                    System.out.println("You use the key to open the door.");
                    map.getMap()[7][5] = '_';
                    break;
                } else {
                    System.out.println("You need the Cabin Key to open this door.");
                    break;
                }
            case 2:
                Places.playerMove(action);
                System.out.print(map);
                gilbertGodfrey.firstInteraction(cabinKey);
                break;
            case 1:
                System.out.println("You push up against a wall and realize you aren't a ghost.");
                break;
            case 0:
                Places.playerMove(action);
                System.out.print(map);
                break;
        }
    }

    ;

    public static int testNextTile(char action) {
        int x = Player.getxCord();
        int y = Player.getyCord();
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
        }
        switch (map.getMap()[y][x]) {
            case '/':
            case '-':
            case '|':
            case '\\':
                return 1;
            case 'G':
                return 2;
            case 'X':
                return 3;
            default:
                return 0;
        }

    }
}
