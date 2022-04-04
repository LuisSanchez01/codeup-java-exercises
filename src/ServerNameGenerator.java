import java.util.Arrays;

public class ServerNameGenerator {
    public static void main(String[] args) {


        Adjective[] adjectives = new Adjective[10];
        adjectives[0] = new Adjective("Handsome");
        adjectives[1] = new Adjective("Intelligent");
        adjectives[2] = new Adjective("Athletic");
        adjectives[3] = new Adjective("Charming");
        adjectives[4] = new Adjective("Gentle");
        adjectives[5] = new Adjective("Sharp");
        adjectives[6] = new Adjective("Punctual");
        adjectives[7] = new Adjective("Attentive");
        adjectives[8] = new Adjective("Hilarious");
        adjectives[9] = new Adjective("Helpful");

        System.out.println(adjectives[0]);
        System.out.println(adjectives[1]);
        System.out.println(adjectives[2]);
        System.out.println(adjectives[3]);
        System.out.println(adjectives[4]);
        System.out.println(adjectives[5]);
        System.out.println(adjectives[6]);
        System.out.println(adjectives[7]);
        System.out.println(adjectives[8]);
        System.out.println(adjectives[9]);

//        Create adjectives and nouns strings

//        Only showing memory location but not the name
    }
// javier's answer
        private static String getString(String[] stringArray){
            return stringArray[(int) Math.ceil(Mth.random() * stringArray.length - 1)];
        }

    public static void main(String[] args) {
        ServerNameGenerator serverNameGenerator = new ServerNameGenerator();
        System.out.println("Here is you server name:");
        String noun = getString(serverNameGenerator.getNouns());
        String adjective = getString(serverNameGenerator.getAdjectives());
        System.out.println("%s-%s", adjective, noun);
    }
    }

