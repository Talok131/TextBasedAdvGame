public class Coins extends Things {
    private int numOfCoins;

    public Coins() {
        super("Coin", "You use the coin to reflect a beam of light into the enemies eye!");
        numOfCoins = 0;
    }

    public String getCombatUse(Enemies e) {
        e.setConfusionVal(10);
        return super.getCombatUse(e);
    }

    public void addCoins(int num) {
        numOfCoins += num;
    }

    public void removeCoins(int num) {
        numOfCoins -= num;
    }

    public int getNumOfCoins() {
        return numOfCoins;
    }
}
