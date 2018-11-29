public class DoorKey extends Things {
    private int keyId;
    public DoorKey(String keyName, int ID){
        super(keyName);
        keyId = ID;
    }

    public int getKeyId() {
        return keyId;
    }
}
