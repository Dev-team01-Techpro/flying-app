import java.util.Arrays;

public class Seat {


   private  int age;
   private  String passengerName;
    private int sitNo;

    public Seat() {
    }


    public Seat(int age, String passengerName, int sitNo) {
        this.age = age;
        this.passengerName = passengerName;
        this.sitNo = sitNo;
    }

    public int getSitNo() {
        return sitNo;
    }

    public void setSitNo(int sitNo) {
        this.sitNo = sitNo;
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
