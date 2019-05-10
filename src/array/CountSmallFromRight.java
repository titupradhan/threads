package array;

import java.util.*;

public class CountSmallFromRight {
    public static void main(String[] args) {
        int[] array = {26,78,27,100,33,67,90,23,66,5,38,7,35,23,52,22,83,51,98,69,81,32,78,28,94,13,2,97,3,76,99,51,9,21,84,66,65,36,100,41};
        int[] res ={10,27,10,35,12,22,28,8,19,2,12,2,9,6,12,5,17,9,19,12,14,6,12,5,12,3,0,10,0,7,8,4,0,0,4,3,2,0,1,0};


        System.out.println(count(array));
        System.out.println(Arrays.toString(res));






    }

    static List<Integer> count(int[] array) {
        Comparator<Integer> c = (n1,n2) -> {
            if(n2>=n1){
                return 1;
            } else {
                return -1;
            }
        };
        TreeSet<Integer> set = new TreeSet<>(c);
        LinkedList<Integer> list = new LinkedList<>();

        for(int i=array.length-1;i>=0;i--){
            int no = array[i];
            if(set.isEmpty()){
                list.addFirst(0);
            } else {
                boolean b = true;
                int count = 0;
                for(int n:set){
                    if(no>n){
                        list.addFirst(set.size() - count);
                        b = false;
                        break;
                    }
                    count++;
                }
                set.add(no);
                if(b){
                    list.addFirst(0);
                }
            }
            set.add(no);
        }



        return list;
    }

    static class No {
        public int no;

        public No(int no) {
            this.no = no;
        }


    }


}
