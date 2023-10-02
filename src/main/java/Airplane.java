import java.util.*;

public class Airplane {

    //    private Map<String, Integer> destination;
//    private String[][] destination = {{"Germany", "15000"},{"Nederland", "15000"}};
    private Map<String, Integer> destinations;


    private double price, luggageAllowance, extraLuggageFeePerKilo;

    public Airplane() {
        defaultCountries();
    }
    public Airplane(double price, double luggageAllowance) {
        defaultCountries();
        this.price = price;
        this.luggageAllowance = luggageAllowance;
    }

    public Map<String, Integer> getDestinations() {
        return destinations;
    }

    public void setDestinations(Map<String, Integer> destinations) {
        this.destinations = destinations;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getLuggageAllowance() {
        return luggageAllowance;
    }

    public void setLuggageAllowance(double luggageAllowance) {
        this.luggageAllowance = luggageAllowance;
    }

    public double getExtraLuggageFeePerKilo() {
        return extraLuggageFeePerKilo;
    }

    public void setExtraLuggageFeePerKilo(double extraLuggageFeePerKilo) {
        this.extraLuggageFeePerKilo = extraLuggageFeePerKilo;
    }
    public void defaultCountries(){
        this.destinations = new HashMap<>();

        this.destinations.put("Germany", 1500);
        this.destinations.put("Nederland", 4500);
        this.destinations.put("Poland", 3500);
        this.destinations.put("Norway", 2500);
    }
    public void run(){
        Airplane airplane = new Airplane();
        for(Map.Entry<String, Integer> w : airplane.getDestinations().entrySet()){
            String country = w.getKey();
            Integer km = w.getValue();
            System.out.println(country + " " + km);
        }
    }
}
