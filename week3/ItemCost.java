import java.util.Scanner;

public class ItemCost {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter item name: ");
        String itemName = input.nextLine();

        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();

        System.out.print("Enter unit price: ");
        double unitPrice = input.nextDouble();

        if (quantity <= 0 || unitPrice < 0) {
            System.out.println("Invalid input: quantity must be above 0 and price cannot be negative.");
        } else {
            double totalCost = quantity * unitPrice;

            System.out.println("\n--- PURCHASE SUMMARY ---");
            System.out.println("Item: " + itemName);
            System.out.println("Quantity: " + quantity);
            System.out.printf("Unit price: %.2f%n", unitPrice);
            System.out.printf("Total cost: %.2f%n", totalCost);
        }
    }
}