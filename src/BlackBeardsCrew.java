public class BlackBeardsCrew extends Enemies {

    private static String noise;
    private boolean crippled = false;
    private boolean bloodied = false;

    public BlackBeardsCrew(int mhp, int hp, int dMIN, int dMAX, int exp, Things drop){
        super(mhp, hp, dMIN, dMAX, exp, drop);
        noise = "YARRR";
    }

    public void attack(Player ply) {
        if (getHealthPoints() < 2.0 / 3.0 * getMaxHealthPoints() && !crippled) {
            crippled = true;
            System.out.println("The Pirate is visibly injured.");
        }
        if (getHealthPoints() < 1.0 / 3.0 * getMaxHealthPoints() && !bloodied) {
            bloodied = true;
            System.out.println("The Pirate begins leaking blood???");
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
            System.out.println("The Pirate attacks you for " + temp + " damage!");
        } else {
            System.out.println("The Pirate goes to attack... but misses!");
        }
    }
}
