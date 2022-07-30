package OOP.Composition.Car;

public class Door {
    private Window window;
    private String doorColor;

    public Door(Window window, String doorColor) {
        this.window = window;
        this.doorColor = doorColor;
    }

    public Window getWindow() {
        return window;
    }

    public void setWindow(Window window) {
        this.window = window;
    }

    public String getDoorColor() {
        return doorColor;
    }

    public void setDoorColor(String doorColor) {
        this.doorColor = doorColor;
    }

    @Override
    public String toString() {
        return "Door{" +
                "window=" + window +
                ", doorColor='" + doorColor + '\'' +
                '}';
    }
}
