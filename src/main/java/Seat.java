
public class Seat {

    private int age;
    private String passengerName;
    private Integer[][] seatMap;
    private boolean isOccupied, isBusinessClass;

    public Seat() {
    }

    public Seat(int age, String passengerName, Integer[][] seatMap, boolean isOccupied) {
        this.isOccupied = isOccupied;
        this.age = age;
        this.passengerName = passengerName;
        this.seatMap = seatMap;
        this.isBusinessClass = isBusinessClass;
    }

    public boolean isBusinessClass() {
        return isBusinessClass;
    }

    public void setBusinessClass(boolean businessClass) {
        isBusinessClass = businessClass;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public boolean isOccupied() {
        return isOccupied;
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
