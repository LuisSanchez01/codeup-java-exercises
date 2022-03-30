import java.util.Locale;

public class StringExercise {
    public static void main(String[] args) {
//        For each of the following output examples: create a String
//        variable that contains the desired output and print it out to
//        the console, you can do this with only one String variable and
//        one print statement for each output example.
//
//
//        String output = "We don't need no education\n";
//        output += "We don't need no thought control";
//        System.out.println(output);
//
//          String output2 = "Check \"this\" out!, \"s inside of \"s!";
//        System.out.println(output2);

        if ("In windows, the main drive is usually C:".equals("In windows, the main drive is usually C:")) {
            System.out.println("Strings are equal");
        }


        String Str = new String(" I can do backslashes \\, double backslashes \\\\,\n" +
                "// and the amazing triple backslash \\\\\\!");

        System.out.print("Return string:");
        System.out.println(Str.toLowerCase());
    }
}
