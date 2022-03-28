package Human;
import Transport.Vehicle;

import Electronics.Laptop;
import Examination.Exam;

public class Student extends Man
{
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

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                '}';
    }


}
