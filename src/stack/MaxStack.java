package stack;

public class MaxStack {

    public static void main(String[] args) {
        MaxStack stack = new MaxStack();
        stack.push(new Node(4));
        stack.push(new Node(6));
        stack.push(new Node(1));
        stack.push(new Node(2));
        stack.push(new Node(3));
        stack.push(new Node(12));

        System.out.println(stack.getMax() + ":" + stack.getMin());
        stack.pop();
        System.out.println(stack.getMax() + ":" + stack.getMin());
        stack.pop();
        stack.pop();
        System.out.println(stack.getMax() + ":" + stack.getMin());
        stack.pop();
        stack.pop();
        System.out.println(stack.getMax() + ":" + stack.getMin());

    }

    static class Node {

        private int data;
        private Node next;
        private Node max;
        private Node min;

        public Node(int data) {
            this.data = data;
        }


        @Override
        public String toString() {
            return String.valueOf(data);
        }
    }

    private Node max;
    private Node min;
    private Node stack;

    public Node pop() {
        if (stack == null) {
            throw new RuntimeException("Stack is empty");
        }
        Node node = stack;
        stack = node.next;
        max = stack.max == null ? stack : stack.max;
        min = stack.min == null ? stack : stack.min;
        return node;
    }

    public void push(Node node) {
        if (stack == null) {
            stack = node;
            max = stack;
            min = stack;
        } else {
            if (node.data > max.data) {
                max = node;
            } else {
                node.max = max;
            }
            if (node.data < min.data) {
                min = node;
            } else {
                node.min = min;
            }
            node.next = stack;
            stack = node;

        }
    }

    public Node getMax() {
        return max;
    }

    public Node getMin() {
        return min;
    }


}
