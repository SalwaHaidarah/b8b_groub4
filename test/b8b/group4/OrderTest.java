
package b8b.group4;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USER
 */
public class OrderTest {
    
    public OrderTest() {
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
     * Test of setProducts method, of class Order.
     */
    @Test
    public void testSetProducts() {
        System.out.println("setProducts");
        ArrayList<Item> products = new ArrayList<>();
        products.add(new Item("cup_cookies", 5, 20));
        Order instance = new Order();
        instance.setProducts(products);
        ArrayList<Item> result = instance.getProducts();
        ArrayList<Item> expResult = products;
        assertEquals(expResult, result);
    }

    /**
     * Test of getProducts method, of class Order.
     */
    @Test
    public void testGetProducts() {
        System.out.println("getProducts");
        Order instance = new Order();
        Item Item =new Item("cup_cookies", 5, 2); 
        instance.products.add(Item);
        ArrayList<Item> expResult = new ArrayList<>();
        expResult.add(Item);
        ArrayList<Item> result = instance.getProducts();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getProductsQuantity method, of class Order.
     */
    @Test
    public void testGetProductsQuantity() {
        System.out.println("getProductsQuantity");
        Order instance = new Order();
        instance.productsQuantity.add(3);
        ArrayList<Integer> expResult =new ArrayList<>();
        expResult.add(3);
        ArrayList<Integer> result = instance.getProductsQuantity();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setProductsQuantity method, of class Order.
     */
    @Test
    public void testSetProductsQuantity() {
        System.out.println("setProductsQuantity");
        ArrayList<Integer> productsQuantity = new ArrayList<>();
        productsQuantity.add(3);
        Order instance = new Order();
        instance.setProductsQuantity(productsQuantity);
        ArrayList<Integer> result = instance.getProductsQuantity();
        ArrayList<Integer> expResult = productsQuantity;
        assertEquals(expResult, result);
    }

    /**
     * Test of getPayment method, of class Order.
     */
    @Test
    public void testGetPayment() {
        System.out.println("getPayment");
        Order instance = new Order();
        Payment pay = new Payment("Credit Card");
        instance.setPayment(pay);
        Payment expResult = pay;
        Payment result = instance.getPayment();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setPayment method, of class Order.
     */
    @Test
    public void testSetPayment() {
        System.out.println("setPayment");
        Payment payment = new Payment("Credit Card");
        Order instance = new Order();
        instance.setPayment(payment);
        Payment expResult = payment;
        Payment result = instance.getPayment();
        assertEquals(expResult, result);
    }

    /**
     * Test of addItemToOrders method, of class Order.
     */
    @Test
    public void testAddItemToOrders() {
        System.out.println("addItemToOrders");
        Item.items.add(new Item("cup_cookies", 3, 10));
        String itemName = "cup_cookies";
        int customerQuantity = 3;
        Order instance = new Order();
        instance.addItemToOrders(itemName, customerQuantity);
        String expResult = "Item added to cart successfully";
        String result = instance.addItemToOrders(itemName, customerQuantity);
        assertEquals(expResult, result); 
    }
    @Test
    public void testAddItemToOrdersEnough() {
        System.out.println("addItemToOrders");
        Item.items.add(new Item("classic_cookies", 7, 3));
        String itemName = "classic_cookies";
        int customerQuantity = 5;
        Order instance = new Order();
        instance.addItemToOrders(itemName, customerQuantity);
        String expResult = "We have only 3 classic_cookies";
        String result = instance.addItemToOrders(itemName, customerQuantity);
        assertEquals(expResult, result); 
    }
    @Test
    public void testAddItemToOrdersNo() {
        System.out.println("addItemToOrders");
        Item.items.add(new Item("cookies", 7, 3));
        String itemName = "cake";
        int customerQuantity = 5;
        Order instance = new Order();
        instance.addItemToOrders(itemName, customerQuantity);
        String expResult = "Sorry, we do not have this product";
        String result = instance.addItemToOrders(itemName, customerQuantity);
        assertEquals(expResult, result); 
    }

    /**
     * Test of itemAvailability method, of class Order.
     */
    @Test
    public void testItemAvailability() {
        System.out.println("itemAvailability");
        Item item = new Item("cup_cookies", 3, 3);
        int userQuantity = 1;
        Order instance = new Order();
        boolean result = instance.itemAvailability(item, userQuantity);
        assertTrue(result);
    }
    @Test
    public void testItemAvailabilityNot() {
        System.out.println("itemAvailability");
        Item item = new Item("cup_cookies", 10, 3);
        int userQuantity = 5;
        Order instance = new Order();
        boolean result = instance.itemAvailability(item, userQuantity);
        assertFalse(result);
    }

    /**
     * Test of finish method, of class Order.
     */
    @Test
    public void testFinish() {
        System.out.println("finish");
        Order instance = new Order();
        instance.setPayment(new Payment("Credit Card"));
        instance.finish();
        
    }
    
}
