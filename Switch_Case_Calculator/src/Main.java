import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to the calculator");
        System.out.println("Write the first number: ");
        int num1 = in.nextInt();
        System.out.println("Write the second number: ");
        int num2 = in.nextInt();

        System.out.println("\nSelect an option:");
        System.out.println("[1] Addition");
        System.out.println("[2] Subtraction");
        System.out.println("[3] Multiplication");
        System.out.println("[4] Division");
        System.out.println("Option: ");
        int option = in.nextInt();

        switch (option) {
            case 1 -> System.out.println("The result is: " + (num1 + num2));
            case 2 -> System.out.println("The result is: " + (num1 - num2));
            case 3 -> System.out.println("The result is: " + (num1 * num2));
            case 4 -> System.out.println("The result is: " + (num1 / num2));
            default -> System.out.println("Invalid option");
        }
    }
}