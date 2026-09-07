import java.util.Scanner;

public class Sample5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("[1] Addition");
        System.out.println("[2] Subtraction");
        System.out.println("[3] Multiplication");
        System.out.println("[4] Division");
        
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        System.out.print("Enter a value: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter another value: ");
        double num2 = scanner.nextDouble();

        switch (choice) {
            case 1:
                System.out.println("Result: " + (num1 + num2));
                break;

            case 2:
                double subResult = Math.max(num1, num2) - Math.min(num1, num2);
                System.out.println("Result: " + subResult);
                break;

            case 3:
                System.out.println("Result: " + (num1 * num2));
                break;

            case 4:
                double larger = Math.max(num1, num2);
                double smaller = Math.min(num1, num2);

                if (smaller == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                } else {
                    System.out.println("Result: " + (larger / smaller));
                }
                break;

            default:
                System.out.println("Invalid choice selection.");
                break;
        }

        scanner.close();
    }
}