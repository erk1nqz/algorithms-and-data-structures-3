import java.util.NoSuchElementException;

public class MyArrayListQueue <E> implements Queue <E> {
    private MyArrayList<E> list;

    public  MyArrayListQueue() {
        this.list= new MyArrayList<>();
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
