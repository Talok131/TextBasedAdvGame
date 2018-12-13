public class DoorKey extends Things {
    private int keyId;
    public DoorKey(String keyName, int ID){
        super(keyName, "You hold up the key and make a surprised face. The enemy seems mildly confused.");
        keyId = ID;
    }

    public String getCombatUse(Enemies e) {
        e.setConfusionVal(5);
        return super.getCombatUse(e);
    }

    public int getKeyId() {
        return keyId;
    }
}
