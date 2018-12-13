

public class Pirates extends People {

    private String[] pirateyPhrases = {"Pirate: Yarrr", "Pirate: Shiver me Timbers!", "Pirate: Captains on the poop deck.", "Pirate: Ahoy, matey.", "Pirate: Yarr ye landlubber",
            "Pirate: Now immmmmaaa AIMIN FOR HEAVENNNNNNNNNNNNNNNNNNNNNNNNN" +
                    "\n\t BUT PROBABLY WIND UP DOWN IN HELLLLLLL AHHHH" +
                    "\n\t WHERE UPON DIS ALTER I WILLLLLLL HANG MY GUILT RIDDEN HEADDD AHH" +
                    "\n\t BUT ITS TIME ILL TAKE" +
                    "\n\t BEFORE I BEGIN AHHH" +
                    "\n\t THREE SHEETS TO THE WINNNDDD AHHH" +
                    "\n\t THREE SHEETS TO THE WINNNNDDD AHHHH" +
                    "\n\t YEAH ITS TIME ILL TAKE" +
                    "\n\t BEFORE I BEGIN AHHH" +
                    "\n\t THREE SHEETS TO THE WINNNDDD AHHH" +
                    "\n\t THREE SHEETS TO THE WINNNNDDD AHHHHHHHHHHHHHHHHH" +
                    "\n\t REBBEELLLLLLLSSSSS AREEEE WEEEE" +
                    "\n\t DOE HEAVYYYYY OUR HEARTS SHALL ALWAYSSSS BEEE",

            "Pirate: Do what you want, 'cause a pirate is free,\n" +
                    "\tYou are a pirate!\n" +
                    "\t\n" +
                    "\tYar har, fiddle di dee,\n" +
                    "\tBeing a pirate is all right with me,\n" +
                    "\tDo what you want 'cause a pirate is free,\n" +
                    "\tYou are a pirate!\n" +
                    "\tYo Ho, ahoy and avast,\n" +
                    "\tBeing a pirate is really badass!\n" +
                    "\tHang the black flag at the end of the mast!\n" +
                    "\tYou are a pirate!"};


    public Pirates() {
        super("Pirate", true);
    }

    public void interaction() {
        int rand = (int) Math.round((Math.random() * 6));
        System.out.println(pirateyPhrases[rand]);
    }
}
