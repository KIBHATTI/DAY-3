package Human;
import Transport.TwoWheeler;
//import Transport.FourWheeler;
import Electronics.Laptop;
import Examination.Exam;

public class Student extends Man implements Man.MobilityFeature {
    //TwoWheeler twoWheelerObj = new TwoWheeler();
    String studentName;
    public String typeOfVehicle;
    String whichLaptop1;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

//    @Override
//    public void drive(String typeOfVehicle) {
//        System.out.println("Student is driving " + typeOfVehicle);
//    }

    //    @Override
//    public void pullGear2Wheeler() {
//        System.out.println("pulling gear of " + typeOfVehicle);
//    }
//    Exam givingExam(Laptop whichlaptop1)
//    {
//        this.whichLaptop1 = whichLaptop1;
//       // Exam examObj = new Exam();
//        System.out.println("student is giving exam using Laptop "+whichLaptop1);
//        return examObj;
//    }
}
