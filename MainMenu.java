/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import static assignment.Merchandise2.Selection;
import static assignment.Merchandise2.menu;
import static assignment.Calc_payment.TicketSold;
import static assignment.Calc_payment.revenue;
import static assignment.Interface.DisplayDetails;
import static assignment.Interface.DisplayTicketBP;
import static assignment.Interface.DisplayTicketJay;
import static assignment.Interface.DisplayTicketTaylor;
import static assignment.Interface.displayConcert;
import static assignment.Interface.selectConcert;
import static assignment.customer.login_verification;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class MainMenu {

    private customer customer;

    public MainMenu() {

    }

    public MainMenu(int i) {

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        customer cus = new customer();

        System.out.print("LOGIN [1]");
        int alternative;
        int option;
        int choose;
        option = input.nextInt();
        if (option == 1) {
            login_verification();
        }

        double quantity;
        int seat;

        do {
            System.out.println("\n[1] INTERFACE");
            System.out.println("[2] MERCHANDISE");
            System.out.println("[3] QUIT");

            alternative = input.nextInt();

            switch (alternative) {

                case 1:
                    do {
                        displayConcert();//display interface()
                        option = input.nextInt(); //select concert

                        switch (option) {
                            case 1:
                                selectConcert(option); //select concert
                                StockRemaining.displayBP_stock(); //display all seat remaining
                                DisplayTicketBP();
                                DisplayDetails(option);
                                break;

                            case 2:
                                selectConcert(option); //select concert
                                StockRemaining.displayJay_stock(); //display all seat remaining
                                DisplayTicketJay();
                                DisplayDetails(option);
                                break;

                            case 3:
                                selectConcert(option); //select concert
                                StockRemaining.displayTaylor_stock(); //display all seat remaining
                                DisplayTicketTaylor();
                                DisplayDetails(option);
                                break;

                            default:
                                System.out.println("wrong input");
                                break;

                        }

                    } while (option != 1 && option != 2 && option != 3);
                    break;

                case 2: {
                    do {
                        menu();
                        choose = input.nextInt();
                        Selection(choose);

                    } while (choose != 4);
                    break;

                }
                case 3: {
                    System.out.println("ticket sold number:" + TicketSold);
                    System.out.println("ticket sold revenue: " + revenue);
                    break;
                }
                default: {
                    System.out.println("wrong input ");
                    break;
                }

            }

        } while (alternative != 3);

    }
}

       
    }
}
