public class Bandages extends Things{

    public Bandages(){
        super("Bandage", "You quickly wrap the bandage around your wounds, its not as effective but it helps.");
    }

    public static void normalUse(Player p){
        System.out.println("You apply the bandages and begin to feel better.");
        p.heal(35);
    }

}
