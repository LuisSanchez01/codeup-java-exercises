import java.util.Arrays;

public class ArrayExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
//        Result: [I@4617c264

//        adding Arrays.toString and importing java.util.Arrays will display
//        the array.

        // using the array initializer syntax
        String[] bulls = {"Michael", "Scottie", "Dennis"};

        System.out.println(bulls.length); // 3

        System.out.println(bulls[0]); // "Michael"
        System.out.println(bulls[1]); // "Scottie"
        System.out.println(bulls[2]); // "Dennis"



    }
}
