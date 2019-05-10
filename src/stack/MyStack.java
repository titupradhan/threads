package stack;

public class MyStack<T> {

    private static class Node<T> {
        T data;
        Node<T> next;
    }

    private Node<T> stack;
    private int size;

    public void push(T t) {
        Node<T> node = new Node<>();
        node.data = t;
        if (stack == null) {
            stack = node;
        } else {
            node.next = stack;
            stack = node;
        }
        size++;
    }

    public T pop() {
        if (stack == null) {
            throw new RuntimeException("Stack is empty..");
        }
        T t = stack.data;
        stack = stack.next;
        size--;
        return t;
    }

    public T peek() {
        return stack.data;
    }

    public boolean isEmpty() {
        return stack == null;
    }

    public int getSize() {
        return size;
    }
}
