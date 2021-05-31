package lesson4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestMain4 {

    public static void main(String[] args) {
//        testLinkedList();
        testForEach();
    }

    private static void testLinkedList() {
        LinkedList<Integer> linkedList = new SimpleLinkedListImpl<>();
//        TwoSideLinkedList<Integer> linkedList = new TwoSideLinkedListImpl<>();
        linkedList.insertFirst(1);
        linkedList.insertFirst(2);
        linkedList.insertFirst(3);
        linkedList.insertFirst(4);
//        linkedList.insertLast(5);
//
        linkedList.display();
//
        System.out.println("Find 2: " + linkedList.contains(2));
        System.out.println("Find 1: " + linkedList.contains(1));
        System.out.println("Find 4: " + linkedList.contains(4));
        System.out.println("Find 4444: " + linkedList.contains(4444));
//
        linkedList.removeFirst();
        linkedList.remove(2);

        linkedList.display();
    }

    private static void testForEach() {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);

        for (int i = 0; i < arrayList.size(); i++) {
            int value = arrayList.get(i);
        }

//        List<Integer> linkedListJava = new java.util.LinkedList<>();
//        linkedListJava.add(0,1);
//        linkedListJava.add(1,2);
//        linkedListJava.add(2,3);
//        for (Integer intt: linkedListJava) {
//            System.out.println(intt);
//        }

//        SimpleLinkedListImpl<Integer> linkedList = new SimpleLinkedListImpl<>();
//        linkedList.insertFirst(1);
//        linkedList.insertFirst(2);
//        linkedList.insertFirst(3);
//        linkedList.insertFirst(4);
//
//        LinkedList.Node<Integer> currentNode = linkedList.firstElement;
//        while (currentNode != null) {
//            int value = currentNode.item;
//            currentNode = currentNode.next;
//        }



        for (Integer integer : arrayList) {
            System.out.println(integer);
        }
//
//        System.out.println("----");
//
        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Integer value = iterator.next();
            System.out.println(value);
        }
//
//        LinkedList<Integer> linkedList = new SimpleLinkedListImpl<>();
        TwoSideLinkedList<Integer> linkedList = new TwoSideLinkedListImpl<>();
        linkedList.insertFirst(1);
        linkedList.insertFirst(2);
        linkedList.insertFirst(3);
        linkedList.insertFirst(4);
        linkedList.insertLast(7);
        linkedList.insertLast(8);

        linkedList.display();

        System.out.println("Removed last element:" + linkedList.removeLast());

        linkedList.display();

        Iterator<Integer> itr = linkedList.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("--------------");
        for(Integer value: linkedList) {
            System.out.println(value);
        }
    }
}
