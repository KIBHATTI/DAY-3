package Restaurant;

public class KFC implements Booking,Services
{
     int orderKFCNo;
    @Override
    public int bookTable(int noOfTable) {
        super.bookTable(noOfTable);
        System.out.println(noOfTable +"Table booked in KFC ");
        return noOfTable;
    }
    @Override
    public Order orderFood(int orderKFCNo)
    {
        Order orderKFCObj = new Order(orderKFCNo);
        System.out.println("your KFC order Number is "+orderKFCObj);
        return  orderKFCObj;
    }
    @Override
    public Food prepareFood(Order dishKFC)
    {
        Food foodKFCobj = new Food(dishKFC);
        return foodKFCobj;

    }
}
