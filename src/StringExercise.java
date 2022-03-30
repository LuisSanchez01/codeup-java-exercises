import java.util.Locale;

public class StringExercise {
    public static void main(String[] args) {
//        For each of the following output examples: create a String
//        variable that contains the desired output and print it out to
//        the console, you can do this with only one String variable and
//        one print statement for each output example.
//
//
//        String message = "We don't need no education";
        if ("We don't need no education".equals("We don't need no thought control")) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

//        String input = new String ("Check "this" out!, "s inside of "s!");
//        input.startsWith("Check");
//        System.out.println("Return input");
//        System.out.println(input.trim());

        if ("In windows, the main drive is usually C:".equals("In windows, the main drive is usually C:")) {
            System.out.println("Strings are equal");
        }


        String Str = new String(" I can do backslashes \\, double backslashes \\\\,\n" +
                "// and the amazing triple backslash \\\\\\!");

        System.out.print("Return string:");
        System.out.println(Str.toLowerCase());
    }
}
