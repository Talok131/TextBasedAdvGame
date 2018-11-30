public class Rat extends Enemies{
    private static String noise;

    public Rat(int hp, int dMIN, int dMAX, int exp, Things drop){
        super(hp, dMIN, dMAX, exp, drop);
        noise = "*Squeak Squeak*";
    }

    public void attack(Player ply){
        int temp = (int) (Math.random() * (getDamageMax() - getDamageMin())) + getDamageMin();
        ply.
    }
}
