package array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SortedAndRotatedArray {

    public static void main(String[] args) throws  Exception{
        //int[] array = {3, 4, 5, 1, 2};

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int noOftestCase = Integer.parseInt(br.readLine());

        String[] nos = br.readLine().split(" ");
        int[] array = new int[nos.length];

        for(int i=0;i<array.length;i++){
            int j=1;
            while(j <= array[i]){
                if(j%3==0 && j%5 ==0){
                    System.out.println("FizzBuzz");
                } else if(j%3 == 0){
                    System.out.println("Fizz");
                }else if(j%5 == 0){
                    System.out.println("Buzz");
                } else {
                    System.out.println(j);
                }
                j++;
            }


        }
    }

    static int find(int[] array, int no) {
        if (array == null || array.length == 0) return -1;

        int mid = array.length/2;

        return -1;
    }
}
