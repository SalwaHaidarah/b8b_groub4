package b8b.group4;

import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;
import static b8b.group4.Customer.*;

public class PleaseCookies {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, ParseException {

        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        Administrator admin = Administrator.getInstace(); //Singlton

        printHead(); //mine to choose if you are 1/admin or 2/customer
        int number = input.nextInt();

        //choose1 --> Admin
        //---------------------------------------------------------------------------------------
        if (number == 1) {

            System.out.print("Enter username: ");//should be Kh_99
            String name = input.next();
            System.out.print("Enter password: ");//should be 1234
            String Password = input.next();

            //chick if the username and pass correct -->admin
            if (name.equals(admin.getUserName()) && (Password.endsWith(admin.getPassword()))) {
                int adminInput = 0;
                while (adminInput != 4) {
                    printAdminHeader();//show the services to the admin
                    adminInput = input.nextInt();

                    if (adminInput == 1) { // ADD ITEM.
                        System.out.print("Enter item name: ");
                        String itemName = input.next();
                        System.out.print("Enter item price: ");
                        double itemPrice = input.nextDouble();
                        System.out.print("Enter item quantity: ");
                        int itemQuantity = input.nextInt();
                        //          Item newItem = new Item(itemName, itemPrice, itemQuantity);
                        //            System.out.println(Item.addNewItem(newItem));
                        //            } else if (adminInput == 2) { // DELETE ITEM.
                        //               System.out.print("Enter item name to delete: ");
                        //               System.out.println(Item.deleteItem(input.next()));
                        //             } else if (adminInput == 3) { // show ITEMS.
                        //                   Item.printItems();
                    }
                }
            } else {
                System.out.println("Wrong user name or password");
            }

            //choose2 --> Customer
            //---------------------------------------------------------------------------------------
        } else if (number == 2) {
            boolean finish = true;
            int coustomeOption = 0;
            while (coustomeOption != 3) {
                printCustomerOptions();//show the services to the cusromer
                coustomeOption = input.nextInt();

                if (coustomeOption == 1) {//Create account

                    System.out.print("Enter your username: ");
                    String username = input.next();
                    System.out.print("Enter your passowrd: ");
                    String password = input.next();
                    System.out.print("Enter your first name: ");
                    String firstName = input.next();
                    System.out.print("Enter your last name: ");
                    String lastName = input.next();
                    System.out.print("Enter your address: ");
                    String address = input.next();

                    customers.add(new Customer(username, password, firstName, lastName, address));

                } else if (coustomeOption == 2) {//Login

                    System.out.print("Enter username: ");
                    String username = input.next();
                    System.out.print("Enter password: ");
                    String Password = input.next();

                    Customer currentCustomer = searchCustomer(username, Password);

                    if (currentCustomer == null) {
                        System.out.println("you have to regester first!");
                    } else {
                        System.out.println("---------------------------------------------------");
                        System.out.println("welcome " + currentCustomer.getUserName() + ", our cookies is waiting for you enjoy!");
                        System.out.println("---------------------------------------------------");

                        int customerInput = 0;
                        OrderBuilder order1 = new OrderBuilder();
                        while (customerInput != 4) {
                            printCustomerHeader();
                            customerInput = input.nextInt();
                            if (customerInput == 1) { //Build order
                                customerInput = 0;
                                System.out.println("---------------------------------------------------");
                                System.out.println("                please cookies system              ");
                                System.out.println("---------------------------------------------------");

                                while (customerInput != 5) {
                                    System.out.println("choose your order:");
                                    System.out.println(" 1) Cup cookies");
                                    System.out.println(" 2) Stuffed cookies");
                                    System.out.println(" 3) Tart cookies");
                                    System.out.println(" 4) Regular cookies");
                                    System.out.println(" 5) Done");
                                    System.out.println("-----------------------------------------------");
                                    customerInput = input.nextInt();
                                    if (customerInput == 5) {
                                        break;
                                    }
                                    System.out.println("Would you like to add sprinkles to your cookies?(yes or no)");
                                    String sprinkles = input.next(); // Decorate Order
                                    if (sprinkles.equalsIgnoreCase("no")) {

                                        switch (customerInput) {

                                            case 1:

                                                order1.a();
                                                System.out.println("Item added successfully");
                                                break;
                                            case 2:
                                                order1.b();
                                                System.out.println("Item added successfully");
                                                break;
                                            case 3:
                                                order1.c();
                                                System.out.println("Item added successfully");
                                                break;
                                            case 4:
                                                order1.d();
                                                System.out.println("Item added successfully");
                                                break;
                                        }
                                    } else if (sprinkles.equalsIgnoreCase("yes")) {
                                        switch (customerInput) {

                                            case 1:

                                                order1.CookieOrders(new WithSprinkles(new Cup_cookies()));
                                                System.out.println("Item added successfully");
                                                break;
                                            case 2:
                                                order1.CookieOrders(new WithSprinkles(new Stuffed_cookies()));
                                                System.out.println("Item added successfully");
                                                break;
                                            case 3:
                                                order1.CookieOrders(new WithSprinkles(new Tart_cookies()));
                                                System.out.println("Item added successfully");
                                                break;
                                            case 4:
                                                order1.CookieOrders(new WithSprinkles(new Regular_cookies()));
                                                System.out.println("Item added successfully");
                                                break;

                                        }
                                    }
                                }

                            } else if (customerInput == 2) { //FINISH ORDER
                                currentCustomer.setNewOrder(order1.order);
                                printPymentMethods();
                                System.out.print("Please enter payment method: ");
                                int paymentMethod = input.nextInt();

                                if (paymentMethod == 1) { //Cridet card
                                    Context context = new Context(new CreditCard());
                                    boolean valid = true;
                                    do {

                                        System.out.print("Please enter card number: ");
                                        String cardNumber = input.next();
                                        System.out.print("Please enter CVV: ");
                                        String cardCVV = input.next();
                                        System.out.print("Please enter expiry date(MM/yyyy): ");
                                        String ExpiryDate = input.next();
                                        Date cardExpiryDate = new SimpleDateFormat("MM/yyyy").parse(ExpiryDate);

                                        valid = CreditCard.cardInformation(cardNumber, cardCVV, cardExpiryDate);
                                        if (valid) {
                                            System.out.println("valid card.");
                                        } else {
                                            System.out.println("Sorry, your card information is wrong! Try again");
                                        }
                                    } while (!valid);
                                    context.executeStrategy(currentCustomer.getNewOrder().getProducts());

                                } else if (paymentMethod == 2) { //Cash
                                    Context context = new Context(new Cash());
                                    context.executeStrategy(currentCustomer.getNewOrder().getProducts());
                                }

                                System.out.print("Can you share your opinion about our cookies(yes or no): ");
                                if (input.next().equalsIgnoreCase("yes")) {
                                    System.out.print("review: ");
                                    String customerReview = input2.nextLine();
                                }
                                break;

                            } else if (customerInput == 3) { //SHOW CART
                                System.out.println("                Your Cart                ");
                                order1.order.showItems();

                            }
                        }
                        break;
                    }
                }
            }
        }
    }

