import java.util.ArrayList;

public class KeyDoor extends Things{
    private int keyId;
    private int xCord;
    private int yCord;
    public KeyDoor(String name, int ID){
        super(name);
        keyId = ID;
    }
    public boolean keyTest(DoorKey key){
        if (key.getKeyId() == keyId){
            return true;
        } else {
            return false;
        }
    }
}
