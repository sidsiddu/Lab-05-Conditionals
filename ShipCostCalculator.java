import java.util.Scanner;
public class ShipCostCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the price of the item: $");
        double itemPrice = in.nextDouble();
        double shippingCost;
        if (itemPrice >= 100.0) {
            shippingCost = 0.0; // Shipping is free
        } else {
            shippingCost = itemPrice * 0.02; // 2% of the item price
        }
        System.out.printf("Shipping Cost: $%.2f%n", shippingCost);
        System.out.printf("Total Price: $%.2f%n", itemPrice + shippingCost);
    }
}
