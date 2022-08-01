package OOP.Composition.MobilePhone;

public class Camera {
    //1.Camera , its fields are: pixels(int), Zoom (int), isOpen(boolean which is false initially)
    //isOpen is not needed in constructor

    private final int pixels;
    private int zoom;
    private boolean isOpen = false;

    public Camera(int pixels, int zoom) {
        this.pixels = pixels;
        this.zoom = zoom;
    }

    public int getPixels() {
        return pixels;
    }

    public int getZoom() {
        return zoom;
    }

    public void setZoom(int zoom) {
        this.zoom = zoom;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }
}
