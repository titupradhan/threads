package jan13;

public class Test2 {

    public static void main(String[] args) {
        Adder<Integer> addI = new Adder<>();

        addI.add(1,2);

        Adder<String> addS = new Adder<>();
        addS.add("Ashok ","Monalisha");
    }
}
