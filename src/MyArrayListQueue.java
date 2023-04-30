public class MyArrayListQueue <E> implements Queue <E> {
    private MyArrayList<E> list;

    public  MyArrayListQueue() {
        this.list= new MyArrayList<>();
    }

    @Override
    public void enqueue(E item) {

    }

    @Override
    public E dequeue() {
        return null;
    }

    @Override
    public E peek() {
        return null;
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
