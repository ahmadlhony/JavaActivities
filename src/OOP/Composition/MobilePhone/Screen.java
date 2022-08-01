package OOP.Composition.MobilePhone;

public class Screen {
//    2.Screen: its fields are: brightnessPercentage(int), resolution(int)

    private final int resolution;
    private int brightnessPercentage;

    public Screen(int resolution, int brightnessPercentage) {
        this.resolution = resolution;
        this.brightnessPercentage = brightnessPercentage;
    }

    public int getResolution() {
        return resolution;
    }

    public int getBrightnessPercentage() {
        return brightnessPercentage;
    }

    public void setBrightnessPercentage(int brightnessPercentage) {
        if (brightnessPercentage > 0){
        this.brightnessPercentage = brightnessPercentage;
        }else{
            System.out.println("Invalid value ");
        }
    }
}
