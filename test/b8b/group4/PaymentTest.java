
package b8b.group4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author juman
 */
public class PaymentTest {
    
    public PaymentTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

      /**
     * Test of setPaymentMethod method, of class Payment.
     */
    @Test
    public void testSetPaymentMethod() {
        System.out.println("setPaymentMethod");
        Payment instance = new Payment("card");
        String paymentMethod = "cash";
        instance.setPaymentMethod(paymentMethod);
        String expResult = "cash";
        String result = instance.getPaymentMethod();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPaymentMethod method, of class Payment.
     */
    @Test
    public void testGetPaymentMethod() {
        System.out.println("getPaymentMethod");
        Payment instance = new Payment("cash");
        String expResult = "cash";
        String result = instance.getPaymentMethod();
        assertEquals(expResult, result);
    }

    /**
     * Test of CalculateSubtotalPrice method, of class Payment.
     */
    @Test
    public void testCalculateSubtotalPrice() {
        System.out.println("CalculateSubtotalPrice");
        ArrayList<Item> products = new ArrayList<>();
        products.add(new Item("tart_cookies",10,8));
        products.add(new Item("cup_cookies",5,20));
        ArrayList<Integer> productsQuantity = new ArrayList<>();
        productsQuantity.add(2);
        productsQuantity.add(10);
        Payment instance = new Payment("cash");
        double expResult = 70.0;
        double result = instance.CalculateSubtotalPrice(products, productsQuantity);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of CalculateTax method, of class Payment.
     */
    @Test
    public void testCalculateTax() {
        System.out.println("CalculateTax");
        double price = 70.0;
        Payment instance = new Payment("cash");
        double expResult = 10.5;
        double result = instance.CalculateTax(price);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of cardInformation method, of class Payment.
     */
    @Test
    public void testCardInformation() throws ParseException {
        System.out.println("cardInformation");
        String cardNumber = "1234567890123456";
        String CVV = "333";
        Date expiryDate = new SimpleDateFormat("MM/yyyy").parse("11/2024");
        Payment instance = new Payment("card");
        boolean expResult = true;
        boolean result = instance.cardInformation(cardNumber, CVV, expiryDate);
        assertTrue(result);
    }
    @Test
    public void testCardInformationWrongNumber() throws ParseException {
        System.out.println("cardInformation");
        String cardNumber = "123456789012345678";
        String CVV = "333";
        Date expiryDate = new SimpleDateFormat("MM/yyyy").parse("11/2023");
        Payment instance = new Payment("card");
        boolean result = instance.cardInformation(cardNumber, CVV, expiryDate);
        assertFalse(result);
        
    }
    @Test
    public void testCardInformationWrongCVV() throws ParseException {
        System.out.println("cardInformation");
        String cardNumber = "1234567890123456";
        String CVV = "9933";
        Date expiryDate = new SimpleDateFormat("MM/yyyy").parse("11/2023");
        Payment instance = new Payment("card");
        boolean result = instance.cardInformation(cardNumber, CVV, expiryDate);
        assertFalse(result);
    }
    @Test
    public void testCardInformationWrongDate() throws ParseException {
        System.out.println("cardInformation");
        String cardNumber = "1234567890123456";
        String CVV = "333";
        Date expiryDate = new SimpleDateFormat("MM/yyyy").parse("11/2019");
        Payment instance = new Payment("card");
        boolean result = instance.cardInformation(cardNumber, CVV, expiryDate);
        assertFalse(result);
    }

    /**
     * Test of printInvoice method, of class Payment.
     */
//    @Test
//    public void testPrintInvoice() {
//        System.out.println("printInvoice");
//        ArrayList<Item> products = null;
//        ArrayList<Integer> productsQuantity = null;
//        Payment instance = null;
//        instance.printInvoice(products, productsQuantity);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
