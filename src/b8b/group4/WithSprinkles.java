 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b8b.group4;

public class WithSprinkles extends CookiesDecorator{
    
    public WithSprinkles(Cookies cookies) {
        super(cookies);
    }
   
    
    @Override
    public double price(){
        return super.price()+1;
    }
    
    @Override
    public String name(){
        return super.name()+" with sprinkles";
    }
    
    
}
