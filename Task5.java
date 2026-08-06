public class Task5 {
    public static void main(String[] args) {

        // Implicit Type Casting
        int number = 25;
        double doubleNumber = number;

        System.out.println("Implicit Type Casting");
        System.out.println("Before Casting (int): " + number);
        System.out.println("After Casting (double): " + doubleNumber);

        System.out.println();

        // Explicit Type Casting
        double marks = 95.75;
        int intMarks = (int) marks;

        System.out.println("Explicit Type Casting");
        System.out.println("Before Casting (double): " + marks);
        System.out.println("After Casting (int): " + intMarks);
    }
}