package OOP.Composition.Car;

public class Wheel {
    private String color;
    private int wheelSize;

    public Wheel(String color, int wheelSize) {
        this.color = color;
        this.wheelSize = wheelSize;
    }

    public int getWheelSize() {
        return wheelSize;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "color='" + color + '\'' +
                ", wheelSize=" + wheelSize +
                '}';
    }
}
