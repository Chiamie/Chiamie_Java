public class EnhanceTime2 {
    private int hour;
    private int minute;
    private int second;

    public EnhanceTime2(){
        this(0, 0, 0);
    }

    public EnhanceTime2(int hour){
        this(hour, 0, 0);
    }

    public EnhanceTime2(int hour, int minute) {
        this(hour, minute, 0);
    }

    private void validateHour(int hour){
        if (hour < 0 || hour >= 24)
            throw new IllegalArgumentException("hour must be 0-23");
    }

    private void validateMinute(int minute){
        if (minute < 0 || minute >= 60)
            throw new IllegalArgumentException("minute must be 0-59");
    }

    private void validateSecond(int second){
        if (second < 0 || second >= 60)
            throw new IllegalArgumentException("second must be 0-59");
    }

    private void validateTime(int hour, int minute, int second){
        validateHour(hour);
        validateMinute(minute);
        validateSecond(second);
    }

    public EnhanceTime2(int hour, int minute, int second) {
        validateTime(hour, minute, second);
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public EnhanceTime2(EnhanceTime2 time) {
            this(time.hour, time.minute, time.second);
    }

    public void setTime(int hour, int minute, int second) {
        validateTime(hour, minute, second);
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setHour(int hour) {
        validateHour(hour);
        this.hour = hour;
    }

    public void setMinute(int minute) {
        validateMinute(minute);
        this.minute = minute;
    }

    public void setSecond(int second) {
        validateSecond(second);
        this.second = second;
    }


    public int getHour() {return this.hour;}
    public int getMinute() {return this.minute;}
    public int getSecond() {return this.second;}

    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }


    public String toString() {
        return String.format("%d:%02d:%02d %s",
                ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
                getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
        }
    }








