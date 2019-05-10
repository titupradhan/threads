package stack;

import java.util.Stack;

public class StackTest {

    public static void main(String[] args) {
        /*MyStack<Integer> stack = new MyStack<>();
        stack.push(2);
        stack.push(4);
        stack.push(6);
        stack.push(8);

        System.out.println(stack.getSize());
        System.out.println(stack.peek());

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }*/

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);


       reverse(stack);


    }

    static void reverse(Stack<Integer> stack) {
        if (stack == null) return;
        final Integer pop = stack.pop();
        if (!stack.isEmpty())
            reverse(stack);
        System.out.println(pop);
    }
}
