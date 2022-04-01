public class HighLow {

    public static void init() {
        System.out.println("Welcome to the High / Low game");
        int randomNum = MethodsExercises.getRandomInt(1, 100);
        System.out.println(randomNum);
        System.out.println("Guess a number between 1 and 100");
        int guess = MethodsExercises.getInteger(1, 100);
        if (guess == randomNum) {
            System.out.println("GOOD GUESS");
        } else if (guess < randomNum){
            System.out.println("Higher");
        } else {
            System.out.println("Lower");
        }
    }


    public static void main(String[] args) {
        init();
    }
}
