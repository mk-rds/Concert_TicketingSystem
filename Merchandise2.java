package Assignment;

import java.util.Scanner;

/**
 *
 * @author Gigabyte
 */
public class Merchandise2 {

    public double subTotal;
    private static double itemPrice;
    public static double runningTotal;
    static boolean ordering = true;

            
    public static void menu() {
        System.out.println("Welcome \n1. BLACKPINK signed T-Shirts @ RM150 per pcs \n2. Taylor Swift signed Vinyl Records @ RM 300\n3. Jay Chou Action Figure @ RM 800 \n4. Purchase Complete");
    }

    public static double itemPrice(int merchItem) {
        if (merchItem == 1) {
            System.out.println("You've ordered Blackpink T shirt");
            itemPrice = 150.00;
        }
        if (merchItem == 2) {
            System.out.println("You've ordered Taylor Swift Vinyl Record ");
            itemPrice = 300.00;
        }
        if (merchItem == 3) {
            System.out.println("You've ordered Jay Chou Figurine ");
            itemPrice = 800.00;
        }
        quantity();
        return itemPrice;
    }

    public static double quantity() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter quantity");
        double quantity = input.nextDouble();
        subTotal(quantity, itemPrice);
        return quantity;
    }

    public static double subTotal(double quantity, double itemPrice) {
        double subTotal = quantity * itemPrice;
        System.out.println("Subtotal: " + subTotal);
        runningTotal += subTotal;
        return subTotal;
    }

    public static void done(double runningTotal) {
        ordering = false;
        System.out.println("Please come again, thank you!");
    }

    public static void main(String[] args) {

        int menuOption;
        int merchItem;
        Scanner input = new Scanner(System.in);
        do {
            double runningTotal2 = 0;
            menu();
            menuOption = input.nextInt();
            switch (menuOption) {
                case 1:
                    merchItem = 1;
                    runningTotal2 += itemPrice(merchItem);
                    break;
                case 2:
                    merchItem = 2;
                    runningTotal2 += itemPrice(merchItem);
                    break;
                case 3:
                    merchItem = 3;
                    runningTotal2 += itemPrice(merchItem);
                    break;
                case 4:
                    done(runningTotal);
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        } while (ordering);
        System.out.println("Total amount: " + runningTotal);
    }
}
