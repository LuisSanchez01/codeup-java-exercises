import grades.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        Student student1 = new Student("Jimmy");
        student1.addGrade(87);
        student1.addGrade(79);
        student1.addGrade(67);

        Student student2 = new Student("Jaime");
        student2.addGrade(93);
        student2.addGrade(77);
        student2.addGrade(80);

        Student student3 = new Student("James");
        student3.addGrade(58);
        student3.addGrade(79);
        student3.addGrade(66);

        Student student4 = new Student("Jose");
        student4.addGrade(86);
        student4.addGrade(72);
        student4.addGrade(81);

        System.out.println(student3.getGrades());
        System.out.println(student4.getGrades());

        students.put("userJimmy1", student1);
        students.put("userJaime2", student2);
        students.put("userJames3", student3);
        students.put("userJose4", student4);

        System.out.println(students);

        for (Map.Entry<String, Student> studentsSet : students.entrySet()) {
            System.out.println(studentsSet.getKey() + " : " + studentsSet.getValue().getGrades());
//
//            Set<String> studentNames = studentsSet.keySet();
        }

            System.out.println("Which student would you like to see more information about?");
        Scanner in = new Scanner(System.in);

        String s = in.nextLine();
//        System.out.println("You entered string " + s + );

        System.out.println("Welcome!\n" +
                "\n" +
                "Here are the GitHub usernames of our students:\n" +
                "\n" +
                "|userJimmy1| |userJaime2| |userJames3| |userJose4|\n" +
                "\n" +
                "What student would you like to see more information on?");


//        int a = in.nextInt();
//        System.out.println("You entered integer " + a);
//
//        float b = in.nextFloat();
//        System.out.println("You entered float " + b);
        }
    }

