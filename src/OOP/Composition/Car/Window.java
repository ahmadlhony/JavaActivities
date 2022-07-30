package OOP.Composition.Car;

public class Window {
    private final int windowSize;
    private int windowTint;

    public Window(int windowSize, int windowTint) {
        this.windowSize = windowSize;
        this.windowTint = windowTint;
    }

    public void setWindowTint(int windowTint) {
        this.windowTint = windowTint;
    }

    public int getWindowSize() {
        return windowSize;
    }

    public int getWindowTint() {
        return windowTint;
    }

    @Override
    public String toString() {
        return "Window{" +
                "windowSize=" + windowSize +
                ", windowTint=" + windowTint +
                '}';
    }
}
