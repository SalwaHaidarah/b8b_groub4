/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b8b.group4;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ASUS
 */
public class CustomerTest {
    
    public CustomerTest() {
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
     * Test of getUserName method, of class Customer.
     */
    @Test
    public void testGetUserName() {
        System.out.println("getUserName");
        Customer instance = new Customer("Serene_878", "123", "serene", "salah", "alsafa");
        String expResult = "Serene_878";
        String result = instance.getUserName();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setUserName method, of class Customer.
     */
    @Test
    public void testSetUserName() {
        System.out.println("setUserName");
        Customer instance = new Customer("Serene_", "123", "serene", "salah", "alsafa");
        String userName = "Serene_878";
        instance.setUserName(userName);
        String expResult = "Serene_878";
        String result = instance.getUserName();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getPassword method, of class Customer.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        Customer instance = new Customer("Serene_878", "123", "serene", "salah", "alsafa");
        String expResult = "123";
        String result = instance.getPassword();
        assertEquals(expResult, result);
      
    }

    /**
     * Test of setPassword method, of class Customer.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        Customer instance =new Customer("Serene_878", "111", "serene", "salah", "alsafa");
        String password = "123";
        instance.setPassword(password);
        String expResult = "123";
        String result = instance.getPassword();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getCustomerFirstName method, of class Customer.
     */
    @Test
    public void testGetCustomerFirstName() {
        System.out.println("getCustomerFirstName");
        Customer instance = new Customer("Serene_878", "123", "serene", "salah", "alsafa");
        String expResult = "serene";
        String result = instance.getCustomerFirstName();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setCustomerFirstName method, of class Customer.
     */
    @Test
    public void testSetCustomerFirstName() {
        System.out.println("setCustomerFirstName");
        Customer instance = new Customer("Serene_878", "123", "seErene", "salah", "alsafa");
        String customerFirstName = "serene";
        instance.setCustomerFirstName(customerFirstName);
        String expResult = "serene";
        String result = instance.getCustomerFirstName();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getCustomerLastName method, of class Customer.
     */
    @Test
    public void testGetCustomerLastName() {
        System.out.println("getCustomerLastName");
        Customer instance = new Customer("Serene_878", "123", "serene", "salah", "alsafa");
        String expResult = "salah";
        String result = instance.getCustomerLastName();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setCustomerLastName method, of class Customer.
     */
    @Test
    public void testSetCustomerLastName() {
        System.out.println("setCustomerLastName");
        Customer instance =new Customer("Serene_878", "123", "serene", "SalaHH", "alsafa");
        String customerLastName = "salah";
        instance.setCustomerLastName(customerLastName);
        String expResult = "salah";
        String result = instance.getCustomerLastName();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getAddress method, of class Customer.
     */
    @Test
    public void testGetAddress() {
        System.out.println("getAddress");
        Customer instance =new Customer("Serene_878", "123", "serene", "salah", "alsafa");
        String expResult = "alsafa";
        String result = instance.getAddress();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setAddress method, of class Customer.
     */
    @Test
    public void testSetAddress() {
        System.out.println("setAddress");
        Customer instance = new Customer("Serene_878", "123", "serene", "salah", "alsafa");
        String address = "alrabwah";
        instance.setAddress(address);
        String expResult = "alrabwah";
        String result = instance.getAddress();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getNewOrder method, of class Customer.
     */
    @Test
    public void testGetNewOrder() {
        System.out.println("getNewOrder");
        Order order = new Order();
        Customer instance = new Customer("Serene_878", "123", "serene", "salah", "alsafa");
        instance.setNewOrder(order);
        Order expResult =order;
        Order result = instance.getNewOrder();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setNewOrder method, of class Customer.
     */
    @Test
    public void testSetNewOrder() {
        
        System.out.println("setNewOrder");
        Customer instance = new Customer("Serene_878", "123", "serene", "salah", "alsafa");
        Order newOrder = new Order();
        instance.setNewOrder(newOrder);
        Order expResult =newOrder;
        Order result = instance.getNewOrder();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of addOrder method, of class Customer.
     */
    @Test
    public void testAddOrder() {
        System.out.println("addOrder");
        Customer instance = new Customer("Serene_878", "123", "serene", "salah", "alsafa");
        String expResult = "order added successfully";
        String result = instance.addOrder();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of showCart method, of class Customer.
     */
    @Test
    public void testShowCartEmpty() {
        System.out.println("showCart");
        Customer instance = new Customer("Serene_878", "123", "serene", "salah", "alsafa");
        String expResult = "your cart is empty! You can add item by chose 1.";
        String result = instance.showCart();
        assertEquals(expResult, result);
       
    }
    @Test
    public void testShowCart() {
        System.out.println("showCart");
        Customer instance = new Customer("Serene_878", "123", "serene", "salah", "alsafa");
        instance.addOrder();
        instance.getNewOrder().products.add(new Item("tart_cookies",20,3));
        instance.getNewOrder().productsQuantity.add(1);
        String expResult = "Number of added items: 1\ntart_cookies || 20.0 || 1\n_______________________________\n";
        String result = instance.showCart();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of searchCustomer method, of class Customer.
     */
    @Test
    public void testSearchCustomer() {
        System.out.println("searchCustomer");
        Customer customer =new Customer("Serene_878", "123", "serene", "salah", "alsafa");
        Customer.customers.add(customer);
        String username = "Serene_878";
        String password = "123";
        Customer expResult = customer;
        Customer result = Customer.searchCustomer(username, password);
        assertEquals(expResult, result);
       
    }
    @Test
    public void testSearchCustomerNull() {
        System.out.println("searchCustomer");
        String username = "Serene_878";
        String password = "123";
        Customer expResult = null;
        Customer result = Customer.searchCustomer(username, password);
        assertEquals(expResult, result);
       
    }
    
}
