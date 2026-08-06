import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Full Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter College Name: ");
        String college = sc.nextLine();

        System.out.print("Enter Branch: ");
        String branch = sc.nextLine();

        System.out.print("Enter City: ");
        String city = sc.nextLine();

        System.out.println("\n----- Student Details -----");
        System.out.println("Full Name : " + name);
        System.out.println("Age        : " + age);
        System.out.println("College    : " + college);
        System.out.println("Branch     : " + branch);
        System.out.println("City       : " + city);

        sc.close();
    }
}