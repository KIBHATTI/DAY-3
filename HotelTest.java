
public class Assignment_Innovate {

    public static void main(String[] args) {
        Hotel h =  new Hotel();
        ///h.Hotel("Park Venue");
        h.createHotel("Park Venue","Navi Mumbai",50,"KI Bhatti",5);
        System.out.println(h);
        //h.displayHotelList();
        h.bookRoom("Tanu",1,1);
        System.out.println(h.numberOfRooms+" room Booked in the name of  : "+h.customerName);

        h.setCustInfo("Tanu","Female",9900358903l);

    }

}
class Hotel
{
    String hotelName;
    String city;
    String gender;
    long contactNumber;
    int numberOfGuests;
    int numberOfRooms;
    String ownerName;
    int stars;
    float price;
    String customerName;
    int roomToBook;

    Hotel()
    {
        System.out.println("Welcome to "+ hotelName);

    }
    void createHotel(String hotelName,String city, int numberOfRooms, String ownerName,int stars)
    {
        System.out.println("Creating Hotel");
        this.hotelName = hotelName;
        this.city = city;
        this.numberOfRooms = numberOfRooms;
        this.ownerName = ownerName;
        this.stars = stars;

    }
    /*void displayHotelList()
    {
        System.out.println("Hotel Name is                 : "+hotelName);
        System.out.println("City	                      : "+city);
        System.out.println("Number of rooms available in the Hotel  : "+numberOfRooms+" Rooms");
        System.out.println("Name of the Hotel Owner       : "+ownerName);
        System.out.println("Rating of the Hotel           : "+stars+" star");

    }
    */
    void setCustInfo(String customerName,String gender,long contactNumber)
    {
        this.customerName = customerName;
        this. gender = gender;
        this.contactNumber = contactNumber;
    }
    int bookRoom(String customerName,int numberOfGuests,int numberOfRooms)
    {
        this.customerName = customerName;
        //this.roomToBook = roomToBook;
        this.numberOfGuests = numberOfGuests;
        this.numberOfRooms = this.numberOfRooms - numberOfRooms;
        System.out.println("Remaining Available Room to book        : "+this.numberOfRooms);
        return numberOfRooms;
    }
    @Override
    public String toString()
    {
        return "Hotel  [hotelName=" + hotelName + ", city=" +   city + ",numberOfRooms="+numberOfRooms+ ", ownerName=" +ownerName + ",stars =" + stars +"]";

        //return "Surgeon [specializedQualification=" + specializedQualification + ", qualification=" + qualification
        //	+ ", fees=" + fees + "]";
    }

}
class Resort extends Hotel
{
    String hallType;

    void
}