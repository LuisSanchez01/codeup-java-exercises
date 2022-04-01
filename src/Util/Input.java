package Util;
import  java.util.Scanner;

public class Input {
    private Scanner input; //lets us take in the user input


    public Input() {
        input = new Scanner(System.in);
    }

    public String getString() {
        return input.nextLine();
    }

    public boolean yesNo() {
        String userInput = getString();
        return (userInput.equalsIgnoreCase("y") ||
                userInput.equalsIgnoreCase("yes"));
    }

    public int getInt() {
         try {
             int inputInt = input.nextInt();
             return inputInt;
         } catch (Exception e) {
             System.out.println("Must enter a valid integer");
             input.nextLine();
             return getInt();
         }

    }

    public int getInt(int min, int max) {
        System.out.println("Please input a number between " + min + " and "
                + max + ": ");

        int userInt = getInt();

        if(userInt > max || userInt < min) {
            return getInt(min, max);
        }

        return userInt;
    }

    public double getDouble() {

        try {
            double userInput = input.nextDouble();

            return userInput;
        } catch (Exception e) {
            System.out.println("Must enter a valid double:");

        }
    }

    public double getDouble(double min, double max) {

    }


}
