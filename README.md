# 📚 Assignment 3 Erkinkyzy Bakyt
# 👀 interfaces

## Stack.java
**Description**: *Creating an interface Stack.java helps to define all methods we have to do and then we implements this interface in class MyArrayListStack.*

```java
public interface Stack<E> {
    void push(E item);
    E pop();
    E peek();
    boolean isEmpty();
    int size();
}
```


## Queue.java
**Description**: *Creating an interface Queue.java helps to define all methods we have to do and then we implements this interface in class MyArrayListQueue.*
```java
public interface Queue<E> {
    void enqueue(E item);
    E dequeue();
    E peek();
    boolean isEmpty();
    int size();
}
```
