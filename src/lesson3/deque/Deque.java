package lesson3.deque;

import lesson3.queue.Queue;

public interface Deque<E> extends Queue<E> {

    boolean addLeft(E value);

    boolean addRight(E value);

    E removeLeft();

    E removeRight();

    E getLeft();

    E getRight();

}
