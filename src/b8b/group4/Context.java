package b8b.group4;

import java.util.ArrayList;

/**
 *
 * @author Seren
 */
public class Context {

    private Payment payment;

    public Context(Payment payment) {
        this.payment = payment;
    }

    public void executeStrategy(ArrayList<Item> products, ArrayList<Integer> productsQuantity) {
        payment.printInvoice(products, productsQuantity);
    }
}
