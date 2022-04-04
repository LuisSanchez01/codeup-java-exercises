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

//        String[] synonymOfWeird = {"strange", "bizarre", "uncanny", "odd",
//        "peculiar", "uncommon"};
//        System.out.println(synonymsOfWeird[2]);
//        synonymsOfWeird[0] = "extraordinary";
//        System.out.println(synonymsOfWeird[0]);
//        System.out.println(synonymsOfWeird.length);
//
//        for(int i = 0; i < numbers.length; i++){
//            System.out.println("The number at index " + i + " is " +
//                    synonymsOfWeird[i]);

//        enhanced for loop
//        for (String synonymOfWeird : synonymOfWeird){
//            System.out.println(synonymOfWeird);

        }

//        Create an array of five bytes using either array variable
//        declaration or array initialization syntax. Use either a for
//        loop or an enhanced for loop to output the values to the terminal.






    }

