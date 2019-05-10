package designpattern.builder;

import java.util.Random;

public class Single {


    public static void main(String[] args) {

        Random random = new Random();

        String[] names = {"ashok","monalisha","sonalika","suba","bidya","kunu"};

        for(int i=0;i<20;i++){
            final int no = random.nextInt(names.length);
            System.out.println(names[no]);
        }
    }


}
