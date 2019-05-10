package designpattern.builder;

public class Car {

    private String name;

    private String model;

    private double price;

    private String company;

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public String getCompany() {
        return company;
    }

    private Car(String name, String model, double price, String company) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.company = company;
    }

    public static CarBuilder builder() {
        return new CarBuilder();
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", company='" + company + '\'' +
                '}';
    }

    static class CarBuilder {
        private String name;
        private String model;
        private double price;
        private String company;

        public CarBuilder name(String name) {
            this.name = name;
            return this;
        }

        public CarBuilder model(String model) {
            this.model = model;
            return this;
        }

        public CarBuilder price(double price) {
            this.price = price;
            return this;
        }

        public CarBuilder company(String company) {
            this.company = company;
            return this;
        }

        public Car build() {
            return new Car(name, model, price, company);
        }

    }
}
