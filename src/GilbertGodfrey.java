public class GilbertGodfrey extends People {
    private boolean isFirstInteraction = true;
    private boolean firstIslandInteaction = true;

    public GilbertGodfrey(String name, Boolean isCandaian) {
        super(name, isCandaian);
    }

    public void Interaction() {
        if (isFirstInteraction) {
            System.out.println("Gilbert Godfrey: Yarr shiver me timbers. The captain's got a hankering to speak with ye. The key to the Cabin is in that thar chest.");
            isFirstInteraction = false;
        } else {
            System.out.println("Gilbert Godfrey: Yarr what did I tell ye! Go speak to the Captain! And clear out those rats while you" +
                    "'re at it!");
        }
    }

    public void IslandPreCaveInteraction(){
        if (firstIslandInteaction) {
            System.out.println("Gilbert Godfrey: Yarrrrr this here cave be a dangerous place" +
                    "\n\tYe might be in danger if ye were to go alone, take this.");
            Tester.Talon.addItem(new Weapons("Gilbert's Cutlass", "CHING", 10,12));
            Tester.Talon.addItem(new Bandages());
            Tester.Talon.addItem(new Bandages());
            Tester.Talon.addItem(new Bandages());
        } else {
            System.out.println("Gilbert Godfrey: Ye best be prayin to lady luck.");
        }
    }

}
