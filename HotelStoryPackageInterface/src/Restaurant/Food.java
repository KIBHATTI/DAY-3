package Restaurant;

public class Food
{
    String foodName = "Golgappe" ;


    Order orderObj;

    public Food(Order orderObj)
    {
        this.orderObj = orderObj;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }
}
