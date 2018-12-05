public class Weapons extends Things{
     private int damageMin;
     private int damageMax;
     private String sound;
     public Weapons(String name, String sound, int damageMin, int damageMax){
         super(name);
         this.damageMin = damageMin;
         this.damageMax = damageMax;
         this.sound = sound;
     }

    public int getDamageMin() {
        return damageMin;
    }

    public int getDamageMax() { return damageMax; }

    public String getSound() {
         return sound;
    }
}
