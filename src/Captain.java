public class Captain extends People {

    private boolean firstInter = false;

    public Captain(){
        super("The Dread Pirate Roberts", true);
    }

    public void interaction(Player me){
        if(!firstInter) {
            System.out.println("Ah! just the pirate I wanted to see." +
                    "\nWe're almost to the island. When we get there I want you" +
                    "\nto follow this map and head into the cave. When you get" +
                    "\ninto the cave take out any threats. We'll be following" +
                    "\nshortly behind you and meet you in the treasure room." +
                    "\n" +
                    "\nCome back to me when you're ready to leave.");
            firstInter = true;
        } else {
            char ans = MyTools.readChar("Are you ready to dock?(Y/N)");
            if(ans == 'y'){
                Tester.switchMap(3);
            } else {
                System.out.println("Come back to me when you are ready to leave.");
            }
        }
    }
}
