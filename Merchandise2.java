package Assignment;

import static assignment.StockRemaining.MerchStock_1;
import static assignment.StockRemaining.MerchStock_2;
import static assignment.StockRemaining.MerchStock_3;
import static assignment.StockRemaining.merch_1;
import static assignment.StockRemaining.merch_2;
import static assignment.StockRemaining.merch_3;
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
    public static double quantity2;
    public static String c1 = String.format("\n1) BLACKPINK CONCERT" + "           2) TAYLOR SWIFT CONCERT" + "                      3) JAY CHOU CONCERT" + "          4) PURCHASE COMPLETE/EXIT");
    public static String c2 = String.format("\n   BLACKPINK SIGNED T-SHIRTS" + "      TAYLOR SWIFT SIGNED VINYL ALBUM RECORDS" + "      JAY CHOU ACTION FIGURE");
    public static String c3 = String.format("\n   RM 150 per T-SHIRT " + "            RM 300 per RECORD" + "                            RM 800 per FIGURE");

    public static void menu() {
        System.out.print(c1);
        System.out.print(c2);
        System.out.println(c3);
        System.out.println("   Stocks Remaining : " + (int) merch_1 + "         Stocks Remaining : " + (int) merch_2 + "                       Stocks Remaining : " + (int) merch_3 );
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
        Merchandise2.quantity2 = input.nextDouble();
        subTotal(quantity2, itemPrice);
        return quantity2;
    }

    public static double subTotal(double quantity, double itemPrice) {
        double subTotal = quantity * itemPrice;
        System.out.println("Subtotal: RM " + subTotal);
        runningTotal += subTotal;
        return subTotal;
    }

    public static void done(double runningTotal) {
        ordering = false;

        System.out.println("Total purchased : RM " + runningTotal);
        System.out.println("Please come again, thank you!");
    }

    public static void Selection(int option) {

        int menuOption;
        int merchItem;

        switch (option) {
            case 1:
                merchItem = 1;

                itemPrice(merchItem);
                MerchStock_1(quantity2);
                break;
            case 2:
                merchItem = 2;

                itemPrice(merchItem);
                MerchStock_2(quantity2);
                break;
            case 3:
                merchItem = 3;

                itemPrice(merchItem);
                MerchStock_3(quantity2);
                break;
            case 4:
                done(runningTotal);
                break;
            default:
                System.out.println("Invalid option.");
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int option;
        int choose;

        do {
            menu();
            choose = input.nextInt();
            Selection(choose);

        } while (choose != 4);
    }
}
