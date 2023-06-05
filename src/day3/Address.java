//Day3-Problem – 1
package day3;
public class Address {
    String street;
    String city;
    String state;
    String zip;
    Address(String street, String city, String state, String zip){
        this.street=street;
        this.city=city;
        this.state=state;
        this.zip=zip;
    }
    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public void setState(String state) {
        this.state = state;
    }
    public void setZip(String zip) {
        this.zip = zip;
    }
}