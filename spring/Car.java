package spring;

public class Car {
    private Engine engine = new Engine();
    
    public void startCar(){
        engine.start();
        System.out.println("Started ");
    }
}
