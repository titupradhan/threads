package java25jan;

import java.util.*;
import java.util.stream.Collectors;

class Hello extends Hi {

    public B eat() {
        System.out.println("Hello ....");
        return null;
    }

    public static void main(String[] args) {
        final List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(7);
        list.add(5);
        list.add(8);
        list.add(7);
        list.add(34);

        String s1 = "hello";
        String s2 = new String("hello");

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        Map<String, Integer> map = new HashMap<>();
        map.put(s1, 2);
        map.put(s2, 3);

        System.out.println(map.size());
    }
}

class Hi {
    public A eat() {
        System.out.println("Hi ....");
        return null;
    }

}

class A {

}

class B extends A {

}
