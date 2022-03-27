package Corporate;
interface Food
{
    void bookTable(int noOfTable);
    void orderFood(String foodName);


}

public class Restaurant implements Food
{
        String restaurantName;

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public Restaurant(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    @Override
    public void bookTable(int noOfTable) {
        System.out.println("Book "+noOfTable);
    }

    @Override
    public void orderFood(String foodName) {
        System.out.println("Ordering food:: "+foodName);
    }
}
