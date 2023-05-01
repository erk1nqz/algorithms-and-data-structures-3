public class MyLinkedListStack <E> implements Stack<E> {
    private MyLinkedList<E> list;

    public MyLinkedListStack() {
        this.list = new MyLinkedList<>();
    }

    @Override
    public void push(E item) {
        list.add(item);

    }

    @Override
    public E pop() {
        return (E) list.remove(0);
    }

    @Override
    public E peek() {
        return (E) list.get(0);
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
