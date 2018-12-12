

public class Pirates extends People {

    private String[] pirateyPhrases = {"Yarrr", "Shiver me Timbers!", "Captains on the poop deck.", "Ahoy, matey.", "Yarr ye landlubber",
            " Now immmmmaaa AIMIN FOR HEAVENNNNNNNNNNNNNNNNNNNNNNNNN" +
            "\n BUT PROBABLY WIND UP DOWN IN HELLLLLLL AHHHH" +
            "\n WHERE UPON DIS ALTER I WILLLLLLL HANG MY GUILT RIDDEN HEADDD AHH" +
            "\n BUT ITS TIME ILL TAKE" +
            "\n BEFORE I BEGIN AHHH" +
            "\n THREE SHEETS TO THE WINNNDDD AHHH" +
            "\n THREE SHEETS TO THE WINNNNDDD AHHHH" +
            "\n YEAH ITS TIME ILL TAKE" +
            "\n BEFORE I BEGIN AHHH" +
            "\n THREE SHEETS TO THE WINNNDDD AHHH" +
            "\n THREE SHEETS TO THE WINNNNDDD AHHHHHHHHHHHHHHHHH" +
            "\n REBBEELLLLLLLSSSSS AREEEE WEEEE" +
            "\n DOE HEAVYYYYY OUR HEARTS SHALL ALWAYSSSS BEEE",

            "Do what you want, 'cause a pirate is free,\n" +
            "You are a pirate!\n" +
            "\n" +
            "Yar har, fiddle di dee,\n" +
            "Being a pirate is all right with me,\n" +
            "Do what you want 'cause a pirate is free,\n" +
            "You are a pirate!\n" +
            "Yo Ho, ahoy and avast,\n" +
            "Being a pirate is really badass!\n" +
            "Hang the black flag at the end of the mast!\n" +
            "You are a pirate!" };


    public Pirates(){
        super("Pirate", true);
    }

    public void interaction(){
        int rand = (int) Math.round((Math.random() * 6));
        System.out.println(pirateyPhrases[rand]);
    }
}
