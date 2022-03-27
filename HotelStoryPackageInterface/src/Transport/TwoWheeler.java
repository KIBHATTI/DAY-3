package Transport;

import Transport.Vehicle;

public class TwoWheeler extends Vehicle implements Vehicle.ChangeGear
{

    @Override
    public void pullGear() {
        System.out.println("Two Wheeler is changing gear");


    }
}
