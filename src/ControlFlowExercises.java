import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int i = 5;
//        while (i <= 15){
//            System.out.println(i);
//            i++;

//            Create a do-while loop that will count by 2's starting with 0 and ending at 100.
//            Follow each number with a new line.
//            int i = 2;
//
//            do {
//                System.out.println(i * 2);
//                i++;
//            } while (i <= 100);
//                System.out.println("\n");
//            }
//        }
//            Alter your loop to count backwards by 5's from 100 to -10.
//        int i = 100;
//
//        do {
//            System.out.println(i + " ");
//            i-=5;
//        } while (i >= -10);
//        System.out.println("\n");
//    }
//}
//            Create a do-while loop that starts at 2, and displays the number squared on each
//            line while the number is less than 1,000,000. Output should equal:
//           int i = 2;
//
//           do {
//                System.out.println(i*=2);
//                i++;
//           } while (i < 1000000);
//           System.out.println("\n");
//    }
//}

//        One of the most common interview questions for entry-level programmers is the FizzBuzz test.
//        Developed by Imran Ghory, the test is designed to assess basic looping and conditional logic skills.
//
//        Write a program that prints the numbers from 1 to 100.
//        For multiples of three: print “Fizz” instead of the number.

//        for (int i = 1; i <= 100; i++) {
////            System.out.println(i);
//        if(i % 3 == 0) {
//            System.out.println("Fizz");
//        } else {
//            System.out.println(i);
//        }
//    }
//}}

//        For the multiples of five: print “Buzz”.
//    for (int i = 1; i <= 100; i++) {
////             System.out.println(i);
//        if(i % 5 == 0) {
//             System.out.println("Buzz");
//        } else {
//            System.out.println(i);
//        }
//      }
//    }
//}

//        For numbers which are multiples of both three and five: print “FizzBuzz”.
//        Display a table of squares and cubes from 1 to the value entered.
        String choice = "y";

        while(choice.equalsIgnoreCase("y"))
        {
            // get the input from the user
            System.out.println("Enter an Integer: ");
            int integerNext = sc.nextInt();

            System.out.println("Number" + "  " + "Squared" + "  " + "Cubed");
            System.out.println("======" + "  " + "======" + "  " + "======");

            for(int i = 1; i <= integerNext; i++)
            {
//                i = integerNext;
                int numberSquared = (int) Math.pow(i, 2);
                int numberCubed = (int) Math.pow (i, 3);

                String message = "\n" + i + "       " + numberSquared + "       " + numberCubed;

                System.out.println(message);
                System.out.println();

            }
                // see if the user wants to continue
                System.out.print("Continue? (y/n): ");
                choice = sc.next();
                System.out.println();
        }
    }
}
