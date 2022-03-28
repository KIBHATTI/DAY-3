package Restaurant;
interface Booking
{
    int bookTable(int noOfTable);

}
interface Services
{
  //  public Order orderfood(String orderNumber);

    public Order orderFood(int orderNo);

    public Food prepareFood(Order orderNumber);

}
public class Restaurant implements Booking,Services
{
        String restaurantName;
        int orderNo;
        String foodName1;

        public Restaurant()
        {

        }
        public String getRestaurantName() {
        return restaurantName;
    }

        public void setRestaurantName(String restaurantName)
        {
           this.restaurantName = restaurantName;
         }

        public Restaurant(String restaurantName)
        {
              this.restaurantName = restaurantName;
        }

    @Override
    public int bookTable(int noOfTable) {

        System.out.println("Book "+noOfTable);
        return noOfTable;
    }


//    @Override
//    public Order orderfood(String orderNumber) {
//        return null;
//    }

    @Override
    public  Order orderFood(int orderNo)
    {
        Order orderObj1 = new Order(orderNo);
        System.out.println("Ordering food:: "+orderNo);
        return orderObj1;

    }

    @Override
    public Food prepareFood(Order orderNumber2)
    {
        Food food1  = new Food(orderNumber2);
        System.out.println("Preparing food");
        return food1;
    }
}
