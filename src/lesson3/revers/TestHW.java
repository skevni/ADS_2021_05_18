package lesson3.revers;

import lesson3.queue.Queue;
import lesson3.queue.QueueImpl;
import lesson3.stack.Stack;
import lesson3.stack.StackImpl;

import java.util.Random;

public class TestHW {
    public static void main(String[] args) {
        test();
    }
    private static void test() {
        Stack<Integer> s = new StackImpl<>(10);
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            addToStack(s,i);
//            s.push(random.nextInt(6));
        }

        System.out.println(s);
        System.out.println("Removed: "+removeFromStack(s));
        System.out.println(s);

        System.out.println("NEXT QUEUE!!!");

        Queue<Integer> queue = new QueueImpl<>(10);
        for (int i = 0; i < 7; i++) {
            addToQueue(queue,i);
        }

        queue.display();
        System.out.println("Removed: " + removeFromQueue(queue));
        System.out.println("Removed: " + removeFromQueue(queue));
        System.out.println("Removed: " + removeFromQueue(queue));
        queue.display();

        System.out.println(queue.peekFront());
        System.out.println("Removed: " + removeFromQueue(queue));
        queue.display();
        System.out.println(queue.peekFront());

    }
    private static Integer removeFromStack(Stack<Integer> stack) {
        return !stack.isEmpty() ? stack.pop() : null;
    }

    private static boolean addToStack(Stack<Integer> stack, Integer value) {
        if (!stack.isFull()) {
            stack.push(value);
            return true;
        }

        return false;
    }

    private static Integer removeFromQueue(Queue<Integer> queue) {
        return !queue.isEmpty() ? queue.remove() : null;
    }

    private static boolean addToQueue(Queue<Integer> queue, Integer value) {
        if (!queue.isFull()) {
            queue.insert(value);
            return true;
        }

        return false;
    }
}
