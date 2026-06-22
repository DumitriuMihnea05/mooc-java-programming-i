import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Scrie programul aici
        System.out.println("Give a word:");
        String word = scanner.nextLine();  // Folosim 'scanner' în loc de 'reader'
        String phrase = word + word + word;  // 'String' cu majusculă
        System.out.println(phrase);
    }
}