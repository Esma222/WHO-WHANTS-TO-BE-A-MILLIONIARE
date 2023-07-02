public class Phone {
    private String countryCode;
    private String areaCode;
    private String localCode;

    public Phone(String countryCode, String areaCode, String localCode) {
        this.countryCode = countryCode;
        this.areaCode = areaCode;
        this.localCode = localCode;
    }

    public String getPhone() {
        return (this.countryCode + " " + this.areaCode + " " + this.localCode);
    }
}