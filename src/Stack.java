public interface Stack<E> {
    void push();
    E pop();
    E peek();
    boolean isEmpty();
    int size();
}