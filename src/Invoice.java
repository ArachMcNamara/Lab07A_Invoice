import java.util.ArrayList;

public class Invoice {
    private String title;
    private String address;
    private ArrayList<LineItem> items;

    public Invoice(String title, String address) {
        this.title = title;
        this.address = address;
        items = new ArrayList<>();
    }

    public void addLineItem(LineItem item) {
        items.add(item);
    }

    public double getTotalDue() {
        double total = 0;

        for (LineItem item : items) {
            total += item.getLineTotal();
        }

        return total;
    }

    public ArrayList<LineItem> getItems() {
        return items;
    }
}