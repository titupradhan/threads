package leet;

import java.util.*;

class MedianFinder {

    /** initialize your data structure here. */
    List<Integer> list = new LinkedList<>();
    public MedianFinder() {

    }

    public void addNum(int num) {
        list.add(num);
    }

    public double findMedian() {
        int n = list.size();
        double mid = 0;
        int half = (n/2);
        if(n%2 == 0){
            half = half -1;
           int no1 = list.get(half);
           int no2 = list.get(half+1);
           mid = (no1+no2)/2.0;
        } else {
            half = n/2;
            half =half-1;
            mid = list.get(half);
        }
        return mid;
    }

    public static void main(String[] args) {
        //6.0,8.0,null,10.0,null,6.0,null,2.0,null,4.0,null,6.0,null,5.5,null,5.0,null,2.5,null,0.0]
        MedianFinder obj = new MedianFinder();
        obj.addNum(6);
        obj.addNum(10);
        obj.addNum(2);
        /*obj.addNum(6);
        obj.addNum(5);
        obj.addNum(0);
        obj.addNum(6);
        obj.addNum(3);
        obj.addNum(1);
        obj.addNum(0);
        obj.addNum(0);*/
        double param_2 = obj.findMedian();
        System.out.println(param_2);
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 */