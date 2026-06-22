import java.util.Scanner;

public class AdditionFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");  // Ensure the colon is here
        int first = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");  // Ensure the colon is here
        int second = Integer.valueOf(scanner.nextLine());

        int sum = first + second;

        System.out.println(first + " + " + second + " = " + sum);
    }
}