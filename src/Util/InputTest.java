package Util;

public class InputTest {

    public static void main(String[] args) {

        Input input = new Input();
//        We expect the user to type yes or no
        System.out.println(input.yesNo());


        System.out.println("input.getInt = " + input.getInt());

        System.out.println("input = " + input.getInt(5, 10));
    }

}
