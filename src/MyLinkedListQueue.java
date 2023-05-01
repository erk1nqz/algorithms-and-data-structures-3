import java.util.NoSuchElementException;

public class MyLinkedListQueue <E> implements Queue<E> {
    private MyLinkedList <E> list;

    public MyLinkedListQueue(){
        this.list = new MyLinkedList<>();
    }
    @Override
    public void enqueue(E item) {
        list.add(item);

    }

    @Override
    public E dequeue() {
        return (E) list.remove(list.size()-1);
    }

    @Override
    public E peek() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return (E) list.get(list.size()-1);
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public int size() {
        return list.size();
    }
}
