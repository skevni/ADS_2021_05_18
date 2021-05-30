package lesson3.deque;

import lesson3.queue.QueueImpl;

public class DequeImpl<E> extends QueueImpl<E> implements Deque<E> {

    public DequeImpl(int maxSize) {
        super(maxSize);
    }

    @Override
    public boolean addLeft(E value) {
        if (isFull()){
            return false;
        }
        if (head == HEAD_DEFAULT){
            head = data.length;
        }
        data[--head] = value;
        size++;

        return true;
    }

    @Override
    public boolean addRight(E value) {
        return super.insert(value);
    }

    @Override
    public E removeLeft() {
        return super.remove();
    }

    @Override
    public E removeRight() {
        if (isEmpty()){
            return null;
        }
        if (tail == TAIL_DEFAULT){
            tail = data.length - 1;
        }
        size--;
        E value = data[tail];
        data[tail--] = null;
        return value;
    }

    @Override
    public E getLeft() {
        return data[head];
    }

    @Override
    public E getRight() {
        return data[tail];
    }
}
