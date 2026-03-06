package oops.encapsulation;

class Car{
    String brand;
    String color;
    int speed;

    public Car(String brand,String color,int speed){
        this.brand = brand;
        this.color = color;
        this.speed = speed;
    }
}



public class EncapsulationDemo {
    public static void main(String[] args) {
        Car car1 = new Car("tata", "red", 250);
    }
    
}
