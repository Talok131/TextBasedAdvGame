public class Captain extends People {

    private boolean firstInter = false;

    public Captain() {
        super("The Dread Pirate Bobert", true);
    }

    public void interaction(Player me) {
        if(!Tester.beganIsland) {
            if (!firstInter) {
                System.out.println(
                        "The Dread Pirate Bobert: Ah! just the pirate I wanted to see." +
                                "\n\tWe're almost to the island. When we get there I want you" +
                                "\n\tto follow this map and head into the cave. When you get" +
                                "\n\tinto the cave take out any threats. We'll be following" +
                                "\n\tshortly behind you and meet you in the treasure room." +
                                "\n" +
                                "\n\tCome back to me when you're ready to leave.");
                firstInter = true;
            } else {
                char ans = MyTools.readChar("The Dread Pirate Bobert: Are you ready to dock?(Y/N)");
                if (ans == 'y') {
                    Tester.switchMap(3);
                } else {
                    System.out.println("The Dread Pirate Bobert: Come back to me when you are ready to leave.");
                }
            }
        } else {
            System.out.println("The Dread Pirate Bobert: Yarr think of the gold, Three sheets to the wind from there ye salty dog!");
        }
    }
}
