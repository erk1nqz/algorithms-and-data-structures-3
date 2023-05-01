# 📚 Assignment 3 Erkinkyzy Bakyt
# 👀 interfaces

### 🖇️ Stack.java
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


### 🖇️ Queue.java
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



# 👀 classes


## 📙 MyArrayListStack.java
**Description**: *creating a class MyArrayListStack to understand how stacks works and see examples. Class has method: push, pop, peek, isEmpty, size.*

#### ✂️ method push()
```java
@Override
    public void push(E item) {
        list.add(item);
    }
```


#### ✂️ method pop()
```java
@Override
    public E pop() {
        if (isEmpty()) {
            System.out.println("The stack is already empty  ");
        }
            return (E) list.remove(list.size()-1);
    }
```



#### ✂️ method peek()
```java
 @Override
    public E peek() {
        return (E) list.get(list.size()-1);
    }
```



#### ✂️ method isEmpty()
```java
  @Override
    public boolean isEmpty() {
        if (list.isEmpty()) {
            return true;
        } else {
            return false;
        }

    }
```

## 📙  MyArrayListQueue.java
**Description**: *Description: creating a class MyArrayListQueue to understand how queues works and see examples. Class has method: enqueue, dequeue, peek, isEmpty, size.*

#### ✂️ method enqueue()
```java
 @Override
    public void enqueue(E item) {
        list.add(item);
    }
```


#### ✂️ method dequeue()
```java
@Override
    public E dequeue() {
        return (E) list.remove(list.size()-1);
    }
```



#### ✂️ method peek()
```java
 @Override
    public E peek() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return (E) list.get(list.size()-1);
    }
```



#### ✂️ method isEmpty()
```java
  @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }
```

#### ✂️ method size()
```java
 @Override
    public int size() {
        return list.size();
    }
```
