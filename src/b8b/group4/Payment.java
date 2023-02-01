package b8b.group4;

import java.util.ArrayList;

public abstract class Payment {

//CONSREUCTOR
    public Payment() {
    }

//METHODS : Abstract method to Calculate and return the Subtotal Price(the implementation in the subclasses)
    public abstract double CalculateSubtotalPrice(ArrayList<Item> products);
    
//METHODS : to Calculate the tax 
    public double CalculateTax(double price) {
        return (price * 0.15);
    }

//METHODS : print the invice of the customer 
    public void printInvoice(ArrayList<Item> products) {

        double subtotalPrice = CalculateSubtotalPrice(products);
        double tax = CalculateTax(subtotalPrice);

        System.out.println("---------------------------------------------------------\n"
                + "                    PLEASE COOKIES                       \n"
                + "---------------------------------------------------------\n"
                + "     Item name               Price             ");
        for (int i = 0; i < products.size(); i++) {
            System.out.println("     " + products.get(i).name() + "                   " + products.get(i).price());
        }
        System.out.println("     " + "Total price                           " + subtotalPrice + "\n"
            + "     " + "Tax                                   " + tax + "\n"
                + "     " + "Total price                           " + (subtotalPrice + tax));
        System.out.println("\n---------------------------------------------------------\n              THANK YOU (:");
    }
}
