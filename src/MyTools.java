import java.util.Scanner;

public class MyTools {
    public static String readString(String prompt){
        Scanner userInput = new Scanner(System.in);
        System.out.println(prompt);
        //No while loop since a string can be any char.
        String myString = userInput.nextLine();
        return myString;
    }
    public static double readDouble(String prompt){
        Scanner userInput = new Scanner(System.in);
        System.out.println(prompt);
        while(!userInput.hasNextDouble()){
            userInput.nextLine();
            System.out.print("Error\n" + prompt);
        }
        double number = userInput.nextDouble();
        return number;
    }

    public static int readInt(String prompt){
        Scanner userInput = new Scanner(System.in);
        System.out.println(prompt);
        while(!userInput.hasNextInt()){
            userInput.nextLine();
            System.out.print("Error\n" + prompt);
        }
        int number = userInput.nextInt();
        return number;
    }
}