package ch.juventus.object;

public class Address {
    private final String street;
    private final int number;
    private final int zip;
    private final String city;

    public Address(String street, int number, int zip, String city) {
        this.street = street;
        this.number = number;
        this.zip = zip;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", number=" + number +
                ", zip=" + zip +
                ", city='" + city + '\'' +
                '}';
    }
}
