import java.util.Arrays;

public class ArraysLecture {
    public static void main(String[] args) {
        // we declare a reference variable, numbers, of type Integer Array
        int[] numbers;
        // we assign an actual array to the numbers reference
        numbers = new int[5];
        numbers[0] = 78;
        numbers[1] = 76;
        numbers[2] = 43;
        numbers[3] = 12;
        numbers[4] = -56;


        System.out.println(numbers[0]);
        Arrays.sort(numbers);
        // *not* numbers.sort()
        System.out.println(numbers[0]);

        // array initializer syntax

        String[] synonymsOfWeird = {"strange", "bizarre", "uncanny", "odd",
        "peculiar", "uncommon"};
        System.out.println(synonymsOfWeird[2]);
    }
}
