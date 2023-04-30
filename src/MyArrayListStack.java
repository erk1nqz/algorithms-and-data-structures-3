public class MyArrayListStack <E> implements Stack<E> {
    MyArrayList<E> list;

    public MyArrayListStack() {
        this.list = new MyArrayList<E>();
    }

    @Override
    public void push(E item) {
        list.add(item);
    }

    @Override
    public E pop() {
        return null;
    }

    @Override
    public E peek() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        if (list.isEmpty()) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    public int size() {
        return 0;
    }
}

