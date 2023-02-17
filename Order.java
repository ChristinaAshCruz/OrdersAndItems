import java.lang.reflect.Array;
import java.util.ArrayList;

public class Order {
    
    public String name;
    public Double total;
    public boolean ready;
    public ArrayList<Object> items;

    public Order(String name, double total, boolean ready, ArrayList<Object> items){
        this.name = name;
        this.total = total;
        this.ready = ready;
        this.items = items;
    }
}
