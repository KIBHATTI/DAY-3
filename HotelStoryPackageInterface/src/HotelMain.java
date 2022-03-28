import Restaurant.*;
import Electronics.Laptop;
import Examination.Exam;
import Examination.ReportCard;
import Human.*;

public class HotelMain
{
    public static void main(String[] args)
    {

        Man manObj = new Man();
        manObj.colorOf("Blue");


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

        Restaurant restaurant = new Restaurant("Eat Palaza");
        Company comObj = new Company(3);
        comObj.manageBranches();
        restaurant.bookTable(2);

        Restaurant resObj = new Restaurant();
        Order orderMainObj = resObj.orderFood(123);
        Food foodObj = resObj.prepareFood(orderMainObj);
        System.out.println("foodname is "+ foodObj.getFoodName());

        KFC kfcObj = new KFC();
        kfcObj.bookTable(1);
        //System.out.println("Bookoed tabled in KFC "+kfcObj);
        Order orderKFCMainObj =  resObj.orderFood(4332);
        Food foodKFCObj = new Food(orderKFCMainObj);
        System.out.println("KFC food name if "+foodKFCObj.getFoodName());

        Feedback feedbackObj = new Feedback("Good food");

    }
}
