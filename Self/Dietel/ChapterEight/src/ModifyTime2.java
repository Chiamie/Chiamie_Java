public class ModifyTime2 {
    private int second;

    public ModifyTime2(){
        this(0, 0, 0);
    }
    public ModifyTime2(int hour){
        this(hour, 0, 0);
    }
    public ModifyTime2(int hour, int minute) {
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
    public ModifyTime2(int hour, int minute, int second) {
        validateTime(hour, minute, second);
        this.second = hour * 3600 + minute * 60 + second;
    }
    public ModifyTime2(ModifyTime2 time) {
        this(time.getHour(), time.getMinute(), time.getSecond());
    }

    public void setTime(int hour, int minute, int second) {
        validateTime(hour, minute, second);
        this.second = hour * 3600 + minute * 60 + second;
    }

    public void setHour(int hour) {
        validateHour(hour);
        second = (second % 3600) + 3600 * hour;
    }

    public void setMinute(int minute) {
        validateMinute(minute);
        second = (second / 3600) * 3600 + minute * 60 + getSecond();
    }

    public void setSecond(int second) {
        validateSecond(second);
        this.second = getHour() * 3600 + getMinute() * 60 + second;
        }

//Get Methods
// get hour value
        public int getHour() {return this.second / 3600;}
//get minute value
        public int getMinute() {return (this.second % 3600) / 60;}
// get second value
        public int getSecond() {return this.second % 60;}

           // convert to String in universal-time format (HH:MM:SS)
        public String toUniversalString() {
            return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
        }
          // convert to String in standard-time format (H:MM:SS AM or PM)
        public String toString() {
            return String.format("%d:%02d:%02d %s",
                    ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
                    getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
        }
}





