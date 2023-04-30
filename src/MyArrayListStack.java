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
        if (isEmpty()) {
            System.out.println("The stack is already empty  ");
        }
            return (E) list.remove(list.size()-1);
    }

    @Override
    public E peek() {
        return (E) list.get(list.size()-1);
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
        return list.size();
    }
}

