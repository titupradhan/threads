package array;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Random;

public class SlidingWindow {
    public static void main(String[] args) {

        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1);
        deque.addLast(3);
        deque.addLast(5);
        deque.addFirst(6);
        deque.add(90);

        for(int k:deque){
            System.out.print(k+",");
        }
    }
}
