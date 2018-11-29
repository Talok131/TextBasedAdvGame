public class GilbertGodfrey extends NPC{

    public GilbertGodfrey(String name, Boolean isCandaian){
        super(name, isCandaian);
    }

    public void firstInteraction(Things gift){
        System.out.println("Yarr shiver me timbers. The captain's got a hankering to speak with ye. Here's the key for the door.");
        Player.addItem(gift);
    }
}
