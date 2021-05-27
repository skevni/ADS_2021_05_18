package lesson3.queue;

public class QueueImpl<E> implements Queue<E> {

    private static final int HEAD_DEFAULT = 0;
    private static final int TAIL_DEFAULT = -1;

    private final E[] data;
    private int size;

    private int tail;
    private int head;

    @SuppressWarnings("unchecked")
    public QueueImpl(int maxSize) {
        this.data = (E[]) new Object[maxSize];
        this.head = HEAD_DEFAULT;
        this.tail = TAIL_DEFAULT;
    }

    // O(1)
    @Override
    public boolean insert(E value) {
        if (isFull()) {
            return false;
        }

        if (tail == data.length - 1) {
            tail = TAIL_DEFAULT;
        }

        data[++tail] = value;
        size++;

        return true;
    }

    // O(1)
    @Override
    public E remove() {
        if (isEmpty()) {
            return null;
        }

        if (head == data.length) {
            head = HEAD_DEFAULT;
        }

        E value = data[head++];
        size--;

        return value;
    }

    @Override
    public E peekFront() {
        return data[head];
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
        int sizeHead = size+head;
        for (int i = head; i < sizeHead; i++) {
            sb.append(data[i]);
            if (i < sizeHead - 1) {
                sb.append(", ");
            }
        }

        sb.append("]");
        return sb.toString();
    }

    @Override
    public void display() {
        System.out.println(this);
    }
}
