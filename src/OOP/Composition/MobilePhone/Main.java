package OOP.Composition.MobilePhone;

public class Main {
    //in this activity we will simulate creating SmartPhone using Composition
    //Our SmartPhone(class) Composite from other objects like:
    //1.Camera , its fields are: pixels(int), Zoom (int), isOpen(boolean which is false initially)
    //isOpen is not needed in constructor
    //2.Screen: its fields are: brightnessPercentage(int), resolution(int)
    //3.Battery: its fields are: batteryLevel(int), capacity(int)

    //try to add constructor, getter and setter for all fields that needed(setter's with condition's)

    //SmartPhone functionalities(methods):
    //showBatteryLevel() which gets battery level from Battery object and print's it

    //openCamera() which sets Camera objects isOpen field to true , if it was true it prints
    //camera already open

    //closeCamera()  which sets Camera objects isOpen field to false , if it was false it prints
    //camera already closed

    //takePic() it should first check is the camera is open or close
    //if it was open print "Picture captured"
    //if it was closed print "first open the camera"

    //increaseBrightness() which increases brightness level by 20 if it was 100 it won't do anything
    //there is another condition for brightness,you should check battery level
    //if the batteryLevel was lower then 20 you can't increase brightness more then 40
    //and print("low battery level , you can't increase brightness more then 40%")
    //you should have above condition in constructor too, check if battery level was lower then 20
    //set screen's brightnessLevel to 40 if it was already higher then 40

    //decreaseBrightness() which decreases brightness level by 20 and print new brightness
    //if it was 20 or lower it will just print the brightnessLevel



}
