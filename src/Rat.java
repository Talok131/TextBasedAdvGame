public class Rat extends Enemies {
    private static String noise;
    private boolean crippled = false;
    private boolean bloodied = false;


    public Rat(int mhp, int hp, int dMIN, int dMAX, int exp, Things drop) {
        super(mhp, hp, dMIN, dMAX, exp, drop);
        noise = "*Squeak Squeak*";
    }

    public void attack(Player ply) {
        if (getHealthPoints() < 2.0 / 3.0 * getMaxHealthPoints() && !crippled) {
            crippled = true;
            System.out.println("The rat is visibly injured.");
        }
        if (getHealthPoints() < 1.0 / 3.0 * getMaxHealthPoints() && !bloodied) {
            bloodied = true;
            System.out.println("The rat is bloodied badly.");
        }

        boolean hitOrMiss;
        if (Math.random() * 100 > 80 - getConfusionVal()) {
            hitOrMiss = false;
        } else {
            hitOrMiss = true;
        }
        if (hitOrMiss) {
            int temp = (int) Math.round((Math.random() * (getDamageMax() - getDamageMin())) + getDamageMin());
            ply.takeDamage(temp);
            System.out.println("The rat attacks you for " + temp + " damage!");
        } else {
            System.out.println("The rat goes to attack... but misses!");
        }
    }
}
