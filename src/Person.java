public class Person {
    private String name;




    public String getName() {
//TODO: return the person's name
        System.out.println(name);
    }
    public void setName(String name){
//TODO: change the name field to the passed value
    }
    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.println("Hello from " + this.name);
    }

    public static void main(String[] args){

        Person person1 = new Person("John");
        Person person2 = new Person("John");
        System.out.println(person1.getName().equals(person2.getName()));
        System.out.println(person1 == person2);

        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1 == person2);
    }
}
