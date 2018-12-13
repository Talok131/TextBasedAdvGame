public class Weapons extends Things {
    private int damageMin;
    private int damageMax;
    private String sound;

    public Weapons(String name, String sound, int damageMin, int damageMax) {
        super(name, "You have to equip this weapon out of combat to use it.");
        this.damageMin = damageMin;
        this.damageMax = damageMax;
        this.sound = sound;
    }

    public int getDamageMin() {
        return damageMin;
    }

    public int getDamageMax() {
        return damageMax;
    }

    public String getSound() {
        return sound;
    }
}
