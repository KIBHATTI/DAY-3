package Electronics;
import Examination.Exam;
import Human.Student;

interface  wakeup{
    public void wakeupTime();

}
public class Laptop implements  wakeup
{
    String laptopName;

    public Laptop(String laptopName) {
        this.laptopName = laptopName;
    }

    public String getLaptopName() {
        return laptopName;
    }

    public void setLaptopName(String laptopName) {
        this.laptopName = laptopName;
    }

    public void wakeupTime()
    {
        System.out.println("Laptop is waking up");
    }
//    Exam inExam(Student name,String lp)
//    {
//        System.out.println("iin laptop \n");
//        Exam examObjinLap = new Exam("kanwar","laptop");
//        System.out.println(examObjinLap);
//        return examObjinLap;
//
//    }

    @Override
    public String toString() {
        return "Laptop{" +
                "laptopName='" + laptopName + '\'' +
                '}';
    }
}
