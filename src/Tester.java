import java.util.Scanner;

public class Tester {
    public static void main(String [] args){
        Places map = new LowerDeck();
        System.out.print(map);
        Player Talon = new Player("Talon", false, 100);
        Talon.spawn(map);
        while(true) {
            map.playerMove(whereTo());
            System.out.print(map);
        }
    }
    public static char whereTo(){
        String temp = MyTools.readString("Where would you like to go? (n,s,e,w)");
        return temp.charAt(0);
    }
}
