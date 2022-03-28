package Transport;

import Transport.Vehicle;

public class TwoWheeler extends Vehicle implements ChangeGear
{
    String vehicleName;

    public TwoWheeler(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public void pullGear()
    {
        System.out.println("Two wheelerr changign gear: "+getVehicleName());
    }
}
