package Exercise;

class Car {

    String brand;
    String color;
    int speed;

    public void printDetails() {
        System.out.println("Brand:"+brand);
        System.out.println("Color:"+color);
        System.out.println("Speed:"+speed);
    }
}

public class Main {

    public static void main(String[] args) {

        Car car = new Car();

        car.brand = "Toyota";
        car.color = "Black";
        car.speed = 180;

        car.printDetails();
    }
}