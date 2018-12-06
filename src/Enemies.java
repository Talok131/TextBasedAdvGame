public class Enemies {
    private int maxHealthPoints;
    private int healthPoints;
    private int damageMin;
    private int damageMax;
    private int expReward;
    private Things drops;
    private int confusionVal = 0;

    public Enemies(int mhp,int hp, int dMIN, int dMAX, int exp, Things drop){
        maxHealthPoints = mhp;
        healthPoints = hp;
        damageMin = dMIN;
        damageMax = dMAX;
        expReward = exp;
        drops = drop;
    }

    public int getConfusionVal() {
        return confusionVal;
    }

    public int getMaxHealthPoints() {
        return maxHealthPoints;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public int getDamageMin() {
        return damageMin;
    }

    public int getDamageMax() {
        return damageMax;
    }

    public int getExpReward() {
        return expReward;
    }

    public Things getDrops() {
        return drops;
    }

    public void setConfusionVal(int confusionVal) {
        this.confusionVal = confusionVal;
    }

    public void takeDamage(int dam){
        healthPoints -= dam;
    }

    public void attack(Player ply){
        boolean hitOrMiss;
        if(Math.random()*100 > 80 - confusionVal){
            hitOrMiss = false;
        } else {
            hitOrMiss = true;
        }
        if(hitOrMiss) {
            int temp = (int) Math.round((Math.random() * (getDamageMax() - getDamageMin())) + getDamageMin());
            ply.takeDamage(temp);
            System.out.println("The enemy attacks you for " + temp + " damage!");
        } else {
            System.out.println("The enemy goes to attack... but misses!");
        }
    }
}
