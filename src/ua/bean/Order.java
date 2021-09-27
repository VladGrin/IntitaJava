package ua.bean;

import java.io.Serializable;
import java.util.Objects;

public class Order implements Serializable {
    private int id;
    private float price;
    private String description;

    public Order() {
    }

    public Order(int id, float price, String description) {
        this.id = id;
        this.price = price;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return id == order.id && Float.compare(order.price, price) == 0 && Objects.equals(description, order.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, price, description);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
