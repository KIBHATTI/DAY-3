package Human;
import java.*;
import Human.Shirt;
import Transport.TwoWheeler;
import Transport.Vehicle;

public class Man {
    public String color1;
    String vehicleName;

    public Shirt colorOf(String color1) {          //hasA
        this.color1 = color1;
        Shirt shirtObj = new Shirt(color1);
        System.out.println("color of the shirt is :: "+color1);
        return shirtObj;
    }

    void manWearingShirt()
    {
        System.out.println("man wears shirt of color"+color1);
    }
    interface MobilityFeature{
           // void drive(String vehicleType);
    }
    public void driving()
    {
        System.out.println();
    }


}
