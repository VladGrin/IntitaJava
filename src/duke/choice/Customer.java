package duke.choice;

public class Customer {

    private String name;
    private String size;
    private Clothing[] items;

    public double getTotalClothingCost() {
        double total = 0.0;
        for (Clothing item : items) {
            total = total + item.getPrice();
        }
        return total;
    }

    public void addItems(Clothing[] aItems) {
        items = aItems;
    }

    public Clothing[] getItems() {
        return items;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
