import java.util.Scanner;

public class DoubleInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // First, print the prompt
        System.out.println("Give a number:");

        // Then, read the value
        double value = Double.valueOf(scanner.nextLine());

        // Finally, print the value
        System.out.println("You gave the number " + value);

    }
}