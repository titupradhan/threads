package designpattern.builder;

public class CarBuilderTest {
    public static void main(String[] args) {
        final Car car = Car.builder().name("maruti-800").model("Deluxe").company("suzuki").price(30000).build();



        System.out.println(car);
    }
}
