package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class MergeKSortedList {

    public static void main(String[] args) {
        final List<Integer> list1 = Arrays.asList(1, 3, 5, 8);
        final List<Integer> list2 = Arrays.asList(-10, 3, 4, 6, 8, 11, 45, 67, 75, 89);
        final List<Integer> list3 = Arrays.asList(20, 23, 35, 58, 76, 90);
        final List<Integer> list4 = Arrays.asList(-1, 4, 5);
        List<List<Integer>> lists = new ArrayList<>();
        lists.add(list1);
        lists.add(list2);
        lists.add(list3);
        lists.add(list4);
        final List<Integer> sort = sort(lists);
        System.out.println(sort);

    }

    public static List<Integer> sort(List<List<Integer>> lists) {
        PriorityQueue<No> pq = new PriorityQueue<>((n1, n2) -> n1.no - n2.no);
        for (int i = 0; i < lists.size(); i++) {
            if (!lists.get(0).isEmpty()) {
                final Integer no = lists.get(i).get(0);
                pq.add(new No(no, i, 0));
            }
        }
        List<Integer> res = new ArrayList<>();
        while (!pq.isEmpty()) {
            final No no = pq.poll();
            res.add(no.no);
            final List<Integer> list = lists.get(no.listNo);
            int nextIndex = no.index + 1;
            if (nextIndex < list.size()) {
                int n = list.get(nextIndex);
                pq.add(new No(n, no.listNo, nextIndex));
            }
        }
        return res;
    }

    private static class No {
        public int no;
        public int listNo;
        public int index;

        public No(int no, int listNo, int index) {
            this.no = no;
            this.listNo = listNo;
            this.index = index;
        }
    }


}
