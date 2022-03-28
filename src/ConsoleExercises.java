import java.util.Random;
import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.println("pi = " + pi);

        String myString = "The value of pi is approximately 3.14";
        System.out.println("myString = " + myString);
//        string output = String.format("The value of pi is %.2f, pi")

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your age:");
        int age = sc.nextInt();
        System.out.println(age);
//        Non-integer displays an error

// .next() captures each input separated by a string:
//            System.out.print("Please enter your first, middle, and last name: ");
//            String firstName = sc.next();
//            String lastName = sc.next();
//            String what = sc.next();

        System.out.print("Please enter your first, middle, and last name");
        String firstName = sc.next();
        String middleName = sc.next();
        String lastName = sc.next();

        System.out.println("firstName = " + firstName);
        System.out.println("middleName = " + middleName);
        System.out.println("lastName = " + lastName);
//        If you enter more or less than the three names, nothing returns.

//        System.out.print("Please enter your favorite quote: ");
//        String quote = sc.next();
//        System.out.println(quote);

        System.out.print("Please enter your favorite quote: ");
        String quote = sc.nextLine();
        System.out.println(quote);

        System.out.print("Please enter the length of the room: ");
        int num = sc.nextInt();
        System.out.println(num);
        sc.nextLine(); // needed to clear new line character from scanner
        System.out.print("Please enter the width of the room: ");
        String words = sc.nextLine();
        System.out.println(words);


                final double width = 20.0;
                final double height = 20.0;
                double perimeter = 2*(height + width);
                double area = width * height;

                System.out.printf("Perimeter is 2*(%.1f + %.1f) = %.2f \n", height, width, perimeter);
                System.out.printf("Area is %.1f * %.1f = %.2f \n", width, height, area);
            }
}
