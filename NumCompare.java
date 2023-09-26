import java.util.Scanner;
public class NumCompare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        if(!in.hasNextDouble()) {
            System.out.println("Please enter a valid number and try again.");
            return;
        }
        double first = in.nextDouble();
        System.out.print("Enter second number: ");
        if(!in.hasNextDouble()) {
            System.out.println("Please enter a valid number and try again.");
            return;
        }
        double second = in.nextDouble();
        if(first == second) {
            System.out.println("Both numbers are equal.");
        } else if(first < second) {
            System.out.println(first + " is less than " + second + ".");
        } else {
            System.out.println(second + " is less than " + first + ".");
        }
    }
}
