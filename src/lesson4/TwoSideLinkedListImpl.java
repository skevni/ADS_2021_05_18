package lesson4;


public class TwoSideLinkedListImpl<E> extends SimpleLinkedListImpl<E> implements TwoSideLinkedList<E> {

    private Node<E> lastElement;

    @Override
    public void insertLast(E value) {
        Node<E> newNode = new Node<>(value, lastElement, null);
        if (isEmpty()) {
            firstElement = newNode;
        } else {
            lastElement.next = newNode;
        }

        lastElement = newNode;
        size++;
    }

    @Override
    public void insertFirst(E value) {
        Node<E> tmpFirst = firstElement;
        super.insertFirst(value);
        if (size == 1) {
            lastElement = firstElement;
        } else {
            tmpFirst.previous = firstElement;
        }
    }

    @Override
    public E removeFirst() {
        E removedValue = super.removeFirst();
        if (isEmpty()) {
            lastElement = null;
        } else {
            firstElement.previous = null;
        }

        return removedValue;
    }

    @Override
    public boolean remove(E value) {
        Node<E> current = firstElement;
        Node<E> previous = null;
        while (current != null) {
            if (current.item.equals(value)) {
                break;
            }
            previous = current;
            current = current.next;
        }

        if (current == null) {
            return false;
        } else if (current == firstElement) {
            removeFirst();
            return true;
        } else if (current == lastElement) {
            lastElement = previous;
            previous.next = null;
        } else {
            previous.next = current.next;
            (current.next).previous = previous;
        }

        current.next = null;
        current.previous = null;
        size--;
        return true;
    }

    @Override
    public E getLast() {
        return getValue(lastElement);
    }

    @Override
    public E removeLast() {
        if (isEmpty()) {
            firstElement = null;
        }
        Node<E> tmpPrev = lastElement;
        lastElement = tmpPrev.previous;
        lastElement.next = null;
        // next у последнего нет, обрываем предыдущую ссылку
        tmpPrev.previous = null;
        size--;
        return tmpPrev.item;
    }
}
