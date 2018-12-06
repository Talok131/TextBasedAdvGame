public class Coins extends Things {
    private int numOfCoins;
    public Coins(){
        super("Coin","Coin");
        numOfCoins = 0;
    }
    public void addCoins(int num){
        numOfCoins += num;
    }
    public void removeCoins(int num){
        numOfCoins -= num;
    }
    public int getNumOfCoins(){
        return numOfCoins;
    }
}
