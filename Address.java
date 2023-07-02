public class Address {
    private String country;
    private String city;
    private String district;
    private String street;
    private String building;

    public Address(String country, String city, String district, String street, String building) {
        this.country = country;
        this.city = city;
        this.district = district;
        this.street = street;
        this.building = building;
    }

    public String getCity() {
        return this.city;
    }

    public String getCountry() {
        return this.country;
    }

    public String getDistrict() {
        return this.district;
    }

    public String getStreet() {
        return this.street;
    }

    public String getBuilding() {
        return this.building;
    }

    public String getAdress() {
        return (this.country + " " + this.city + " " + this.district + " " + this.street + " " + this.building);
    }
}