/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b8b.group4;


public class CookiesDecorator extends Cookies{

    private Cookies cookies;

    public CookiesDecorator(Cookies cookies) {
        this.cookies = cookies;
    }
    
    
    @Override
    public double price() {
        return this.cookies.price();
    }

    @Override
    public String name() {
        return this.cookies.name();

    }

    
 
    
}
