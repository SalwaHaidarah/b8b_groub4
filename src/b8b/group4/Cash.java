package b8b.group4;

import java.util.ArrayList;

/**
 *
 * @author Seren
 */
public class Cash extends Payment{
    
    public Cash() {
    }
 
    //METHODS : to Calculate and return the Subtotal Price
    @Override
    public double CalculateSubtotalPrice(ArrayList<Item> products, ArrayList<Integer> productsQuantity) {
        double subtotalPrice = 0;
        for (int i = 0; i < products.size(); i++) {
            double price = products.get(i).getPrice() * productsQuantity.get(i);
            subtotalPrice += price;
        }
        return subtotalPrice;
    }
}
