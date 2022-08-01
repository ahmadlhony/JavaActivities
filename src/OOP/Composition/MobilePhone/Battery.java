package OOP.Composition.MobilePhone;

public class Battery {
//    3.Battery: its fields are: batteryLevel(int), capacity(int)
    private final int capacity;
    private int batteryLevel;

    public Battery(int capacity, int batteryLevel) {
        this.capacity = capacity;
        this.batteryLevel = batteryLevel;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        if (batteryLevel >0 && batteryLevel <=100 )
            this.batteryLevel = batteryLevel;
        else
            System.out.println("Invalid Value");
    }
}
