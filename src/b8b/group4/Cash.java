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
       public double CalculateSubtotalPrice(ArrayList<Item> products) {
        double subtotalPrice = 0.0;

        for (Item item : products) {
            subtotalPrice += item.price();
        }
        return subtotalPrice;
    }
}
