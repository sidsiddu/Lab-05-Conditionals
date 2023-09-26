import java.util.Scanner;
public class PartyAffiliation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Choose your party affiliation:");
        System.out.println("D: Democrat");
        System.out.println("R: Republican");
        System.out.println("I: Independent");
        System.out.print("Enter your choice (D, R, I): ");
        char choice = in.next().charAt(0);
        if(choice == 'D') {
            System.out.println("You get a Democratic Donkey.");
        } else if(choice == 'R') {
            System.out.println("You get a Republican Elephant.");
        } else if(choice == 'I') {
            System.out.println("You get an Independent Person.");
        } else {
            System.out.println("You get an Other.");
        }
    }
}
