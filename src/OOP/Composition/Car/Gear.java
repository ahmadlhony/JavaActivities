package OOP.Composition.Car;

public class Gear {
    private int numberOfGear;
    private String transition;

    public Gear(int numberOfGear, String transition) {
        this.numberOfGear = numberOfGear;
        this.transition = transition;
    }

    public int getNumberOfGear() {
        return numberOfGear;
    }

    public String getTransition() {
        return transition;
    }

    @Override
    public String toString() {
        return "Gear{" +
                "numberOfGear=" + numberOfGear +
                ", transition='" + transition + '\'' +
                '}';
    }
}
