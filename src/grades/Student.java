package grades;

import java.util.ArrayList;

public class Student {
    public ArrayList<Integer> getGrades() {
        return grades;
    }

//    public static void main(String[] args) {
//        Student student1 = new Student("Jimmy");
//        student1.addGrade(87);
//        student1.addGrade(79);
//        student1.addGrade(80);
//        System.out.println(student1.grades);
//
//    }

//    ArrayList<Person> persons = new ArrayList<>();
//            Person joe = new Person("Joe");
//            Person mo = new Person("Mo");
//            Person zahra = new Person("Zahra");
//            persons.add(joe);
//            persons.add(mo);
//            persons.add(zahra);
//            for(Person person : persons){
//        System.out.println(person.getName());
//    }
    private String name;
    private ArrayList<Integer> grades = new ArrayList<>();






    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }


    // returns the student's name
    public String getName() {
        return name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
         this.grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        return 0;
    }
}
