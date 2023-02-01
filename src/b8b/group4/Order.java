
package b8b.group4;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item) {
        items.add(item);
    }

    public double getCost() {
        double cost = 0.0;

        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems() {

        for (Item item : items) {
            System.out.print(item.name());
            System.out.println(", Price : " + item.price());
        }
        
    }
    
    public ArrayList<Item> getProducts(){
        
        return (ArrayList<Item>)items;
        
    }
}
