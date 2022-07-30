package OOP.Composition;

import OOP.Composition.Car.*;

public class Main {
//    Car:
//    Engine
//    Door:
//            window
//    wheel
//    Gear

    public static void main(String[] args) {
        Gear gear = new Gear(6,"Manual");
        Engine engine = new Engine(2,4);
        Window windowTenPercentTint = new Window(14,10);
        Door door = new Door(windowTenPercentTint,"White");
        Wheel wheel = new Wheel("Black", 16);

        Car car = new Car(engine,gear,wheel,door);
        System.out.println(car);
        int windowSize = car.getDoor().getWindow().getWindowSize();
        Engine engineThree = new Engine(3,6);
        car.setEngine(engineThree);
        System.out.println("after Engine Change: ");
        System.out.println(car);

        System.out.println(windowSize);

    }


}
