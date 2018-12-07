public class LowerDeck extends Places {

    public LowerDeck(){
        super("Lower Deck", lowerDeck,4,0, 1);

    }

    public GilbertGodfrey gilbertGodfrey = new GilbertGodfrey("Gilber Godfrey", false);
    public KeyDoor cabinDoor = new KeyDoor("Cabin Door", 12345);
    public DoorKey cabinKey = new DoorKey("Cabin Key", 12345);
    public Weapons buckler = new Weapons("Buckler","*CLANG*", 4,5);
    public Chests cabinChest = new Chests(Tester.coin, cabinKey, buckler);

    static char[][] lowerDeck =
            {
                    {'~','~','~','-','-','D','-','-','~','~','~'},
                    {'~','~','/','_','_','_','_','_','\\','~','~'},
                    {'~','/','r','_','_','_','r','_','_','\\','~'},
                    {'/','_','_','_','_','_','_','_','_','_','\\'},
                    {'|','_','_','_','_','r','_','_','_','_','|'},
                    {'|','_','r','_','_','_','_','_','r','_','|'},
                    {'|','_','_','_','_','_','_','_','_','_','|'},
                    {'|','|','|','|','|','X','|','|','|','|','|'},
                    {'\\','_','G','_','_','_','_','_','_','C','/'},
                    {'~','\\','_','_','_','_','_','_','_','/','~'},
                    {'~','~','\\','_','_','_','_','_','/','~','~'},
                    {'~','~','~','\\','-','-','-','/','~','~','~'}
            };
}
