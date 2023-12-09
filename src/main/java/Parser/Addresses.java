package Parser;

public class Addresses {
    int postalCode;
    String city;
    String stateCode;
    String countryCode;
    String line1;
    String type;

    public Addresses(int postalCode, String city, String stateCode, String countryCode, String line1, String type) {
        this.postalCode = postalCode;
        this.city = city;
        this.stateCode= stateCode;
        this.countryCode = countryCode;
        this.line1 = line1;
        this.type = type;
    }
}
