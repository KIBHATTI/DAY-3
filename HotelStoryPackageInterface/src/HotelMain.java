import Corporate.Company;
import Corporate.Hotel;
import Corporate.Restaurant;
import Electronics.Laptop;
import Examination.Exam;
import Examination.ReportCard;
import Human.*;

public class HotelMain
{
    public static void main(String[] args)
    {

        //Man manObj = new Man();
        //manObj.colorOf("Blue");
        Student studentObj = new Student();

//EXAM,laptop,result,reportCard

        //works
//        Exam examObj = new Exam("ku","DEll");
//        System.out.println(examObj);

        Laptop lpObj = new Laptop("Lenovo");
        ReportCard rcObj = new ReportCard();

        Exam examObj = new Exam("ku",lpObj);
        System.out.println(examObj);
        examObj.giveReportCard(rcObj);

//Company,Restaurant,KFC        //Company

        Restaurant restaurant = new Restaurant("");
        Company comObj = new Company(3);


    }
}
