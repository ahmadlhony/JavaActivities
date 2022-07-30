package OOP.Composition.Car;

public class Engine {
    private int engineSize;
    private int numberOfCylinder;

    public Engine(int engineSize, int numberOfCylinder) {
        this.engineSize = engineSize;
        this.numberOfCylinder = numberOfCylinder;
    }

    public int getEngineSize() {
        return engineSize;
    }

    public int getNumberOfCylinder() {
        return numberOfCylinder;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "engineSize=" + engineSize +
                ", numberOfCylinder=" + numberOfCylinder +
                '}';
    }
}
