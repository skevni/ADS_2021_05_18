package lesson3.revers;

import lesson3.stack.Stack;
import lesson3.stack.StackImpl;

public class ReversData {
    public static void main(String[] args) {
        textRevert();
    }

    private static void textRevert() {
        String someTxt = "I love Java!";

        Stack<Character> stack = new StackImpl<>(20);
        for (int i = 0; i < someTxt.length(); i++) {
            stack.push(someTxt.charAt(i));
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
        System.out.println();
    }
}
