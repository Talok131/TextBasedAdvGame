public class Weapons extends Things{
     private int damage;
     private String sound;
     public Weapons(String name, String sound, int damage){
         super(name);
         this.damage = damage;
         this.sound = sound;
     }

    public int getDamage() {
        return damage;
    }
    public String getSound() {
         return sound;
    }
}
