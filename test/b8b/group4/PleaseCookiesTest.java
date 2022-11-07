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
import org.junit.Ignore;

/**
 *
 * @author Seren
 */

public class PleaseCookiesTest {
    
    public PleaseCookiesTest() {
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
     * Test of main method, of class PleaseCookies.
     */
    @Ignore
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        PleaseCookies.main(args);
        
    }

    /**
     * Test of printHead method, of class PleaseCookies.
     */
    @Test
    public void testPrintHead() {
        System.out.println("printHead");
        PleaseCookies.printHead();
    }

    /**
     * Test of printCustomerOptions method, of class PleaseCookies.
     */
    @Test
    public void testPrintCustomerOptions() {
        System.out.println("printCustomerOptions");
        PleaseCookies.printCustomerOptions();
    }

    /**
     * Test of printAdminHeader method, of class PleaseCookies.
     */
    @Test
    public void testPrintAdminHeader() {
        System.out.println("printAdminHeader");
        PleaseCookies.printAdminHeader();
    }

    /**
     * Test of printCustomerHeader method, of class PleaseCookies.
     */
    @Test
    public void testPrintCustomerHeader() {
        System.out.println("printCustomerHeader");
        PleaseCookies.printCustomerHeader();
    }

    /**
     * Test of printPymentMethods method, of class PleaseCookies.
     */
    @Test
    public void testPrintPymentMethods() {
        System.out.println("printPymentMethods");
        PleaseCookies.printPymentMethods();
    }
    
}
