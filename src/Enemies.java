public class Enemies {
    private int healthPoints;
    private int damageMin;
    private int damageMax;
    private int expReward;
    private Things drops;

    public Enemies(int hp, int dMIN, int dMAX, int exp, Things drop){
        healthPoints = hp;
        damageMin = dMIN;
        damageMax = dMAX;
        expReward = exp;
        drops = drop;
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
}
