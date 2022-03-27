package Examination;
import Electronics.Laptop;
import Human.Student;

import java.sql.SQLOutput;

public class Exam {
    //String whichLaptop;
    String stuNameinExam;
    String laptopNameinExam;
//  BELOW WORKS
//    public Exam(String stuNameinExam,String laptopNameinExam) {
//        this.laptopNameinExam = laptopNameinExam;
//        this.stuNameinExam = stuNameinExam;
//        System.out.println("in Exam class \n");
//        System.out.println("student:: "+stuNameinExam+" is giving exam using laptop:: "+laptopNameinExam);
//    }

     public Exam(String stuNameinExam, Laptop lp)
     {
         this.stuNameinExam = stuNameinExam;
       //  this.laptopNameinExam = laptopNameinExam();
         System.out.println("student:: "+stuNameinExam+" is giving exam using laptop:: "+lp.getLaptopName());

     }
     public  Result giveReportCard(ReportCard rc)
     {
         Result resultObj = new Result();
         System.out.println("in result");
         return resultObj;
     }
}
