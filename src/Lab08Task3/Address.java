package Lab08Task3;

public class Address {
    private String street, postCode, city;
    private int apartmentNumber;

    public Address(String street, String postCode, String city, int apartmentNumber) {
        try {
            if (street == null) throw new StringException("Street can't be null");
            this.street = street;
        } catch (StringException e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            if(postCode == null) throw new StringException("Postcode can't be null");
            this.postCode = postCode;
        } catch (StringException e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            if(city == null) throw new StringException("City can't be null");
            this.city = city;
        } catch (StringException e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            if (apartmentNumber < 0) throw new IntException("Apartment number can't be less than 0");
            this.apartmentNumber = apartmentNumber;
        } catch (IntException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
