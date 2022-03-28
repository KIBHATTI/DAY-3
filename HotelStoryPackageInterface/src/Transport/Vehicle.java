package Transport;


interface  VehicleRuns{
    void  pressAccerlator();
}
interface  ChangeGear{
    void pullGear();
}
public class Vehicle implements ChangeGear
{
    @Override
    public void pullGear() {

    }
}
