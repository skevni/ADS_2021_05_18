package lesson5.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Box implements Comparable<Box> {

    private final static int PRECISION_FOR_COMPARE = 2;
    private final double capacity;
    private List<Item> content;

    private double itemsCost;
    private double itemsWeight;

    public Box(double capacity) {
        this.capacity = capacity;
        this.content = new ArrayList<>();
    }

    public double getCapacity() {
        return capacity;
    }

    public double getItemsCost() {
        return itemsCost;
    }

    public double getItemsWeight() {
        return itemsWeight;
    }

    public void display() {
        System.out.println(this);
    }

    public boolean add(Item item) {
        if (capacity >= itemsWeight + item.getWeight()) {
            content.add(item);
            itemsCost += item.getCost();
            itemsWeight += item.getWeight();
            return true;
        }
        return false;
    }

    public void addAll(List<Item> items) {
        for (Item item : items) {
            this.add(item);
        }
    }

    @Override
    public int compareTo(Box o) {
        return (int) (itemsCost * Math.pow(10, PRECISION_FOR_COMPARE) - o.itemsCost * Math.pow(10, PRECISION_FOR_COMPARE));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Box box = (Box) o;
        return Double.compare(box.itemsCost, itemsCost) == 0 && Double.compare(box.itemsWeight, itemsWeight) == 0 && content.equals(box.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(capacity, itemsCost, itemsWeight, content);
    }

    @Override
    public String toString() {
        return "BoxCapacity=" + capacity +
                ", TotalCost=" + itemsCost +
                ", TotalWeight=" + itemsWeight +
                ",\ncontent=" + content;
    }
}
