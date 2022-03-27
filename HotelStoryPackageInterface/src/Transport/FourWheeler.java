package Transport;
import Transport.Vehicle;

public class FourWheeler extends Vehicle implements Vehicle.ChangeGear, Vehicle.VehicleRuns
{

    @Override
    public void pullGear() {
        System.out.println("Two Wheeler is changing gear \n");


    }

    @Override
    public void pressAccerlator() {
        System.out.println("4 wheeler is accerlating \n");
    }
}
