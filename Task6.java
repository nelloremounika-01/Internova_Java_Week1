import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter an Integer value: ");
        int intValue = sc.nextInt();

        System.out.print("Enter a Float value: ");
        float floatValue = sc.nextFloat();

        System.out.print("Enter a Double value: ");
        double doubleValue = sc.nextDouble();

        // Display Original Values
        System.out.println("\n----- Original Values -----");
        System.out.println("Integer : " + intValue);
        System.out.println("Float   : " + floatValue);
        System.out.println("Double  : " + doubleValue);

        // Implicit Type Casting
        double implicitCast = intValue;

        // Explicit Type Casting
        int explicitCast = (int) doubleValue;

        // Display Type Casting
        System.out.println("\n----- Type Casting -----");
        System.out.println("Implicit Casting (int to double): " + implicitCast);
        System.out.println("Explicit Casting (double to int): " + explicitCast);

        sc.close();
    }
}