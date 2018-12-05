public class Rat extends Enemies{
    private static String noise;

    public Rat(int hp, int dMIN, int dMAX, int exp, Things drop){
        super(hp, dMIN, dMAX, exp, drop);
        noise = "*Squeak Squeak*";
    }

    public void attack(Player ply){
        boolean hitOrMiss;
        if(Math.random()*100 > 80){
            hitOrMiss = false;
        } else {
            hitOrMiss = true;
        }
        if(hitOrMiss) {
            int temp = (int) Math.round((Math.random() * (getDamageMax() - getDamageMin())) + getDamageMin());
            ply.takeDamage(temp);
            System.out.println("The rat attacks you for " + temp + " damage!");
        } else {
            System.out.println("The rat goes to attack... but misses!");
        }
    }
}
