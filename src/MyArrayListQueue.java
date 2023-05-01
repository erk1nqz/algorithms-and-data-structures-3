import java.util.NoSuchElementException;

public class MyArrayListQueue <E> implements Queue <E> {
    private MyArrayList<E> list;
    /**
     * @function MyArrayListQueue - constructor to create an arraylist
     * @noparam
     * @return void
     */

    public  MyArrayListQueue() {
        this.list= new MyArrayList<>();
    }
    /**
     * @function enqueue - method adds an element to the back of the queue using the add method for MyArrayList
     * @param item - given element to add in queue
     * @return void
     */
    @Override
    public void enqueue(E item) {
        list.add(item);
    }
    /**
     * @function dequeue - method removes and returns the front element of the queue using the remove method for MyArrayList
     * @noparam
     * @return T - returning first element in queue in generic type
     */
    @Override
    public E dequeue() {
        return (E) list.remove(list.size()-1);
    }
    /**
     * @function peek -  method returns the front element of the queue without removing it using the get method for MyArrayList
     * @noparam
     * @return T - returning first element in queue in generic type
     */
    @Override
    public E peek() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return (E) list.get(list.size()-1);
    }
    /**
     * @function isEmpty - method returns true if the queue is empty or false if it is not using the isEmpty method for MyArrayList
     * @noparam
     * @return boolean - return true if queue is empty, false otherwise
     */
    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }
    /**
     * @function size - method returns the number of elements in the queue using the size method for MyArrayList
     * @noparam
     * @return int - size of queue
     */
    @Override
    public int size() {
        return list.size();
    }
}
