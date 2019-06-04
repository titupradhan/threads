package heap;

import java.util.Iterator;
import java.util.PriorityQueue;

public class KMaxElement {

    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((i1,i2)->i1-i2);
        addToHeap(5,minHeap);
        addToHeap(6,minHeap);
        print(minHeap);

        addToHeap(8,minHeap);
        addToHeap(9,minHeap);
        print(minHeap);

        addToHeap(1,minHeap);
        addToHeap(2,minHeap);
        addToHeap(7,minHeap);
        print(minHeap);
        addToHeap(21,minHeap);
        print(minHeap);
    }

    private static void addToHeap(int no,PriorityQueue<Integer> maxheap){

        if(maxheap.size() > 2) {
            final Integer smallest = maxheap.remove();
            if(smallest < no){
                maxheap.add(no);
            }
        } else {
            maxheap.add(no);
        }
    }

    private static void print(PriorityQueue<Integer> pq){
        final Iterator<Integer> iterator = pq.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + "\t");
        }
        System.out.println();
    }
}
