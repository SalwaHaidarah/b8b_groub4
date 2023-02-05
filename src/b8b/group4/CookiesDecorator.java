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
