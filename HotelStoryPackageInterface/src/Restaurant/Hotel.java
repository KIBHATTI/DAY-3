package Restaurant;

public class Hotel {
    String hotelName;

    public Hotel(){}
    public Hotel(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelName='" + hotelName + '\'' +
                '}';
    }
    public void orderFood()
    {
        System.out.println("order food:: ");
    }
}
