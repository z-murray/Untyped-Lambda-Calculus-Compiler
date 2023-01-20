import java.util.Scanner;

public class Main {

    private static final String var = "[a-zA-Z_][a-zA-Z_0-9]*";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TokenStream tokenStream = new TokenStream(input.nextLine());
        Token token;
        while ((token = tokenStream.nextToken()) != null) {
            System.out.println(token);
        }
    }

    public static String[] tokenize(String in) {
        return in.split(" ");
    }

    public static String parse(String tokens) {
        return null;
    }

    public static String evaluate(String parseTree) {
        return null;
    }
}