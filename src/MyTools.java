import java.util.Scanner;

public class MyTools {
    public static String readString(String prompt) {
        Scanner userInput = new Scanner(System.in);
        System.out.println(prompt);
        //No while loop since a string can be any char.
        String myString = userInput.nextLine();
        return myString;
    }

    public static double readDouble(String prompt) {
        Scanner userInput = new Scanner(System.in);
        System.out.println(prompt);
        while (!userInput.hasNextDouble()) {
            userInput.nextLine();
            System.out.print("Error\n" + prompt);
        }
        double number = userInput.nextDouble();
        return number;
    }

    public static int readInt(String prompt) {
        Scanner userInput = new Scanner(System.in);
        System.out.println(prompt);
        while (!userInput.hasNextInt()) {
            userInput.nextLine();
            System.out.print("Error\n" + prompt);
        }
        int number = userInput.nextInt();
        return number;
    }

    public static char readChar(String prompt) {
        try {
            Scanner userInput = new Scanner(System.in);
            System.out.println(prompt);
            while (!userInput.hasNextLine()) {
                userInput.nextLine();
                System.out.print("Error\n" + prompt);
            }
            String str = userInput.nextLine();
            //You wanna die you can die
            if (str.toLowerCase().equals("die")) {
                int temp = 10 / 0; //shhhh
            }
            char character = str.toLowerCase().charAt(0);
            return character;
        } catch (StringIndexOutOfBoundsException e) {
            return ' ';
        }
    }
}