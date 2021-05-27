package lesson3.deque;

import java.util.List;

public class Test4 {
    public static void main(String[] args) {
        Deque<Integer> deque = new DequeImpl<>(10);
        List<Integer> addList = List.of(10,9,8,7);
        for (Integer intg: addList) {
            if (deque.addRight(intg)){
                System.out.println("Added to the right: " + intg);
            } else {
                System.out.println(intg + "was not added to the right " + intg);
            }
        }
        System.out.println(deque);
        List<Integer> addListLeft = List.of(0,1,2,3);
        for (Integer intL: addListLeft) {
            if (deque.addLeft(intL)){
                System.out.println("Added to the left: " + intL);
            } else {
                System.out.println(intL + "was not added to the left " + intL);
            }
        }
        System.out.println(deque);
        for (int i = 0; i < 4; i++) {
            System.out.println("Removed from the right: " + deque.removeRight());
        }
        System.out.println("Removed from the left: " + deque.removeLeft());
        System.out.println(deque);

        addListLeft = List.of(2,5,8);
        for (Integer intL: addListLeft) {
            if (deque.addLeft(intL)){
                System.out.println("Added to the left: " + intL);
            } else {
                System.out.println(intL + "was not added to the left " + intL);
            }
        }
        System.out.println(deque);
        addList = List.of(17,18,19,20);
        for (Integer intg: addList) {
            if (deque.addRight(intg)){
                System.out.println("Added to the right: " + intg);
            } else {
                System.out.println(intg + "was not added to the right " + intg);
            }
        }
        System.out.println(deque);
        if (!deque.addRight(21)) {
            System.out.println("Value 21 is not added to the right");
        }
        System.out.println("Removed from the right: " + deque.removeRight());
        System.out.println("Removed from the left: " + deque.removeLeft());
        System.out.println(deque);
        if (!deque.addRight(21)) {
            System.out.println("Value 21 is not added to the right");
        } else {
            System.out.println("Added to the right: 21");
        }
        System.out.println(deque);
        System.out.println("Get left: " + deque.getLeft());
        System.out.println("Get right: " + deque.getRight());
        System.out.println("peekFront: " + deque.peekFront());

    }

}
