package lesson5.homework;

import java.util.ArrayList;
import java.util.List;

public class TestBoxItems {
    public static void main(String[] args) {

//        List<Item> itemList = new ArrayList<>(List.of(
//                new Item("Watch", 850.23, 5000),
//                new Item("Phone", 467.30, 19000),
//                new Item("Bottle", 1500, 109.34),
//                new Item("Laptop", 2450, 35000),
//                new Item("Book", 200.30, 1900)
//            )
//        );
        List<Item> itemList = new ArrayList<>(List.of(
                new Item("1", 12, 1),
                new Item("2", 2, 2),
                new Item("3", 1, 2),
                new Item("4", 4, 10),
                new Item("5", 1, 1)
        )
        );

        OptimalBox ob = new OptimalBox(3,itemList);
        ob.getOptimalBox();
        System.out.println(ob);

    }
}
