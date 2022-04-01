import java.util.Scanner;

//Basic Arithmetic
//
//        Create four separate methods. Each will perform an arithmetic operation:
//
//        Addition
//        Subtraction
//        Multiplication
//        Division
//        Each function needs to take two parameters/arguments so that the operation can be performed.
//
//        Test your methods and verify the output.
//
//        Add a modulus method that finds the modulus of two numbers.
//
//        Food for thought: What happens if we try to divide by zero? What should happen?

public class MethodsExercises {

        public static double add(double num1, double num2) {
            return num1 + num2;
        }

        public static double subtract(double num1, double num2){
            return num1 - num2;
        }

    public static double multiply(double num1, double num2){
        return num1 * num2;
    }

    public static double divide(double num1, double num2){
        return num1 / num2;
    }

    public static double modulus(double num1, double num2){
        return num1 % num2;
    }

    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        int userInt = sc.nextInt();
        if (userInt >= min && userInt <= max) {
            return userInt;
        } else {
            System.out.println("Input out of range");
            return getInteger(min, max);
        }
    }


// First approach to the problem
//    public static long factorial (int num) {
//            long  output = 1;
//        for (int i = 1; i <= num; i += 1) {
//            output *= i;
//        }
//        return output;
//        }


// Second approach to the problem
    public static long factorial (int num) {
          if (num == 1) return 1;
        return factorial(num - 1) * num;
        }

        public static void promptUserForFactorials() {
            Scanner sc = new Scanner(System.in);
            String continueMessage = "yes";
            System.out.println("Welcome to the factorial calculator");
            do {
                System.out.println("What number should we calculate?");
                int userInt = getInteger(1, 10);
                System.out.println("The factorial of " + userInt + " is " + factorial(userInt) + ".");

            System.out.println("Do you want to continue? (Enter 'Yes' or 'No')");
                continueMessage = sc.nextLine();
            } while (continueMessage.equalsIgnoreCase("Yes"));
        }

//        Problem number 4
//    This part handles the generation of a random number
        public static int getRandomInt(int min, int max) {
            return min + (int)(Math.random() * ((max - min) + 1));
        }
//    This part handles the basic prompting of the dice roll
        public static void diceRoll() {
            System.out.println("Welcome too Dice Roll!");
            System.out.println("Enter number of sides of the dice. (1-6");
            int noOfSidesOfDice = getInteger(1, 6);
            System.out.printf("You have rolled %d and a %d",
                    getRandomInt(1, noOfSidesOfDice), getRandomInt(1, noOfSidesOfDice));
        }


    public static void main(String[] args) {




//            Problem number 4
//            for (int i = 0; i < 10; i += 1) {
//                System.out.println(getRandomInt(1, 5));
//            }
//        This diceRoll(); handles the print
        diceRoll();
//        System.out.println(add(2, 2)); // 4
//        System.out.println(add(2.5, 2.5)); // 5
//
//        System.out.println(subtract(10, 5)); // 5
//        System.out.println(subtract(8, 3)); // 5
//
//        System.out.println(multiply(2, 3)); // 6
//        System.out.println(multiply(3, 4));
//
//        System.out.println(divide(10, 2)); // 5
//        System.out.println(divide(12, 3)); // 4
//
//        System.out.println(modulus(10, 3)); // 1
//        System.out.println(modulus(11, 8)); // 3

//        System.out.print("Enter a number between 1 and 10: ");
//        int userInput = getInteger(1, 10);
//
//        System.out.println("You entered: " + userInput);

//        System.out.println(factorial(1)); // 1
//        System.out.println(factorial(2)); // 2
//        System.out.println(factorial(3)); // 6
//        System.out.println(factorial(4)); // 24

//          promptUserForFactorials();



    }


//        Bonus
//
//        Create your multiplication method without the * operator (Hint: a loop might
//        be helpful).
//        Do the above with recursion.

    // TODO: use recursion to print out a given number up through 100
//        public static int countTo100(int num) {
//            System.out.println(num);
//            if (num == 100) {
//                return 1;
//            }
//            public static void main (String[] args){
//                countTo100(1);
//            }

    //    TODO: use recursion to add all numbers up from 1 to a given number
//          public static int addNums(int num) {
//              if (num == 1) {
//                  return 1;
//              }
//              return num + addNums(num - 1);
//          }
//          public static void main(String[] args) {
//              System.out.println(addNums(10));
//          }
//
//


//    Ex: Calculate the factorial of a number
}










