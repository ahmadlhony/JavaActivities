package OOP.Composition.MobilePhone;

public class SmartPhone {

    //in this activity we will simulate creating SmartPhone using Composition
    //Our SmartPhone(class) Composite from other objects like:
    //1.Camera , its fields are: pixels(int), Zoom (int), isOpen(boolean which is false initially)
    //isOpen is not needed in constructor
    //2.Screen: its fields are: brightnessPercentage(int), resolution(int)
    //3.Battery: its fields are: batteryLevel(int), capacity(int)

    private Camera camera;
    private Screen screen;
    private Battery battery;

    public SmartPhone(Camera camera, Screen screen, Battery battery) {
        this.camera = camera;
        this.battery = battery;

        if (battery.getBatteryLevel() <= 20) {
            screen.setBrightnessPercentage(40);
        }
        this.screen = screen;
    }



    //SmartPhone functionalities(methods):
    //showBatteryLevel() which gets battery level from Battery object and print's it
    public void showBatteryLevel(){
        System.out.println("You Battery level is: "+ this.getBattery().getBatteryLevel());
    }

    //openCamera() which sets Camera objects isOpen field to true , if it was true it prints
    //camera already open
    public void openCamera(){
        if (this.getCamera().isOpen()){
            System.out.println("Camera is already open");
        }else{
            System.out.println("Camera is open now");
            this.getCamera().setOpen(true);
        }
    }

    //closeCamera()  which sets Camera objects isOpen field to false , if it was false it prints
    //camera already closed
    public void closeCamera(){
        if (!this.getCamera().isOpen()){
            System.out.println("Camera is already closed");
        }else{
            System.out.println("Camera is closed now");
            this.getCamera().setOpen(false);
        }
    }

    //takePic() it should first check is the camera is open or close
    //if it was open print "Picture captured"
    //if it was closed print "first open the camera"

    public void takePic(){
        if (this.getCamera().isOpen()){
            System.out.println("Picture captured");
        }else{
            System.out.println("first open the camera");
        }
    }

    //increaseBrightness() which increases brightness level by 20 if it was 100 it won't do anything
    //there is another condition for brightness,you should check battery level
    //if the batteryLevel was lower then 20 you can't increase brightness more then 40
    //and print("low battery level , you can't increase brightness more then 40%")
    //you should have above condition in constructor too, check if battery level was lower then 20
    //set screen's brightnessLevel to 40 if it was already higher then 40
    public void increaseBrightness(){
        if (this.getScreen().getBrightnessPercentage() == 100){
            System.out.println("Brightness is 100");
        }else if(this.getScreen().getBrightnessPercentage() >80 && this.getScreen().getBrightnessPercentage() <=100){
            System.out.println("Screen set to 100 with less then 20%");
            this.getScreen().setBrightnessPercentage(100);
        }else if(this.getBattery().getBatteryLevel() < 20){
            if (this.getScreen().getBrightnessPercentage() >20 && this.getScreen().getBrightnessPercentage() <=40){
                System.out.println("Screen set to 40 low battery level");
                this.getScreen().setBrightnessPercentage(40);
            }else if (this.getScreen().getBrightnessPercentage() >40 && this.getScreen().getBrightnessPercentage() <=100){
                System.out.println("Screen set to 40 low battery level");
                this.getScreen().setBrightnessPercentage(40);
            }else{
                int current = this.getScreen().getBrightnessPercentage();
                this.getScreen().setBrightnessPercentage(current+20);
            }
        }else{
            int current = this.getScreen().getBrightnessPercentage();
            this.getScreen().setBrightnessPercentage(current+20);
            System.out.println("Screen set to: "+this.getScreen().getBrightnessPercentage());
        }
    }

    //decreaseBrightness() which decreases brightness level by 20 and print new brightness
    //if it was 20 or lower it will just print the brightnessLevel
    public void decreaseBrightness(){
        if (this.getScreen().getBrightnessPercentage() <=20){
            System.out.println("Screen brightness is 20 already");
            this.getScreen().setBrightnessPercentage(20);
        }else {
            int current = this.getScreen().getBrightnessPercentage();
            int newValue = current-20;
            this.getScreen().setBrightnessPercentage(newValue);
            System.out.println("Screen set to: "+newValue);
        }
    }


    public Camera getCamera() {
        return camera;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public Battery getBattery() {
        return battery;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }
}
