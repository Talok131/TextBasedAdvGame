public class UpperDeck extends Places {

    public Pirates pirates = new Pirates();
    public Captain captain = new Captain();

    public UpperDeck() {
        super("Upper Deck", upperDeck, 6, 2, 2);
    }

    static char[][] upperDeck =
            {
                    {'~', '~', '~', '~', '~', '/', '¯', '\\','~', '~', '~', '~', '~'},
                    {'~', '~', '~', '~', '/', '_', 'D', '_', '\\','~', '~', '~', '~'},
                    {'~', '~', '~', '/', '_', '_', '_', '_', '_', '\\','~', '~', '~'},
                    {'~', '~', '/', 'P', '_', '_', '║', '_', '_', '_', '\\','~', '~'},
                    {'~', '/', '_', '_', '_', '_', '_', '_', '_', '_', '_', '\\','~'},
                    {'~', '|', '_', '_', '_', '_', '_', '_', '_', 'P', '_', '|', '~'},
                    {'~', '|', '_', '_', '_', '_', '║', '_', '_', '_', '_', '|', '~'},
                    {'~', '|', '=', '_', 'P', '_', '_', '_', '_', '_', '=', '|', '~'},
                    {'~', '|', '=', '|', '|', '|', '|', '|', '|', '|', '=', '|', '~'},
                    {'~', '|', '=', '_', '_', '_', 'Ø', '_', '_', '_', '=', '|', '~'},
                    {'~', '|', '_', '_', '_', '_', 'C', '_', '_', '_', '_', '|', '~'},
                    {'~', '|', '_', '_', '_', '_', '_', '_', '_', '_', '_', '|', '~'},
                    {'~', '~', '\\','_', '_', '_', '_', '_', '_', '_', '/', '~', '~'},
                    {'~', '~', '~', '~', '~', '~', '~', '~', '~', '~', '~', '~', '~'}
            };
}
