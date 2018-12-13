public class BlackBeard extends Enemies {

    private static String noise;
    private boolean crippled = false;
    private boolean bloodied = false;
    private boolean fightBegin = true;

    public BlackBeard(int mhp, int hp, int dMIN, int dMAX, int exp, Things drop){
        super(mhp, hp, dMIN, dMAX, exp, drop);
        noise = "YARRR";
    }

    public void attack(Player ply) {
        if(fightBegin) {
            System.out.println("Black Beard: Yerr not getting MY TREASURE!");
            fightBegin = false;
        }
        if (getHealthPoints() < 2.0 / 3.0 * getMaxHealthPoints() && !crippled) {
            crippled = true;
            System.out.println("Black Beard is visibly injured.");
        }
        if (getHealthPoints() < 1.0 / 3.0 * getMaxHealthPoints() && !bloodied) {
            bloodied = true;
            System.out.println("Black Beard begins bleeding profusely.");
        }

        boolean hitOrMiss;
        if (Math.random() * 100 > 85 - getConfusionVal()) {
            hitOrMiss = false;
        } else {
            hitOrMiss = true;
        }
        if (hitOrMiss) {
            int temp = (int) Math.round((Math.random() * (getDamageMax() - getDamageMin())) + getDamageMin());
            ply.takeDamage(temp);
            System.out.println("Black Beard attacks you for " + temp + " damage!");
        } else {
            System.out.println("Black Beard goes to attack... but misses!");
        }
    }
}
