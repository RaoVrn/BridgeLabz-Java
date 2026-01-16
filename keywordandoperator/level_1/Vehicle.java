/*
Sample Program 6: Vehicle Registration System

Static:
- registrationFee
- updateRegistrationFee()

This:
- Initialize ownerName, vehicleType, registrationNumber

Final:
- registrationNumber must be final

Instanceof:
- Validate object before displaying registration details
*/

class VehicleDetails {
    static double registrationFee = 2500;

    private String ownerName;
    private String vehicleType;
    private final String registrationNumber;

    public VehicleDetails(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    public void display(Object obj) {
        if (obj instanceof VehicleDetails) {
            System.out.println(ownerName + " | " + vehicleType + " | Reg No: " + registrationNumber);
        }
    }

    public static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }
}

public class Vehicle {
    public static void main(String[] args) {
        VehicleDetails v = new VehicleDetails("Varun", "Car", "TN01AB1234");
        v.display(v);
    }
}
