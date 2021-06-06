package lesson6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test6 {

    public static void main(String[] args) {
        task1();
//        Tree<Integer> tree = new TreeImpl<>();
//        tree.add(60);
//        tree.add(50);
//        tree.add(66);
//        tree.add(40);
//        tree.add(55);
//        tree.add(70);
//        tree.add(31);
//        tree.add(45);
//        tree.add(42);
//        tree.add(43);
//        tree.add(67);
//        tree.add(81);
//
//        System.out.println("Find 70: " + tree.contains(70));
//        System.out.println("Find 700: " + tree.contains(700));
//
////        tree.traverse(Tree.TraverseMode.IN_ORDER);
//
//        tree.display();
////        tree.remove(55);
////        tree.remove(42);
//        tree.remove(40);
//        tree.display();
    }

    // Если глубину ставлю 20, то ни одного сбалансированного дерева за 10 раз
    // При глубине 4 процент от 10 до 55, но чаще около 35%
    private static void task1() {
        int depth = 4; // глубина
        int bound = 50; // предельное случайное значение
        List<Tree<Integer>> treeList = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            Tree<Integer> tree = new TreeImpl<>(depth);
            Random random = new Random();
            for (int j = 0; j < Math.pow(2, depth) - 1; j++) {
                tree.add(random.nextInt(bound) * (random.nextBoolean() ? 1 : -1));
            }
            treeList.add(tree);
        }
        int countBalancedTree = 0;
        for (int i = 0; i < treeList.size(); i++) {
            Tree<Integer> curTree = treeList.get(i);
            if (treeList.get(i).isBalanced(curTree.getRoot())) {
                countBalancedTree++;
            }
            System.out.println("Tree #" + i + " is balanced: " + treeList.get(i).isBalanced(curTree.getRoot()));
        }

        System.out.printf("\nPercentage of balanced trees: %d%%", countBalancedTree * 100 / treeList.size());

    }
}
