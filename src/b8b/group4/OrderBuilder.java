package b8b.group4;

public class OrderBuilder {

    Order order = new Order();

    public Order CookieOrders(Cookies type) {
        order.addItem(type);
        return order;
    }

    public Order addCupCookies() {
        order.addItem(new Cup_cookies());
        return order;
    }

    public Order addStuffedCookies() {
        order.addItem(new Stuffed_cookies());
        return order;
    }

    public Order addTartCookies() {
        order.addItem(new Tart_cookies());
        return order;
    }

    public Order addRegCookies() {
        order.addItem(new Regular_cookies());
        return order;
    }

}
