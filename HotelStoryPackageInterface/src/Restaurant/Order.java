package Restaurant;

public class Order
{
        int OrderNo;
        private String mainCourse;

       public Order(int OrderNO)
       {
            super();

           this.OrderNo = OrderNo;
        }

        public int getOrderNo()
        {
            return OrderNo;
         }

        public void setOrderNo(int orderNo)
        {
            OrderNo = orderNo;
        }
}



