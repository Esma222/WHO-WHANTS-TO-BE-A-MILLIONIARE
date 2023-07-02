
public class Participant {
    private String name;
    private BirthDay birthDate;
    private Phone phone;
    private Address address;
    private int numCorrect;
    private boolean participated;

    public Participant(String name, String inputDate, String inputPhone, String inputAddress) {
        this.name = name;

        String[] temp0 = inputDate.replace(".", "-").split("-");
        this.birthDate = new BirthDay(Integer.parseInt(temp0[2]), Integer.parseInt(temp0[1]),
                Integer.parseInt(temp0[0]));

        String[] temp1 = inputPhone.split(" ");
        this.phone = new Phone(temp1[0], temp1[1], temp1[2]);

        String[] temp2 = inputAddress.split(";");
        this.address = new Address(temp2[4], temp2[3], temp2[2], temp2[0], temp2[1]);

        this.numCorrect = 0;

        this.participated = false;
    }

    public String getName() {
        return this.name;
    }

    public String getBday() {
        return this.birthDate.getBday();
    }

    public String getAddress() {
        return this.address.getAdress();
    }

    public String getPhone() {
        return this.phone.getPhone();
    }

    public int getAge() {
        return this.birthDate.getAge();
    }

    public String getCountry() {
        return this.address.getCountry();
    }
    public String getCity() {
        return this.address.getCity();
    }
    public void isCorrect() {
        this.numCorrect++;
    }

    public int getCorrect() {
        return this.numCorrect;
    }

    public void setParticipated(boolean flag) {
        this.participated = flag;
    }

    public boolean isParticipated() {
        return this.participated;
    }
}
