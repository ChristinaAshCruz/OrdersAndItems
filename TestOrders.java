import java.util.ArrayList;

public class TestOrders {
    public static void main(String[] args) {
        
        // Menu items
        Item item1 = new Item("Ube Latte", 4.25);
        Item item2 = new Item("Double Espresso", 3.25);
        Item item3 = new Item("Almondmilk Flat White", 4.25);
        Item item4 = new Item("Vietnamese Iced Coffee", 4.00);
        
        // Order variables -- order1, order2 etc.
        ArrayList<Object> order1Items = new ArrayList<>();
        order1Items.add(item1);


        Order order1 = new Order("Jane", 4.25, false, order1Items);

    
    
        // Application Simulations
        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);
    }
}
