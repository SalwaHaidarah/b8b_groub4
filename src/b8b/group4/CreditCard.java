package b8b.group4;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Seren
 */
public class CreditCard extends Payment{
    private double discount = 10;
    
    public CreditCard() {
    }
    
    //METHODS : to chick if the information of the cridt card is valid or not.
    public static boolean cardInformation(String cardNumber, String CVV, Date expiryDate) {
        boolean cardNUmberValid = false, CVVvalid = false, expiryDateValid = false;

        if (cardNumber.length() == 16
                && Character.isDigit(cardNumber.charAt(0))
                && Character.isDigit(cardNumber.charAt(1))
                && Character.isDigit(cardNumber.charAt(2))
                && Character.isDigit(cardNumber.charAt(3))
                && Character.isDigit(cardNumber.charAt(4))
                && Character.isDigit(cardNumber.charAt(5))
                && Character.isDigit(cardNumber.charAt(6))
                && Character.isDigit(cardNumber.charAt(7))
                && Character.isDigit(cardNumber.charAt(8))
                && Character.isDigit(cardNumber.charAt(9))
                && Character.isDigit(cardNumber.charAt(10))
                && Character.isDigit(cardNumber.charAt(11))
                && Character.isDigit(cardNumber.charAt(12))
                && Character.isDigit(cardNumber.charAt(13))
                && Character.isDigit(cardNumber.charAt(14))
                && Character.isDigit(cardNumber.charAt(15))) {
            cardNUmberValid = true;
        }

        if (CVV.length() == 3
                && Character.isDigit(cardNumber.charAt(0))
                && Character.isDigit(cardNumber.charAt(1))
                && Character.isDigit(cardNumber.charAt(2))) {
            CVVvalid = true;
        }

        Date today = Calendar.getInstance().getTime();
        if (expiryDate.after(today)) {
            expiryDateValid = true;
        }

        return (cardNUmberValid && CVVvalid && expiryDateValid);
    }
    
    //METHODS : to Calculate and return the Subtotal Price
    @Override
  public double CalculateSubtotalPrice(ArrayList<Item> products) {
        double subtotalPrice = 0.0;

        for (Item item : products) {
            subtotalPrice += item.price();
        }
        subtotalPrice = subtotalPrice - (subtotalPrice*(discount/100));
        return subtotalPrice;
    }
}
