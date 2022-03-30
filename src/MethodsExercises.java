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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        userFactorialInput(sc);
    }

        // initializing variables
//        int num1 = 10, num2 = 20, sum = 0;
//
//        // Displaying num1 and num2
//        System.out.println("num1 = " + num1);
//        System.out.println("num2 = " + num2);
//
//        // adding num1 and num2
//        sum = num1 + num2;
//        System.out.println("The sum = " + sum);

//        int num1 = 10;
//        int num2 = 20;
//
//        System.out.println(num1 + num2);

        // initializing variables
//        int num3 = 20, num4 = 10, sub = 0;
//
//        // Displaying num3 and num4
//        System.out.println("num3 = " + num3);
//        System.out.println("num4 = " + num4);
//
//        // subtracting num3 and num4
//        sub = num3 - num4;
//        System.out.println("Subtraction = " + sub);
//
//        int num3 = 30;
//        int num4 = 23;
//
//        System.out.println(num3 - num4);

        // initializing variables
//        int num5 = 20, num6 = 10, mult = 0;
//
//        // Displaying num1 and num2
//        System.out.println("num5 = " + num5);
//        System.out.println("num6 = " + num6);
//
//        // Multiplying num5 and num6
//        mult = num5 * num6;
//        System.out.println("Multiplication = " + mult);
//
//        int num5 = 5;
//        int num6 = 6;
//
//        System.out.println(num5 * num6);

        // initializing variables
//        int num7 = 20, num8 = 10, div = 0;
//
//        // Displaying num7 and num8
//        System.out.println("num7 = " + num7);
//        System.out.println("num8 = " + num8);
//
//        // Dividing num7 and num8
//        div = num7 / num8;
//        System.out.println("Division = " + div);
//
//        int num7 = 70;
//        int num8 = 8;
//
//        System.out.println(num7 / num8);

//        int num9 = 5, num10 = 2, mod = 0;
//
//        // Displaying num9 and num10
//        System.out.println("num9 = " + num9);
//        System.out.println("num10 = " + num10);
//
//        // Remaindering num9 and num10
//        mod = num9 % num10;
//        System.out.println("Remainder = " + mod);


//        int first, second, add, subtract, multiply;
//        float divide;
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter Two Numbers : ");
//        first = scanner.nextInt();
//        second = scanner.nextInt();
//
//        add = first + second;
//        subtract = first - second;
//        multiply = first * second;
//        divide = (float) first / second;
//
//        System.out.println("Sum = " + add);
//        System.out.println("Difference = " + subtract);
//        System.out.println("Multiplication = " + multiply);
//        System.out.println("Division = " + divide);


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

        public static long calculateFactorial ( int num){
            int output = 1;
            for (int i = 1; i <= num; i += 1) {
                output *= i;
            }
            return output;
        }

        public static void userFactorialInput (Scanner sc) {

            String choice = "y";
            System.out.println("Enter a number from 1-10:");
            int userInput = sc.nextInt();
            System.out.println(calculateFactorial(userInput));
            System.out.println("Do you want to continue y/n ?");
            choice = sc.next();
            System.out.println();
        }}










