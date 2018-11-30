public class GilbertGodfrey extends NPC{
    private boolean isFirstInteraction = true;
    public GilbertGodfrey(String name, Boolean isCandaian){
        super(name, isCandaian);
    }

    public void Interaction(Things gift, Player player){
        if (isFirstInteraction) {
            System.out.println("Yarr shiver me timbers. The captain's got a hankering to speak with ye. Here's the key for the door.");
            player.addItem(gift);
            isFirstInteraction = false;
        } else {
            System.out.println("Yarr what did I tell ye! Go speak to the Captain! And clear out those rats while you" +
                    "'re at it!");
        }
    }
}
