import java.util.Map;

public class Airplane {

    private Map<String, Integer> destination;
    private boolean isBusinessClass;

    private double price, luggageAllowance, extraLuggageFeePerKilo;

    public Airplane() {
    }
    public Airplane(Map<String, Integer> destination, boolean isBusinessClass, double price, double luggageAllowance) {
        this.destination = destination;
        this.isBusinessClass = isBusinessClass;
        this.price = price;
        this.luggageAllowance = luggageAllowance;
    }

    public Map<String, Integer> getDestination() {
        return destination;
    }

    public void setDestination(Map<String, Integer> destination) {
        this.destination = destination;
    }

    public boolean isBusinessClass() {
        return isBusinessClass;
    }

    public void setBusinessClass(boolean businessClass) {
        isBusinessClass = businessClass;
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
}
