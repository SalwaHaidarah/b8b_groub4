/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b8b.group4;

/**
 *
 * @author asrar
 */
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*; 

public class AdministratorTest {
    public AdministratorTest() {
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
     * Test of getUserName method, of class Administrator.
     */
    @Test
    public void testGetUserName() {
        System.out.println("getUserName");
        Administrator instance = new Administrator("salwa_878", "123", "Salwa");
        String expResult = "salwa_878";
        String result = instance.getUserName();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setUserName method, of class Administrator.
     */
    @Test
    public void testSetUserName() {
        System.out.println("setUserName");
        Administrator instance = new Administrator("salwa_", "123", "Salwa");
        String userName = "Salwa_878";
        instance.setUserName(userName);
        String expResult = "Salwa_878";
        String result = instance.getUserName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPassword method, of class Administrator.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        Administrator instance = new Administrator("salwa_878", "123", "Salwa");
        String expResult = "123";
        String result = instance.getPassword();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setPassword method, of class Administrator.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        Administrator instance =new Administrator("salwa_878", "111", "Salwa");
        String password = "123";
        instance.setPassword(password);
        String expResult = "123";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getName method, of class Administrator.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Administrator instance = new Administrator("salwa_878", "123", "Salwa");
        String expResult = "Salwa";
        String result = instance.getName();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setName method, of class Administrator.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        Administrator instance =new Administrator("salwa_878", "123", "salwaa");
        String name = "Salwa";
        instance.setName(name);
        String expResult = "Salwa";
        String result = instance.getName();
        assertEquals(expResult, result);
       
    }
}
