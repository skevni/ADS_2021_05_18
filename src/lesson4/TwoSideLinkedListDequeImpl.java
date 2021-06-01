package lesson4;

import lesson3.deque.Deque;

import java.util.function.Consumer;

public class TwoSideLinkedListDequeImpl<E> extends TwoSideLinkedListImpl<E> implements Deque<E> {

    public TwoSideLinkedListDequeImpl(){
        super();
    }
    @Override
    public boolean insertLeft(E value) {
        super.insertFirst(value);
        return true;
    }

    @Override
    public boolean insertRight(E value) {
        super.insertLast(value);
        return true;
    }

    @Override
    public E removeLeft() {
        return super.removeFirst();
    }

    @Override
    public E removeRight() {
        return super.removeLast();
    }

    @Override
    public boolean insert(E value) {
        return insertRight(value);
    }

    @Override
    public E remove() {
        return removeLeft();
    }

    @Override
    public E peekFront() {
        return super.getFirst();
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public void forEach(Consumer<? super E> action) {
        super.forEach(action);
    }
}
