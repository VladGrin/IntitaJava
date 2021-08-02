package duke.choice;

public class ShopApp {

    public static void main(String[] args) {

        Customer c1 = new Customer();
        c1.setName("Pinky");
        c1.setSize("S");

        System.out.println("Welcome to our shop " + c1.getName());

        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();
        item1.setDescription("Blue Jacket");
        item1.setPrice(20.9);
        item1.setSize("M");
        item2.setDescription("Orange T-Short");
        item2.setPrice(10.5);
        item2.setSize("S");
        Clothing[] items = {item1, item2, new Clothing(), new Clothing()};
        items[2].setDescription("Green Scarf");
        items[2].setPrice(5);
        items[2].setSize("S");
        items[3].setDescription("Blue T-Short");
        items[3].setPrice(10.5);
        items[3].setSize("S");

        c1.addItems(items);

        int measurement = 3;
        switch(measurement){
            case 1: case 2: case 3:
                c1.setSize("S");
                break;
        }
        switch (measurement) {
            case 1:
            case 2:
            case 3:
                c1.setSize("S");
                break;
            case 4:
            case 5:
            case 6:
                c1.setSize("M");
                break;
            case 7:
            case 8:
            case 9:
                c1.setSize("L");
                break;
            default:
                c1.setSize("XL");
        }
        for (Clothing item : items) {
            System.out.println("Item: " + item.getDescription() + ", " + item.getPrice() + ", " + item.getSize());
        }
        System.out.println("Total: " + c1.getTotalClothingCost());
    }
}
