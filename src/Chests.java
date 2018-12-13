import java.util.ArrayList;

public class Chests extends Things {
    private ArrayList<Things> loot = new ArrayList<>();
    private boolean looted = false;

    public Chests(Things t1) {
        super("Chest", "You cant see this so it doesn't matter what I put here.");
        Tester.coin.addCoins((int) Math.random() * 25);
        loot.add(t1);
    }

    public Chests(Things t1, Things t2) {
        super("Chest", "You cant see this so it doesn't matter what I put here.");
        Tester.coin.addCoins((int) Math.random() * 25);
        loot.add(t1);
        loot.add(t2);
    }

    public Chests(Things t1, Things t2, Things t3) {
        super("Chest", "You cant see this so it doesn't matter what I put here.");
        Tester.coin.addCoins((int) Math.random() * 25);
        loot.add(t1);
        loot.add(t2);
        loot.add(t3);
    }

    public Chests(Things t1, Things t2, Things t3, Things t4) {
        super("Chest", "You cant see this so it doesn't matter what I put here.");
        Tester.coin.addCoins((int) Math.random() * 25);
        loot.add(t1);
        loot.add(t2);
        loot.add(t3);
        loot.add(t4);
    }

    public Chests(Things t1, Things t2, Things t3, Things t4, Things t5) {
        super("Chest", "You cant see this so it doesn't matter what I put here.");
        Tester.coin.addCoins((int) Math.random() * 25);
        loot.add(t1);
        loot.add(t2);
        loot.add(t3);
        loot.add(t4);
        loot.add(t5);
    }

    public void collectChest(Player ply) {
        if (looted) {
            System.out.println("The chest is empty.");
        } else {
            for (int i = 0; i < loot.size(); i++) {
                System.out.println("You gained " + loot.get(i) + "!");
                ply.addItem(loot.get(i));
            }
            looted = true;
        }
    }
}
