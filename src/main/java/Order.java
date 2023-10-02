public class Order {

    private int orderNumber;

    private int passengerId;

   private double totalPrice;

    public Order() {
    }

    public Order(int orderNumber, int passengerId, double totalPrice) {
        this.orderNumber = orderNumber;
        this.passengerId = passengerId;
        this.totalPrice = totalPrice;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public int getPassengerId() {
        return passengerId;
    }


    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
