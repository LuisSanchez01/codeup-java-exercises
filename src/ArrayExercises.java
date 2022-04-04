import java.util.Arrays;

public class ArrayExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
//        Result: [I@4617c264

//        adding Arrays.toString and importing java.util.Arrays will display
//        the array.

        // using the array initializer syntax
//        Person[] bulls = {"Michael", "Scottie", "Dennis"};
//
//        System.out.println(Arrays.toString(bulls));
//        System.out.println(bulls.length); // 3
//
//        System.out.println(bulls[0]); // "Michael"
//        System.out.println(bulls[1]); // "Scottie"
//        System.out.println(bulls[2]); // "Dennis"

        Person[] person = new Person[3];
        person[0] = new Person("Michael");
        person[1] = new Person("Scottie");
        person[2] = new Person("Dennis");
        System.out.println(person[0]);
        System.out.println(person[1]);
        System.out.println(person[2]);
    } //end of main

    public static Person[] addPerson(Person[] pArray, Person newPerson) {
//declare the new array, one space bigger

    }


    }

