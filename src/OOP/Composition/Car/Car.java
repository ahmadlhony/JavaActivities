package OOP.Composition.Car;

public class Car {
    private Engine engine;
    private Gear gear;
    private Wheel wheel;
    private Door door;

    public Car(Engine engine, Gear gear, Wheel wheel, Door door) {
        this.engine = engine;
        this.gear = gear;
        this.wheel = wheel;
        this.door = door;
    }

    public Gear getGear() {
        return gear;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public Door getDoor() {
        return door;
    }

    public void setDoor(Door door) {
        this.door = door;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", gear=" + gear +
                ", wheel=" + wheel +
                ", door=" + door +
                '}';
    }
}
