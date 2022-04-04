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

//        adding after the static method Person
        Person[] newBiggerArray = ArrayExercises.addPerson(person, new Person("Jay"));
//      for (Person persons : newBiggerArray){
//          person.sayHello();
        System.out.println(Arrays.toString(newBiggerArray));
    }

     //end of main

    public static Person[] addPerson(Person[] person, Person newPerson) {
//declare the new array, one space bigger
      Person[] newBiggerArray = new Person[person.length + 1];
      for(int i = 0; i < person.length; i++) {
          newBiggerArray[i] = person[i];
      }
      newBiggerArray[newBiggerArray.length - 1] = newPerson;
      return newBiggerArray;
    }
//    Once this is done, add to main the newPersons array


    }

//     Javier's work through line 91

//public class ArraysExercises {
//    public static Person[] addPerson(Person[] persons, Person n00b){
//        Person[] newBiggerArray = new Person[persons.length +1];
//        for(int i = 0; i < persons.length; i++){
//            newBiggerArray[i] = persons[i];
//        }
//        newBiggerArray[newBiggerArray.length -1] = n00b;
//        return newBiggerArray;
//    }
//
//    public static Person[] addPersonWithCopyOf(Person[] persons, Person n00b){
//        Person[] newPersonArray;
//        newPersonArray = Arrays.copyOf(persons, persons.length + 1);
//        newPersonArray[newPersonArray.length -1] = n00b;
//        return newPersonArray;
//    }
//
//
//
//    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
////        System.out.println(Arrays.toString(numbers));
//        Person[] persons = new Person[3];
//        persons[0] = new Person("Justin");
//        persons[1] = new Person("Dane");
//        persons[2] = new Person("Javier");
//
////        for (Person person : persons) {
////            System.out.println(person.getName());
////        }
//
//        Person[] newPersonsArray = ArraysExercises.addPersonWithCopyOf(persons, new Person("Jay"));
//        for(Person person: newPersonsArray){
//            person.sayHello();
//        }
//        System.out.println(Arrays.toString(newPersonsArray));
//    }

