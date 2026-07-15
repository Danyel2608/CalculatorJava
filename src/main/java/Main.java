import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator calculadora = new Calculator();

        int opcion = 0;

        while (opcion != 5) {

            System.out.println("""
                    ===== Calculator =====

                    1. Plus
                    2. Minus
                    3. Multiply
                    4. Divide
                    5. Exit

                    Select an option:
                    """);

            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("Write the first number:");
                    int num1 = sc.nextInt();

                    System.out.println("Write the second number:");
                    int num2 = sc.nextInt();

                    System.out.println("Result: " + calculadora.plus(num1, num2));
                    break;

                case 2:
                    System.out.println("Write the first number:");
                    int num3 = sc.nextInt();

                    System.out.println("Write the second number:");
                    int num4 = sc.nextInt();

                    System.out.println("Result: " + calculadora.minus(num3, num4));
                    break;

                case 3:
                    System.out.println("Write the first number:");
                    int num5 = sc.nextInt();

                    System.out.println("Write the second number:");
                    int num6 = sc.nextInt();

                    System.out.println("Result: " + calculadora.multi(num5, num6));
                    break;

                case 4:
                    System.out.println("Write the first number:");
                    int num7 = sc.nextInt();

                    System.out.println("Write the second number:");
                    int num8 = sc.nextInt();

                    System.out.println("Result: " + calculadora.divide(num7, num8));
                    break;

                case 5:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option.");
            }
        }

        sc.close();
    }
}