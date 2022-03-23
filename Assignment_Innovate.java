
public class Assignment_Innovate {

    public static void main(String[] args) {
        Hotel h =  new Hotel();

        h.createHotel("Park Venue","Navi Mumbai",50,"KI Bhatti",5);
        System.out.println(h);

        h.setCustInfo("Tanu","Female",9900358903l);
        h.bookRoom("Tanu",1,3);
        System.out.println(h.roomToBook+" room Booked in the name of  : "+h.customerName);
        System.out.println("======================================================");

        Resort rObj =  new Resort();
        rObj.setCustInfo("Kanchan","female",857584735,"party");
        rObj.bookRoom("Karandeep",50,30,"Party");
        System.out.println(rObj);
        Resort rObj1 =  new Resort();
        int i = rObj1.bookGolfCourse(1);
        System.out.println("You have booked golf course number "+i);
        System.out.println("======================================================");

        HotelRestaurant hr = new HotelRestaurant();
        hr.setCustInfo("Ram","Male",87577363,1);
        System.out.println(hr);
        hr.bookRoom("Ram",3);
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
    public int roomToBook;
    String ownerName;
    int stars;
    //float price;
    String customerName;


    Hotel()
    {
        //System.out.println("Welcome to "+ hotelName);

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
    int bookRoom(String customerName,int numberOfGuests,int roomToBook)
    {
        this.customerName = customerName;
        //this.roomToBook = roomToBook;
        this.numberOfGuests = numberOfGuests;
        numberOfRooms = numberOfRooms - roomToBook;
        System.out.println("Remaining Available Room to book        : "+this.numberOfRooms);
        return roomToBook;
    }
    @Override
    public String toString()
    {
        return "Hotel  [hotelName=" + hotelName + ", city=" +   city + ", ownerName=" +ownerName + ",stars =" + stars +"]";

    }

}

class Resort extends Hotel {
    String hallType;
    int golfCourseNumber;


    void setCustInfo(String customerName, String gender, long contactNumber, String hallType) {
        super.setCustInfo(customerName, gender, contactNumber);
        this.hallType = hallType;
    }


    int bookRoom(String customerName, int numberOfGuests, int roomToBook,String hallType) {
        super.bookRoom(customerName, numberOfGuests, roomToBook);
//        numberOfRooms = numberOfRooms - roomToBook;
//        System.out.println("Remaining Available Room to book        : " + numberOfRooms);
        System.out.println("Booking hall for "+numberOfGuests+"along with rooms "+roomToBook);
        System.out.println("Hall Type Booked "+hallType);


        return roomToBook;

    }

    @Override
    public String toString() {
        return "Resort[customerName= "+customerName + ", numberOfGuests= "+numberOfGuests+ ", roomToBook= "+roomToBook+ ",Halltype= " +
                hallType +"]";
    }

    int bookGolfCourse(int golfCourseNumber) {
        this.golfCourseNumber = golfCourseNumber;
        System.out.println("Booking golfCourse");
        return golfCourseNumber;
    }
}
class HotelRestaurant extends Hotel
{
    int tables;
    String Food;
    float price;

    void setCustInfo(String customerName,String gender, long contactNumber,int tables)
    {
        System.out.println("Enter your Info..");
        super.setCustInfo(customerName,gender,contactNumber);
        this.tables = tables;
    }
    int bookRoom(String customerName, int numberOfGuests)
    {
        System.out.println("Booked a table");
        return 0;
    }

    @Override
    public String toString() {
        return "HotelRestaurant[BookingTable "+tables +",InTheNameOf= "+customerName+ ",for "+numberOfGuests + "guests]";
    }
}