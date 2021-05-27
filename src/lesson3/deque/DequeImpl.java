package lesson3.deque;

public class DequeImpl<E> implements Deque<E> {

    private static final int HEAD_DEFAULT = -1;
    private static final int TAIL_DEFAULT = -1;

    private final E[] data;
    private int size;

    private int tail;
    private int head;

    @SuppressWarnings("unchecked")
    public DequeImpl(int maxSize) {
        this.data = (E[]) new Object[maxSize];
        this.tail = TAIL_DEFAULT;
        this.head = data.length - 1;
//        this.head = HEAD_DEFAULT;
    }

    @Override
    public boolean addLeft(E value) {
        if (isFull()) {
            return false;
        }

//        if (head == -1) {
//            head = data.length - 1;
//        }

        data[head--] = value;
        size++;

        return true;
    }

    @Override
    public boolean addRight(E value) {
        // Проверку на null не делал
        if (isFull()) {
            return false;
        }

//        if (tail == data.length - 1) {
//            tail = TAIL_DEFAULT;
//        }
        data[++tail] = value;
        size++;

        return true;
    }

    @Override
    public E removeLeft() {
        if (isEmpty())
            return null;

        if (head == data.length) {
            head = HEAD_DEFAULT;
        }
        E value = data[++head];
        data[head] = null;
        size--;
        if (size == 0) {
            tail = TAIL_DEFAULT;
            head = HEAD_DEFAULT;
        }
        return value;
    }

    @Override
    public E removeRight() {
        if (isEmpty())
            return null;

        E value = data[tail];
        data[tail--] = null;
        size--;
        if (size == 0) {
            tail = TAIL_DEFAULT;
            head = HEAD_DEFAULT;
        }
        return value;
    }

    @Override
    public E getLeft() {
        return data[head + 1];
    }

    @Override
    public E getRight() {
        return data[tail];
    }


    /*   Queue methods   */
    @Override
    public boolean insert(E value) {
        return addRight(value);
    }

    @Override
    public E remove() {
        return removeRight();
    }

    @Override
    public E peekFront() {
        return getRight();
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return size == data.length;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");

        for (E datum : data) {
            if (datum != null) {
                sb.append(datum);
                sb.append(", ");
            }
        }
        sb.setLength(sb.length() - 2);

        sb.append("]");
        return sb.toString();
    }

    public void display() {
        System.out.println(this);
    }
}
