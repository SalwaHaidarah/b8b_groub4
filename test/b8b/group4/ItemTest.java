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
 * @author Seren
 */
public class ItemTest {
    
    public ItemTest() {
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
     * Test of setItemName method, of class Item.
     */
    @Test
    public void testSetItemName() {
        System.out.println("setItemName");
        Item instance = new Item("cake", 5, 20);
        String itemName = "cookies";
        instance.setItemName(itemName);
        String expResult = "cookies";
        String result = instance.getItemName();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getItemName method, of class Item.
     */
    @Test
    public void testGetItemName() {
        System.out.println("getItemName");
        Item instance =new Item("cookies", 5, 20);
        String expResult = "cookies";
        String result = instance.getItemName();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setPrice method, of class Item.
     */
    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        Item instance = new Item("cookies", 10, 20);
        double price = 5.0;
        instance.setPrice(price);
        double expResult = 5.0;
        double result = instance.getPrice();
        assertEquals(expResult, result, 0.0);
       
    }

    /**
     * Test of getPrice method, of class Item.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        Item instance = new Item("cookies", 5, 20);
        double expResult = 5.0;
        double result = instance.getPrice();
        assertEquals(expResult, result, 0.0);
       
    }

    /**
     * Test of setQuantity method, of class Item.
     */
    @Test
    public void testSetQuantity() {
        System.out.println("setQuantity");
        Item instance = new Item("cookies", 5, 20);
        int quantity = 2;
        instance.setQuantity(quantity);
        int expResult = 2;
        int result = instance.getQuantity();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getQuantity method, of class Item.
     */
    @Test
    public void testGetQuantity() {
        System.out.println("getQuantity");
        Item instance = new Item("cookies", 5, 20);
        int expResult = 20;
        int result = instance.getQuantity();
        assertEquals(expResult, result);
      
    }

    /**
     * Test of addNewItem method, of class Item.
     */
    @Test
    public void testAddNewItem() {
        System.out.println("addNewItem");
        Item newItem =new Item("cookies", 5, 20);
        String result = Item.addNewItem(newItem);
        String expResult = "Item added successfully";
        assertEquals(expResult, result);
    }

    /**
     * Test of deleteItem method, of class Item.
     */
    @Test
    public void testDeleteItem() {
        System.out.println("deleteItem");
        Item newItem =new Item("cookies", 5, 20);
        Item.addNewItem(newItem);
        String itemName = "cookies";
        String expResult = "Item deleted successfully";
        String result = Item.deleteItem(itemName);
        assertEquals(expResult, result);
    }
    @Test
    public void testDeleteItemNO() {
        System.out.println("deleteItem");
        String itemName = "cup_cake";
        String expResult = "this Item is not exist!";
        String result = Item.deleteItem(itemName);
        assertEquals(expResult, result);
    }

    /**
     * Test of searchItem method, of class Item.
     */
    @Test
    public void testSearchItem() {
        System.out.println("searchItem");
        Item item = new Item("cup_cookies", 3, 10);
        Item.items.add(item);
        String key = "cup_cookies";
        Item expResult = item;
        Item result = Item.searchItem(key);
        assertEquals(expResult, result);
    }
    @Test
    public void testSearchItemNoItem() {
        System.out.println("searchItem");
        String key = "cake";
        Item expResult = null;
        Item result = Item.searchItem(key);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of printItems method, of class Item.
     */
    @Test
    public void testPrintItems() {
        System.out.println("printItems");
        Item.printItems();
       
    }
    
}
