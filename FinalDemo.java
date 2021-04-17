/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finaldemo;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

/**
 *
 * @author mingkit
 */
public class FinalDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int select = 0, times = 0, what, option = 0, choose = 0, quantity = 0, total = 0, subtotalBP = 0, subtotalJay = 0, code = 0, selection = 0;
        double salary, plusSalary;
        boolean continueInput = true;
        String name, pswd, name1, pswd1, type = null;

        ticket[] ticket = {new ticket(10, 20, 30, 40, 50), //TICKET ARRAY
            new ticket(50, 50, 50, 50, 50)
        };

        Concert[] Concert = {new Concert("BLACKPINK ", "7 MARCH 2021", "KPOP SENSATION BLACKPINK RETURNS", "BUKIT JALIL STADIUM", "BLACKPINK", ticket[0]),
            new Concert("JAY CHOU", "4 march 2021", "COMEBACK CONCERT AFTER COVID", "BUKIT JALIL STADIUM", "JAY CHOU", ticket[1])
        };

        do {
            try {
                System.out.print("\t\t\t\t\t    How many purchases do you intend to make? ");             //ASK USER TO INPUT HOW MANY TIMES HE WANT
                times = input.nextInt();
                continueInput = false;

            } catch (InputMismatchException ex) {
                System.out.println("\n\t\t\t\t\t    [Try again please, only integers are allowed]\n");

                input.nextLine();
            }
        } while (continueInput);

        if (times <= 0) {
            times = 1;                                                             //IF USER INPUT LESS THAN 0 , TIMES AUTO = 1
            Record[] record = new Record[times];
            System.out.println("\t\t\t\t\t\t[Minimum amount is 1 time]");
        } else {
            Record[] record = new Record[times];
        }
        Record[] record = new Record[times];

        System.out.println("\n\n");
        do {
            do {
                try {
                    System.out.println("\t\t\t\t\t\t\t    MAIN MENU\n\t\t\t\t\t-------------------------------------------------------");
                    System.out.println("\t\t\t\t\t\t\t[1] Customer");
                    System.out.println("\t\t\t\t\t\t\t[2] Admin");
                    System.out.println("\n\t\t\t\t\tPress any key to exit the program (except 1 & 2)");
                    select = input.nextInt();                                                                   //SELECT USER OR ADMIN
                    continueInput = false;

                } catch (InputMismatchException ex) {
                    System.out.println("\n\t\t\t\t\t\t\t   [Try again please, only integers are allowed]\n");

                    input.nextLine();
                }
            } while (continueInput);
            switch (select) {
                case 1:
                    for (int i = 0; i < record.length; i++) {
                        //System.out.print("[1] REGISTER");                                      //USER CHOOSE REGISTER OR LOGIN
                        //System.out.print("[2] LOGIN");
                        //what = input.nextInt();

                        System.out.println("\t\t\t\t\t\t\t  Registration Page");
                        System.out.print("\n\t\t\t\t\tName\t\t: ");
                        name = input.next();

                        //get email
                        System.out.print("\t\t\t\t\tEmail address\t: ");
                        String email = input.next();
                        Register.emailVerify(email);
                        //email validation
                        while (Register.emailVerify(email) == false) {
                            System.out.println("\n\t\t\t\t\t\t\t   [Invalid Email!]\n");
                            System.out.println("\t\t\t\t\t\tEmail must contain '@' (e.g abc123@gmail.com)\n");
                            System.out.print("\t\t\t\t\tEmail address\t: ");
                            email = input.next();
                            Register.emailVerify(email);
                        }
                        System.out.println("\n\t\t\t\t\t\t\t   [Valid Email]\n");

                        // get password
                        System.out.print("\t\t\t\t\tPassword\t: ");
                        pswd = input.next();
                        Register.passwordVeify(pswd);
                        //password validation
                        while (Register.passwordVeify(pswd) == false) {
                            System.out.println("\n\t\t\t\t\t\t\t   [Invalid Password]\n");
                            System.out.println("\n\t\t\t\tInvalid Password, password must be alphanumeric, contain at least 7 characters" + "\n\t\t\t\t\t  and has symbols and a capital letter, please try again\n");
                            System.out.println("\t\t\t\t\t\t\t   [Try Again]\n");
                            System.out.print("\t\t\t\t\tPassword\t: ");
                            pswd = input.next();
                            Register.passwordVeify(pswd);
                        }

                        System.out.println("\n\t\t\t\t\t\t\t   [Valid Password]\n");
                        //confirm password
                        System.out.print("\t\t\t\t\tConfirm Password : ");
                        pswd1 = input.next();
                        Register.confirmPswd(pswd, pswd1);
                        //compare
                        while (Register.confirmPswd(pswd, pswd1) == false) {
                            System.out.println("\n\t\t\t\t\t\t\t[Password does not match!]\n");
                            System.out.print("\t\t\t\t\tConfirm Password : ");
                            pswd1 = input.next();
                            Register.confirmPswd(pswd, pswd1);
                        }

                        System.out.println("\n\t\t\t\t\t\t\t[Registration Successful!]\n");
                        Register register = new Register(name, email, pswd);

                        System.out.println("\t\t\t\t\t\t\t  Login Page");
                        System.out.print("\n\t\t\t\t\tName\t\t: ");
                        name1 = input.next();

                        while (name1.equals(name) == false) {
                            System.out.println("\n\t\t\t\t\t\t\t[Invalid Name]\n");
                            System.out.print("\n\t\t\t\t\tName\t\t: ");
                            name1 = input.next();

                        }

                        System.out.print("\t\t\t\t\tEmail address\t: ");
                        String email1 = input.next();

                        //email validation
                        while (email1.equals(email) == false) {
                            System.out.println("\n\t\t\t\t\t\t\t[Invalid Email]\n");
                            System.out.print("\t\t\t\t\tEmail address\t: ");
                            email1 = input.next();

                        }
                        System.out.println("\n\t\t\t\t\t\t\t[Valid Email]\n");
                        System.out.print("\n\t\t\t\t\tPassword\t: ");
                        pswd1 = input.next();

                        while (pswd1.equals(pswd) == false) {
                            System.out.println("\n\t\t\t\t\t\t\t[Invalid Password]\n");
                            System.out.print("\n\t\t\t\t\tPassword\t: ");
                            pswd1 = input.next();

                        }
                        System.out.println("\n\t\t\t\t\t\t\t[Login Successful!]\n");

                        user user = new user(name1, email1, pswd1);

                        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                        do {

                            try {
                                for (int a = 0; a < Concert.length; a++) {                                             //DISPLAY ALL CONCERT USING FOR LOOP               
                                    System.out.println("\t\t\t\t\t\t\t[" + (a + 1) + "] " + Concert[a].getConName());
                                }

                                System.out.print("\n\t\t\t\t\tPlease select a concert : ");
                                option = input.nextInt();
                                if (option != 1 && option != 2) {
                                    System.out.println("\t\t\t\t\t[Try Again,invalid selection]");                     //VALIDATION FOR SELECTING CONCERT

                                }

                            } catch (Exception ex) {
                                System.out.println("\n\t\t\t\t\t    [Try again please, only integers are allowed]\n");

                                input.nextLine();
                            }

                        } while (option != 1 && option != 2);

                        switch (option) {                                                                //CHOOSE WHAT CONCERT
                            case 1:                                                                     //SHOW FIRST CONCERT TICKET STOCK

                                do {
                                    do {
                                        try {

                                            System.out.println(Concert[option - 1]);                               //SHOW FIRST CONCERT DETAILS
                                            System.out.println("\n\n\t\t\t\t\t\tPress [1] to buy ticket " + "\n\t\t\t\t\t\tPress [2] to display the song list for this concert");

                                            selection = input.nextInt();
                                            if (selection != 1 && selection != 2) {
                                                System.out.println("\t\t\t\t\tTry Again,selection does not exist ");

                                            }
                                        } catch (Exception ex) {
                                            System.out.println("\n\t\t\t\t\t    [Try again please, only integers are allowed]\n");

                                            input.nextLine();
                                        }
                                    } while (selection != 1 && selection != 2);

                                    switch (selection) {
                                        case 1:
                                            do {
                                                try {
                                                    System.out.print("\n\t\t\t\t\tSelect ticket type : ");                      //CHOOSE WHAT TICKET TYPE
                                                    choose = input.nextInt();
                                                    continueInput = false;
                                                } catch (Exception ex) {
                                                    System.out.println("\n\t\t\t\t\t    [Try again please, only integers are allowed]\n");

                                                    input.nextLine();
                                                }
                                            } while (choose != 1 && choose != 2 && choose != 3 && choose != 4 && choose != 5);

                                            switch (choose) {
                                                case 1:
                                                    type = "CAT1";
                                                    do {
                                                        try {
                                                            System.out.print("\n\t\t\t\t\tQuantity : ");
                                                            quantity = input.nextInt();
                                                            continueInput = false;
                                                        } catch (Exception ex) {
                                                            System.out.println("\n\t\t\t\t\t    [Try again please, only integers are allowed]\n");

                                                            input.nextLine();
                                                        }
                                                    } while (continueInput);

                                                    if (ticket[option - 1].getCAT1() - quantity >= 0) {
                                                        ticket[option - 1].TicketStock(ticket, quantity, choose, option);
                                                        total = quantity * 900;

                                                        switch (option) {
                                                            case 1:
                                                                subtotalBP += total;
                                                                break;
                                                            case 2:
                                                                subtotalJay += total;
                                                                break;
                                                        }
                                                    } else {
                                                        quantity = 0;
                                                        total = 0;
                                                        System.out.print("\n\t\t\t\t\t\t\tINSUFFICIENT AMOUNT SELECTED\n");
                                                    }

                                                    ticket[option - 1].printReceipt(choose, Concert[option - 1], quantity, total);
                                                    break;

                                                case 2:
                                                    type = "CAT2";
                                                    do {
                                                        try {
                                                            System.out.print("\n\t\t\t\t\tQuantity : ");
                                                            quantity = input.nextInt();
                                                            continueInput = false;
                                                        } catch (Exception ex) {
                                                            System.out.println("\n\t\t\t\t\t    [Try again please, only integers are allowed]\n");

                                                            input.nextLine();
                                                        }
                                                    } while (continueInput);
                                                    if (ticket[option - 1].getCAT2() - quantity >= 0) {
                                                        ticket[option - 1].TicketStock(ticket, quantity, choose, option);
                                                        total = quantity * 800;

                                                        switch (option) {
                                                            case 1:
                                                                subtotalBP += total;
                                                                break;
                                                            case 2:
                                                                subtotalJay += total;
                                                                break;
                                                        }
                                                    } else {
                                                        quantity = 0;
                                                        total = 0;
                                                        System.out.print("\n\t\t\t\t\t\t\tINSUFFICIENT AMOUNT SELECTED\n");
                                                    }

                                                    ticket[option - 1].printReceipt(choose, Concert[option - 1], quantity, total);
                                                    break;

                                                case 3:
                                                    type = "CAT3";
                                                    do {
                                                        try {
                                                            System.out.print("\n\t\t\t\t\tQuantity : ");
                                                            quantity = input.nextInt();
                                                            continueInput = false;
                                                        } catch (Exception ex) {
                                                            System.out.println("\n\t\t\t\t\t    [Try again please, only integers are allowed]\n");

                                                            input.nextLine();
                                                        }
                                                    } while (continueInput);
                                                    if (ticket[option - 1].getCAT3() - quantity >= 0) {
                                                        ticket[option - 1].TicketStock(ticket, quantity, choose, option);
                                                        total = quantity * 700;

                                                        switch (option) {
                                                            case 1:
                                                                subtotalBP += total;
                                                                break;
                                                            case 2:
                                                                subtotalJay += total;
                                                                break;
                                                        }
                                                    } else {
                                                        quantity = 0;
                                                        total = 0;
                                                        System.out.print("\n\t\t\t\t\t\t\tINSUFFICIENT AMOUNT SELECTED\n");
                                                    }

                                                    ticket[option - 1].printReceipt(choose, Concert[option - 1], quantity, total);
                                                    break;

                                                case 4:
                                                    type = "CAT4";
                                                    do {
                                                        try {
                                                            System.out.print("\n\t\t\t\t\tQuantity : ");
                                                            quantity = input.nextInt();
                                                            continueInput = false;
                                                        } catch (Exception ex) {
                                                            System.out.println("\n\t\t\t\t\t    [Try again please, only integers are allowed]\n");

                                                            input.nextLine();
                                                        }
                                                    } while (continueInput);
                                                    if (ticket[option - 1].getCAT4() - quantity >= 0) {
                                                        ticket[option - 1].TicketStock(ticket, quantity, choose, option);
                                                        total = quantity * 600;

                                                        switch (option) {
                                                            case 1:
                                                                subtotalBP += total;
                                                                break;
                                                            case 2:
                                                                subtotalJay += total;
                                                                break;
                                                        }
                                                    } else {
                                                        quantity = 0;
                                                        total = 0;
                                                        System.out.print("\n\t\t\t\t\t\t\t[INSUFFICIENT AMOUNT SELECTED]\n");
                                                    }

                                                    ticket[option - 1].printReceipt(choose, Concert[option - 1], quantity, total);
                                                    break;

                                                case 5:
                                                    type = "CAT5";
                                                    do {
                                                        try {
                                                            System.out.print("\n\t\t\t\t\tQuantity : ");
                                                            quantity = input.nextInt();
                                                            continueInput = false;
                                                        } catch (Exception ex) {
                                                            System.out.println("\n\t\t\t\t\t    [Try again please, only integers are allowed]\n");

                                                            input.nextLine();
                                                        }
                                                    } while (continueInput);
                                                    if (ticket[option - 1].getCAT5() - quantity >= 0) {
                                                        ticket[option - 1].TicketStock(ticket, quantity, choose, option);
                                                        total = quantity * 500;

                                                        switch (option) {
                                                            case 1:
                                                                subtotalBP += total;
                                                                break;
                                                            case 2:
                                                                subtotalJay += total;
                                                                break;
                                                        }
                                                    } else {
                                                        quantity = 0;
                                                        total = 0;
                                                        System.out.print("\n\t\t\t\t\t\t\tINSUFFICIENT AMOUNT SELECTED\n");
                                                    }

                                                    ticket[option - 1].printReceipt(choose, Concert[option - 1], quantity, total);
                                                    break;

                                            }
                                            break;

                                        case 2:
                                            Concert[0].printSongListBP();
                                            System.out.println("\n\t\t\t\t\t\t Press any key to go back to previous page\n");
                                            String goBack = input.next();

                                            break;

                                        default:
                                            break;

                                    }
                                } while (selection != 1);
                                break;
                            //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////                             
                            case 2:

                                do {
                                    do {

                                        try {
                                            System.out.println(Concert[option - 1]);                               //SHOW FIRST CONCERT DETAILS
                                            System.out.println("\n\n\t\t\t\t\t\t\tPress [1] to buy ticket " + "\n\t\t\t\t\t\t\tPress [2] to display the song list for this concert");

                                            selection = input.nextInt();
                                            if (selection != 1 && selection != 2) {
                                                System.out.println("\t\t\t\t\t[Try Again,invalid selection]");

                                            }
                                        } catch (Exception ex) {
                                            System.out.println("\n\t\t\t\t\t    [Try again please, only integers are allowed]\n");

                                            input.nextLine();
                                        }
                                    } while (selection != 1 && selection != 2);

                                    switch (selection) {
                                        case 1:
                                            do {
                                                try {
                                                    System.out.print("\n\t\t\t\t\tSelect ticket type : ");                      //CHOOSE WHAT TICKET TYPE
                                                    choose = input.nextInt();
                                                    continueInput = false;
                                                } catch (Exception ex) {
                                                    System.out.println("\n\t\t\t\t\t    [Try again please, only integers are allowed]\n");

                                                    input.nextLine();
                                                }
                                            } while (choose != 1 && choose != 2 && choose != 3 && choose != 4 && choose != 5);
                                            switch (choose) {
                                                case 1:
                                                    type = "CAT1";
                                                    do {
                                                        try {
                                                            System.out.print("\n\t\t\t\t\tQuantity : ");
                                                            quantity = input.nextInt();
                                                            continueInput = false;
                                                        } catch (Exception ex) {
                                                            System.out.println("\n\t\t\t\t\t    [Try again please, only integers are allowed]\n");

                                                            input.nextLine();
                                                        }
                                                    } while (continueInput);
                                                    if (ticket[option - 1].getCAT1() - quantity >= 0) {
                                                        ticket[option - 1].TicketStock(ticket, quantity, choose, option);
                                                        total = quantity * 900;

                                                        switch (option) {
                                                            case 1:
                                                                subtotalBP += total;
                                                                break;
                                                            case 2:
                                                                subtotalJay += total;
                                                                break;
                                                        }
                                                    } else {
                                                        quantity = 0;
                                                        total = 0;
                                                        System.out.print("\n\t\t\t\t\t\t\t[INSUFFICIENT AMOUNT SELECTED]\n");
                                                    }

                                                    ticket[option - 1].printReceipt1(choose, Concert[option - 1], quantity, total);
                                                    break;

                                                case 2:
                                                    type = "CAT2";
                                                    do {
                                                        try {
                                                            System.out.print("\n\t\t\t\t\tQuantity : ");
                                                            quantity = input.nextInt();
                                                            continueInput = false;
                                                        } catch (Exception ex) {
                                                            System.out.println("\n\t\t\t\t\t    [Try again please, only integers are allowed]\n");

                                                            input.nextLine();
                                                        }
                                                    } while (continueInput);
                                                    if (ticket[option - 1].getCAT2() - quantity >= 0) {
                                                        ticket[option - 1].TicketStock(ticket, quantity, choose, option);
                                                        total = quantity * 800;

                                                        switch (option) {
                                                            case 1:
                                                                subtotalBP += total;
                                                                break;
                                                            case 2:
                                                                subtotalJay += total;
                                                                break;
                                                        }
                                                    } else {
                                                        quantity = 0;
                                                        total = 0;
                                                        System.out.print("\n\t\t\t\t\t\t\t[INSUFFICIENT AMOUNT SELECTED]\n");
                                                    }

                                                    ticket[option - 1].printReceipt1(choose, Concert[option - 1], quantity, total);
                                                    break;

                                                case 3:
                                                    type = "CAT3";
                                                    do {
                                                        try {
                                                            System.out.print("\n\t\t\t\t\tQuantity : ");
                                                            quantity = input.nextInt();
                                                            continueInput = false;
                                                        } catch (Exception ex) {
                                                            System.out.println("\n\t\t\t\t\t    [Try again please, only integers are allowed]\n");

                                                            input.nextLine();
                                                        }
                                                    } while (continueInput);
                                                    if (ticket[option - 1].getCAT3() - quantity >= 0) {
                                                        ticket[option - 1].TicketStock(ticket, quantity, choose, option);
                                                        total = quantity * 700;

                                                        switch (option) {
                                                            case 1:
                                                                subtotalBP += total;
                                                                break;
                                                            case 2:
                                                                subtotalJay += total;
                                                                break;
                                                        }
                                                    } else {
                                                        quantity = 0;
                                                        total = 0;
                                                        System.out.print("\n\t\t\t\t\t\t\t[INSUFFICIENT AMOUNT SELECTED]\n");
                                                    }

                                                    ticket[option - 1].printReceipt1(choose, Concert[option - 1], quantity, total);
                                                    break;

                                                case 4:
                                                    type = "CAT4";
                                                    do {
                                                        try {
                                                            System.out.print("\n\t\t\t\t\tQuantity : ");
                                                            quantity = input.nextInt();
                                                            continueInput = false;
                                                        } catch (Exception ex) {
                                                            System.out.println("\n\t\t\t\t\t    [Try again please, only integers are allowed]\n");

                                                            input.nextLine();
                                                        }
                                                    } while (continueInput);
                                                    if (ticket[option - 1].getCAT4() - quantity >= 0) {
                                                        ticket[option - 1].TicketStock(ticket, quantity, choose, option);
                                                        total = quantity * 600;

                                                        switch (option) {
                                                            case 1:
                                                                subtotalBP += total;
                                                                break;
                                                            case 2:
                                                                subtotalJay += total;
                                                                break;
                                                        }
                                                    } else {
                                                        quantity = 0;
                                                        total = 0;
                                                        System.out.print("\n\t\t\t\t\t\t\tINSUFFICIENT AMOUNT SELECTED\n");
                                                    }

                                                    ticket[option - 1].printReceipt1(choose, Concert[option - 1], quantity, total);
                                                    break;

                                                case 5:
                                                    type = "CAT5";
                                                    do {
                                                        try {
                                                            System.out.print("\n\t\t\t\t\tQuantity : ");
                                                            quantity = input.nextInt();
                                                            continueInput = false;
                                                        } catch (Exception ex) {
                                                            System.out.println("\n\t\t\t\t\t    [Try again please, only integers are allowed]\n");

                                                            input.nextLine();
                                                        }
                                                    } while (continueInput);
                                                    if (ticket[option - 1].getCAT5() - quantity >= 0) {
                                                        ticket[option - 1].TicketStock(ticket, quantity, choose, option);
                                                        total = quantity * 500;

                                                        switch (option) {
                                                            case 1:
                                                                subtotalBP += total;
                                                                break;
                                                            case 2:
                                                                subtotalJay += total;
                                                                break;
                                                        }
                                                    } else {
                                                        quantity = 0;
                                                        total = 0;
                                                        System.out.print("\n\t\t\t\t\t\t\tINSUFFICIENT AMOUNT SELECTED\n");
                                                    }

                                                    ticket[option - 1].printReceipt1(choose, Concert[option - 1], quantity, total);
                                                    break;

                                            }
                                            break;

                                        case 2:
                                            Concert[1].printSongListJay();
                                            System.out.println("\n\t\t\t\t\t\t Press any key to go back to previous page\n");
                                            String goBack = input.next();

                                            break;

                                        default:
                                            break;

                                    }
                                } while (selection != 1);
                                break;

                        }
                        TicketSystem ticketSystem = new TicketSystem(Concert[option - 1], type, quantity, total);
                        record[i] = new Record(user, ticketSystem);

                    }
                    break;

                case 2:

                    Staff[] Staffarr = new Staff[3];
                    Staffarr[0] = new Manager("hanshen", 2020, 500000, 600000, 100000000, 2001001);
                    Staffarr[1] = new ConcertAdmin("mingkit", 2021, 9000, 0.03, 100000, 1001001);
                    Staffarr[2] = new ConcertStocker("kenneth", 2021, 9000, 0.04, 5000, 1001002);

                    ArrayList<String> ConcertAdminList = new ArrayList<>();
                    ArrayList<String> ConcertStockerList = new ArrayList<>();
                    ArrayList<String> ConcertManagerList = new ArrayList<>();
                    ConcertAdminList.add("mingkit");
                    ConcertStockerList.add("kenneth");
                    ConcertManagerList.add("hanshen");

                    do {

                        System.out.print("\n\t\t\t\t\t\t\t  Select Category \n\n\t\t\t\t\t\t\t[1] Concert Admin \n\t\t\t\t\t\t\t[2] Concert Stocker \n\t\t\t\t\t\t\t[3] Manager \n\n\t\t\t\t\tPress any key (except 1-3) to return to main menu\t");
                        select = input.nextInt();

                        continueInput = false;

                        switch (select) {
                            case 1:
                                ConcertAdmin CA = new ConcertAdmin();
                                do {
                                    System.out.print("\n\t\t\t\t\tName\t\t: ");
                                    name = input.next();
                                    do {

                                        try {
                                            System.out.print("\t\t\t\t\tEnter code\t: ");
                                            code = input.nextInt();
                                            continueInput = false;
                                        } catch (InputMismatchException ex) {
                                            System.out.println("\n\t\t\t\t\t    [Try again please, only integers are allowed]\n");

                                            input.nextLine();
                                        }
                                    } while (continueInput);

                                    if (ConcertAdminList.contains(name) && CA.getCode() == code) {
                                        System.out.print("\n\t\t\t\t\t\t\tWelcome back " + name + "\n\n");
                                    } else {
                                        System.out.print("\n\t\t\t\t\t\t\t[Only CA's are allowed access!]");
                                    }
                                } while (ConcertAdminList.contains(name) == false || CA.getCode() == code == false);

                                do {
                                    do {

                                        try {
                                            System.out.println("\n\t\t\t\t\t\t\t[1] BlackPink Financial Report");
                                            System.out.println("\t\t\t\t\t\t\t[2] Jay Chou Financial Report");
                                            System.out.println("\t\t\t\t\t\t\t[3] Customer Record");
                                            System.out.println("\n\t\t\t\t\t\tPress any key (except 1-3) to return to the previous menu");

                                            option = input.nextInt();
                                            continueInput = false;
                                        } catch (InputMismatchException ex) {
                                            System.out.println("\n\t\t\t\t\t    [Try again please, only integers are allowed]\n");

                                            input.nextLine();
                                        }
                                    } while (continueInput);

                                    switch (option) {
                                        case 1:
                                            CA.ConcertDetails(Concert[0], subtotalBP, ticket[0]);
                                            break;
                                        case 2:
                                            CA.ConcertDetails(Concert[1], subtotalJay, ticket[1]);
                                            break;
                                        case 3:
                                            for (int i = 0; i < record.length; i++) {
                                                System.out.println(record[i]);
                                            }
                                            break;
                                        default:
                                            break;

                                    }
                                } while (option == 1 || option == 2 || option == 3);

                                break;

                            case 2:
                                ConcertStocker CS = new ConcertStocker();
                                int cat1 = 0,
                                 cat2 = 0,
                                 cat3 = 0,
                                 cat4 = 0,
                                 cat5 = 0;
                                do {
                                    System.out.print("\n\t\t\t\t\tName\t\t: ");
                                    name = input.next();
                                    do {

                                        try {
                                            System.out.print("\t\t\t\t\tEnter code\t: ");
                                            code = input.nextInt();
                                            continueInput = false;
                                        } catch (InputMismatchException ex) {
                                            System.out.println("\n\t\t\t\t\t    [Try again please, only integers are allowed]\n");

                                            input.nextLine();
                                        }
                                    } while (continueInput);

                                    if (ConcertStockerList.contains(name) && CS.getCode() == code) {
                                        System.out.print("\n\t\t\t\t\t\t\tWelcome back " + name + "\n\n");
                                    } else {
                                        System.out.print("\n\t\t\t\t\t\t\tOnly Concert Stockers are allowed access!");
                                    }
                                } while (ConcertStockerList.contains(name) == false || CS.getCode() == code == false);

                                do {
                                    do {

                                        try {
                                            System.out.println("\n\t\t\t\t\t\t\t[1] Add stock for blackpink ");
                                            System.out.println("\t\t\t\t\t\t\t[2] Add stock for jay chou");
                                            System.out.println("\n\t\t\t\t\t\tPress any key (except 1-2) to return to the previous menu");
                                            option = input.nextInt();
                                            continueInput = false;
                                        } catch (InputMismatchException ex) {
                                            System.out.println("\n\t\t\t\t\t    [Try again please, only integers are allowed]\n");

                                            input.nextLine();
                                        }
                                    } while (continueInput);

                                    switch (option) {
                                        case 1:
                                            System.out.println("\t\t\t\t\t\t\t         Current Stocks\n\t\t\t\t\t--------------------------------------------------------------------");
                                            System.out.println("\t\t\t\t\t\t " + ticket[0]);
                                            System.out.print("\n\t\t\t\t\tCAT 1\t\t: ");
                                            cat1 = input.nextInt();
                                            System.out.print("\n\t\t\t\t\tCAT 2\t\t: ");
                                            cat2 = input.nextInt();
                                            System.out.print("\n\t\t\t\t\tCAT 3\t\t: ");
                                            cat3 = input.nextInt();
                                            System.out.print("\n\t\t\t\t\tCAT 4\t\t: ");
                                            cat4 = input.nextInt();
                                            System.out.print("\n\t\t\t\t\tCAT 5\t\t: ");
                                            cat5 = input.nextInt();
                                            ConcertStocker.AddTicketStock(ticket[0], cat1, cat2, cat3, cat4, cat5);
                                            break;

                                        case 2:
                                            System.out.println("\t\t\t\t\t\t\t    Current Stocks");
                                            System.out.println("\t\t\t\t\t\t " + ticket[1]);
                                            System.out.print("\n\t\t\t\t\tCAT 1\t\t: ");
                                            cat1 = input.nextInt();
                                            System.out.print("\n\t\t\t\t\tCAT 2\t\t: ");
                                            cat2 = input.nextInt();
                                            System.out.print("\n\t\t\t\t\tCAT 3\t\t: ");
                                            cat3 = input.nextInt();
                                            System.out.print("\n\t\t\t\t\tCAT 4\t\t: ");
                                            cat4 = input.nextInt();
                                            System.out.print("\n\t\t\t\t\tCAT 5\t\t: ");
                                            cat5 = input.nextInt();
                                            ConcertStocker.AddTicketStock(ticket[1], cat1, cat2, cat3, cat4, cat5);
                                            break;

                                        default:
                                            break;
                                    }

                                } while (option == 1 || option == 2);
                                break;

                            case 3:
                                Manager M1 = new Manager();
                                do {
                                    System.out.print("\n\t\t\t\t\tName\t\t: ");
                                    name = input.next();
                                    do {

                                        try {
                                            System.out.print("\t\t\t\t\tEnter code\t: ");
                                            code = input.nextInt();
                                            continueInput = false;
                                        } catch (InputMismatchException ex) {
                                            System.out.println("\n\t\t\t\t\t    [Try again please, only integers are allowed]\n");

                                            input.nextLine();
                                        }
                                    } while (continueInput);
                                    if (ConcertManagerList.contains(name) && M1.getCode() == code) {
                                        System.out.print("\n\t\t\t\t\t\t\tWelcome back " + name + "\n\n");
                                    } else {
                                        System.out.print("\t\t\t\t\t[Only managers have authorization!]");
                                    }
                                } while (ConcertManagerList.contains(name) == false || M1.getCode() == code == false);

                                do {
                                    do {

                                        try {
                                            System.out.println("\n\n\t\t\t\t\t\t\t[1] Calculate Salary\n\t\t\t\t\t\t\t[2] Add Salary\n\t\t\t\t\t\t\t[3] Display job positions \n\n\t\t\t\t\t\tPress any key(except 1-3) to return to main menu\t");
                                            option = input.nextInt();
                                            continueInput = false;
                                        } catch (InputMismatchException ex) {
                                            System.out.println("\n\t\t\t\t\t    [Try again please, only integers are allowed]\n");

                                            input.nextLine();
                                        }
                                    } while (continueInput);

                                    switch (option) {
                                        case 1:
                                            for (int i = 0; i < Staffarr.length; i++) {
                                                System.out.println("\t\t\t\t\t\t\t[" + (i + 1) + "] " + Staffarr[i].getName());
                                            }
                                            do {

                                                try {
                                                    System.out.print("\n\t\t\t\t\t\tSelect staff that needs salary to be counted\n");
                                                    choose = input.nextInt();
                                                    continueInput = false;
                                                } catch (InputMismatchException ex) {
                                                    System.out.println("\n\t\t\t\t\t    [Try again please, only integers are allowed]\n");

                                                    input.nextLine();
                                                }
                                            } while (continueInput);

                                            switch (choose) {
                                                case 1:
                                                    for (int i = 0; i < Staffarr.length; i++) {
                                                        if (Staffarr[i] instanceof Manager) {
                                                            System.out.println("\n\t\t\t\t\t\t[" + Staffarr[i].getName() + "'s salary is RM " + ((Manager) Staffarr[i]).CalcSalary() + "]");
                                                        }
                                                    }
                                                    break;
                                                case 2:
                                                    for (int i = 0; i < Staffarr.length; i++) {
                                                        if (Staffarr[i] instanceof ConcertAdmin) {
                                                            System.out.println("\n\t\t\t\t\t\t[" + Staffarr[i].getName() + "'s salary is RM " + ((ConcertAdmin) Staffarr[i]).CalcSalary() + "]");
                                                        }
                                                    }
                                                    break;
                                                case 3:
                                                    for (int i = 0; i < Staffarr.length; i++) {
                                                        if (Staffarr[i] instanceof ConcertStocker) {
                                                            System.out.println("\n\t\t\t\t\t\t[" + Staffarr[i].getName() + "'s salary is RM " + ((ConcertStocker) Staffarr[i]).CalcSalary() + "]");
                                                        }
                                                    }
                                                    break;

                                                default:
                                                    break;

                                            }
                                            break;
                                        case 2:
                                            for (int i = 1; i < Staffarr.length; i++) {
                                                System.out.println("\t\t\t\t\t\t\t[" + (i) + "] " + Staffarr[i].getName());
                                            }
                                            do {

                                                try {
                                                    System.out.print("\n\t\t\t\t\t\tSelect staff that needs basic salary addition\n");
                                                    choose = input.nextInt();
                                                    continueInput = false;
                                                } catch (InputMismatchException ex) {
                                                    System.out.println("\n\t\t\t\t\t    [Try again please, only integers are allowed]\n");

                                                    input.nextLine();
                                                }
                                            } while (continueInput);

                                            switch (choose) {

                                                case 1:
                                                    System.out.println("\t\t\t\t\t\t\t    SALARY ADDITION\n\t\t\t\t\t-------------------------------------------------------");
                                                    System.out.println("\t\t\t\t\t\t" + Staffarr[1].getName() + "'s salary now is RM" + Staffarr[1].getBasicSalary());
                                                    System.out.print("\n\t\t\t\t\t\tHow much to be added(basic) : ");
                                                    salary = input.nextInt();
                                                    Staffarr[1].depositSalary(salary);
                                                    System.out.println("\n\t\t\t\t\t\t" + Staffarr[1].getName() + "'s salary after addition is RM " + Staffarr[1].getBasicSalary());
                                                    break;
                                                case 2:
                                                    System.out.println("\t\t\t\t\t\t\t    SALARY ADDITION\n\t\t\t\t\t-------------------------------------------------------");
                                                    System.out.println("\t\t\t\t\t\t" + Staffarr[2].getName() + "'s salary now is : " + Staffarr[2].getBasicSalary());
                                                    System.out.print("\n\t\t\t\t\t\tHow much to be added(basic) : ");
                                                    salary = input.nextInt();
                                                    Staffarr[2].depositSalary(salary);
                                                    System.out.println("\n\t\t\t\t\t\t" + Staffarr[2].getName() + "'s salary after addition is RM " + Staffarr[2].getBasicSalary());
                                                    break;

                                                default:
                                                    break;

                                            }
                                            break;

                                        case 3:
                                            Object[] objects = {new Manager(), new ConcertAdmin(), new ConcertStocker()};
                                            System.out.println("\t\t\t\t\t\t\t    JOB POSITIONS\n\t\t\t\t\t-------------------------------------------------------");
                                            for (int i = 0; i < objects.length; i++) {
                                                if (objects[i] instanceof jobPosition) {
                                                    System.out.println(((jobPosition) objects[i]).jobPosition());
                                                }
                                            }

                                            break;

                                        case 4:
                                            M1.Calc_revenuePercentange(subtotalBP, subtotalJay);
                                            break;
                                    }

                                } while (option == 1 || option == 2 || option == 3 || option == 4);
                                break;

                            default:
                                break;
                        }
                    } while (select == 1 || select == 2 || select == 3);
                    break;

                default:
                    break;

            }

        } while (select == 1 || select == 2);

    }

}