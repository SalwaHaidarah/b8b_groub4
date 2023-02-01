package b8b.group4;

public class OrderBuilder {
    
    Order order = new Order();

    public Order a() {
        order.addItem(new Cup_cookies());
        return order;
    }

    public Order b() {
        order.addItem(new Stuffed_cookies());
        return order;
    }

    public Order c() {
        order.addItem(new Tart_cookies());
        return order;
    }

    public Order d() {
        order.addItem(new Regular_cookies());
        return order;
    }

}
