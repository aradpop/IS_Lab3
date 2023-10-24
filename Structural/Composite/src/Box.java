import java.util.ArrayList;
import java.util.List;

public class Box implements Item {
    private int price;
    private List<Item> items = new ArrayList<>();

    public Box(int price) {
        this.price = price;
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public int getPrice() {
        int totalPrice = this.price;
        for (Item item:this.items)
            totalPrice += item.getPrice();

        return totalPrice;
    }
}