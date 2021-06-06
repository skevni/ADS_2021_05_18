package lesson5.homework;

public class Item {
    private final String name;
    private final double weight;
    private final double cost;

    public Item(String name, double weight, double cost) {
        this.name = name;
        this.weight = weight;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return  "{name='" + name + '\'' +
                ", weight=" + weight +
                ", cost=" + cost +
                '}';
    }
}
