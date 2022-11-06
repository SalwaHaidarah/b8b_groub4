/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b8b.group4;

   import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
   PaymentTest.class,
   ItemTest.class,
   OrderTest.class,
   CustomerTest.class,
   AdministratorTest.class,
   PleaseCookiesTest.class
   
})
public class JunitTestSuite {


}
