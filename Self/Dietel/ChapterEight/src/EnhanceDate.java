public class EnhanceDate {
    private int year;
    private int month;
    private int day;

    private static final int[] daysPerMonth =
            {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private void validateMonth(int month) {
        if (month <= 0 || month > 12)
            throw new IllegalArgumentException("month (" + month + ") is not between 1 and 12");
    }

    private void validateDay(int day, int month) {
        if (day <= 0 ||
                (day > daysPerMonth[month] && !(month == 2 && day == 29))){
            throw new IllegalArgumentException("day (" + day + ") is out of range for " +
                    "the specified month and year");
        }
    }

    private void checkForLeapYear(int year, int month, int day) {
        if (month == 2 && day == 29 && !(year % 400 == 0 ||
                (year % 4 == 0 && year % 100 != 0))){
            throw new IllegalArgumentException("day (" + day + ") is out of range for the" +
                    "specified month and year");
        }
    }

    private void validateYear(int year) {
        String pattern = "^\\d{4}$";
        if (!String.valueOf(year).matches(pattern))
            throw new IllegalArgumentException("year (" + year + ") is not a valid year");
    }

    public EnhanceDate(int year, int month, int day) {
        validateDay(day, month);
        validateMonth(month);
        validateYear(year);
        checkForLeapYear(year, month, day);
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String getDate() {
        return String.format("Date object constructor" +
                "for date %s%n", this);
    }

    public String toString() {
        return String.format("%d/%d/%d", month, day, year);
    }

    public void nextDay() {
        if (day == daysPerMonth[month]) {
            day = 1;
            month++;
        }
        else day++;
    }


}
