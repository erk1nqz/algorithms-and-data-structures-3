public class MyArrayListStack <E> implements Stack<E> {
    MyArrayList<E> list;
    /**
     * @function MyArrayListStack - constructor to create an arraylist
     * @noparam
     * @return void
     */
    public MyArrayListStack() {
        this.list = new MyArrayList<E>();
    }
    /**
     * @function push - method adds an element to the top of the stack using the add method for MyArrayList
     * @param item - given item to add in stack
     * @return void
     */
    @Override
    public void push(E item) {
        list.add(item);
    }
    /**
     * @function pop - method removes and returns the top element of the stack using the remove method for MyArrayList
     * @noparam
     * @return T - returning top element in generic type
     */
    @Override
    public E pop() {
        if (isEmpty()) {
            System.out.println("The stack is already empty  ");
        }
            return (E) list.remove(list.size()-1);
    }
    /**
     * @function peek - method returns the top element of the stack without removing it using the get method for MyArrayList
     * @noparam
     * @return T - returning top element in generic type
     */
    @Override
    public E peek() {
        return (E) list.get(list.size()-1);
    }
    /**
     * @function isEmpty - method returns true if the stack is empty or false if it is not using the isEmpty method for MyArrayList
     * @noparam
     * @return boolean - true if stack is empty, false otherwise
     */
    @Override
    public boolean isEmpty() {
        if (list.isEmpty()) {
            return true;
        } else {
            return false;
        }

    }
    /**
     * @function size - method returns the number of elements in the stack using the size method for MyArrayList
     * @noparam
     * @return int - size of stack
     */
    @Override
    public int size() {
        return list.size();
    }
}

