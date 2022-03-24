import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class AssociationPrincipleStory {
    public static void main(String args[])
    {
        Restaurant restaurantObj = new Restaurant();
        Movie movieObj = new Movie();
        restaurantObj.entertainment(movieObj);

        Branch branchObj = new Branch();
        KFC kfcObj1 = branchObj.branchType();

        GasBill1 gasObj = restaurantObj.useGas("Gas bill is Rs.");
        System.out.println(gasObj);

        Person personObj = new Person();
        Vehicle vehicleObj = personObj.typeOfVehicle("two wheeler");

        HolidayHome holidayHomeObj = new HolidayHome("ABC");
        personObj.book(holidayHomeObj);
        System.out.println(personObj);

        Company companyObj = new Company();
        companyObj.makeToy();
        companyObj.doesTrade();

        ClassRoom classRoomObj = new ClassRoom("In classroom");
        Student studentObj = new Student();
        studentObj.giveExam(classRoomObj);
        System.out.println(studentObj);


        Youngman manObj = new Youngman();
        Shirt shirtObj1 = manObj.colorOfShirt("White");
        Guitar guitarObj = new Guitar();
        Music mObj = manObj.entertainment(guitarObj);
        System.out.println(mObj);

    }
}
class Restaurant
{
    String inputGasPipe;
    AirConditioner acObj = new AirConditioner();    //hasA
    Aquarium AqObj = new Aquarium();                //hasA
    Branch branchObj = new Branch();                //hasA


    Feedback feedbackObj = new Feedback();          //hasA

    GasBill1 useGas(String inputGasPipe)            //producesA
    {
        this.inputGasPipe = inputGasPipe;
        GasBill1 gasBillObj = new GasBill1(inputGasPipe);
        System.out.println(gasBillObj);
        return gasBillObj;
    }

    void entertainment(Movie m)
    {    }

}
class Branch
{
    KFC branchType()
    {
        KFC kfcObj = new KFC();
        System.out.println("Branch type is KFC \n");
        return kfcObj;
    }

}

class Movie{}

class KFC extends Restaurant{

    //KFC kfcObj = new KFC();
        //System.out.println("Branch type is KFC \n");
        //return kfcObj;
}                          //isA

class AirConditioner{}

class Aquarium{}

class Feedback{}

class GasBill1
{
    String gasPipe;
    public GasBill1(String gasPipe)
    {
        this.gasPipe = gasPipe;
        System.out.println("in GasBill constructor");
    }
}
class Person
{
    String typeOfVehicle;
    String holidayHome;

    //Memories memoriesObj = new Memories();//hasA

    Vehicle typeOfVehicle(String typeOfVehicle) //usesA
    {
        this.typeOfVehicle = typeOfVehicle;
        Vehicle vehObj = new Vehicle(typeOfVehicle);
        vehObj.getType();
        return vehObj;
    }

    Profession profession1 = new Profession(); //hasA
    Vacation book(HolidayHome holidayHome)      ///usesA
    {
        //this.holidayHome = holidayHome;
        Vacation vacObj = new Vacation();
        return vacObj;
    }

}
class Student extends Person
{
    String cr;
    Exam giveExam(ClassRoom cr) //usesA
    {

        Exam examObj = new Exam();
        return examObj;
    }
}
class ClassRoom
{
    String classroom;
    public ClassRoom(String classRoom)
    {
        this.classroom = classRoom;
        System.out.println("Student give exam  ");
    }
}
class Exam{
    String rc;
    Result show(ReportCard rc)      //usesA
    {
        //this.rc = rc;
        Result resultObj=new Result();
        System.out.println("Exam produces the report Card \n");
        return resultObj;
    }


}
class Result{}
class ReportCard{}

class Vacation{}
class HolidayHome
{
    String hm;
    public HolidayHome(String hm)
    {
        this.hm = hm;
        System.out.println("booking Holiday Home " + hm);
    }
}
class Profession{}
class Company extends Profession
{
    int t;
    Toy makeToy()       //producesA
    {
        this.t = t;
        Toy toyObj = new Toy();
        System.out.println("Company making Toys\n");
        return toyObj;
    }
    Trade doesTrade()
    {
        System.out.println("company does Trading \n");
        Trade tradeObj = new Trade();
        return tradeObj;
    }
}
class Toy{}
class Trade{}
class Vehicle
{
    String type;
    public Vehicle(String type) {
        this.type = type;
        System.out.println("type of the vehicle is "+type);
    }

    public Vehicle() {

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
class TwoWheeler extends Vehicle
{

}

class Youngman extends Person
{
        String shirtColor;
        Shirt colorOfShirt(String shirtColor)
        {
            this.shirtColor = shirtColor;
            Shirt shirtObj = new Shirt(shirtColor);   //hasA
            System.out.println(shirtObj);
            return shirtObj;
        }
        Music entertainment(Guitar g)
        {
            Music musicObj = new Music();
            System.out.println("Entertaining...");
            return musicObj;
        }
}
class Shirt
{
    String color;
    public Shirt(String color)
    {
        this.color = color;
        System.out.println("color of the Shirt is "+color);

    }

//    @Override
//    public String toString() {
//        return "Shirt{" +
//                "color='" + color + '\'' +
//                '}';
   // }
}
class Music{}

class Guitar{}


