import java.util.Arrays;

public class Seat {

   private boolean isOccupied;
   private  int age;
   private  String passengerName;
    private Integer[][] seatMap;

    public Seat() {
    }

    public Seat(boolean isOccupied, int age, String passengerName, Integer[][] seatMap) {
        this.isOccupied = isOccupied;
        this.age = age;
        this.passengerName = passengerName;
        this.seatMap = seatMap;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }


}
