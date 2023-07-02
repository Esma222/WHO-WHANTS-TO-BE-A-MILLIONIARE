import java.time.LocalDate;

public class BirthDay {
    private int year;
    private int month;
    private int day;
    private int age;
    LocalDate today = LocalDate.now();

    public BirthDay(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getAge() {
        int curYear = today.getYear() - 1;
        age = curYear - year;
        if (month >= today.getMonthValue() && day >= today.getDayOfMonth())
            age++;
        return age;
    }

    public int getDay() {
        return this.day;
    }

    public int getmonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    public String getBday() {
        return (String.valueOf(this.day) + "." + String.valueOf(this.month) + "." + String.valueOf(this.year));
    }

}