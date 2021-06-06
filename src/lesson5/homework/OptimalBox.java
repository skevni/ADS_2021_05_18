package lesson5.homework;

import java.util.List;

public class OptimalBox {
    private final double capacity;
    private Box optimalBox;
    private List<Item> content;

    public OptimalBox(double capacity, List<Item> content) {
        this.capacity = capacity;
        this.content = content;
    }

    public List<Item> getContent() {
        return content;
    }

    public void setContent(List<Item> content) {
        this.content = content;
    }

    public void getOptimalBox() {
        if (content == null || content.size() == 0) {
            throw new IllegalArgumentException("You can not use an empty list");
        }

        getOptimalBoxRecursion(content.size());

    }

    private void getOptimalBoxRecursion(int length) {
        if (length == 1) {
            return;
        }

        for (int i = 0; i < length; i++) {
            Box box = new Box(capacity);
            box.addAll(content);

            if (optimalBox == null || optimalBox.compareTo(box) < 0) {
                optimalBox = box;
            }

            getOptimalBoxRecursion(length - 1);
            rotate(length);
        }
    }

    private void rotate(int length) {

        int pos = content.size() - length;
        Item tempItem = content.get(pos);

        content.remove(pos);
        content.add(tempItem);

    }

    @Override
    public String toString() {
        return "Optimal Box\n" + optimalBox.toString();
//        return "OptimalBox{ BoxCapacity: " + capacity +
//                "\nTotalCost: " + optimalBox.getItemsCost() +
//                "\nTotalWeight: " + optimalBox.getItemsWeight() +
//                "\nItems:{" + content.toString() +
//                '}' + " \n}";
    }
}