    public static void printHead() {
        System.out.println("---------------------------------------------------");
        System.out.println("                please cookies system               ");
        System.out.println("---------------------------------------------------");
        System.out.println(" 1) Admin.");
        System.out.println(" 2) Customer.");
        System.out.println("---------------------------------------------------");
        System.out.print(">> ");

    }

    public static void printCustomerOptions() {
        System.out.println("---------------------------------------------------");
        System.out.println("                please cookies system               ");
        System.out.println("---------------------------------------------------");
        System.out.println(" 1) Create new acount.");
        System.out.println(" 2) Log in.");
        System.out.println(" 3) Exit.");
        System.out.println("---------------------------------------------------");
        System.out.print(">> ");

    }

    public static void printAdminHeader() {
        System.out.println("---------------------------------------------------");
        System.out.println("                please cookies system               ");
        System.out.println("---------------------------------------------------");
        System.out.println(" 1) Add new item.");
        System.out.println(" 2) Delete item.");
        System.out.println(" 3) show items.");
        System.out.println(" 4) Exit.");
        System.out.println("---------------------------------------------------");
        System.out.print(">> ");

    }

    public static void printCustomerHeader() {
        System.out.println("---------------------------------------------------");
        System.out.println("                please cookies system               ");
        System.out.println("---------------------------------------------------");
        System.out.println(" 1) Add item.");
        System.out.println(" 2) Finish order.");
        System.out.println(" 3) Show cart.");
        System.out.println(" 4) Exit.");
        System.out.println("---------------------------------------------------");
        System.out.print(">> ");
    }

    public static void printPymentMethods() {
        System.out.println("---------------------------------------------------");
        System.out.println("                please cookies system               ");
        System.out.println("---------------------------------------------------");
        System.out.println(" 1) Credit Card(Discount 5%)");
        System.out.println(" 2) Cash");
        System.out.println("---------------------------------------------------");
    }
}
