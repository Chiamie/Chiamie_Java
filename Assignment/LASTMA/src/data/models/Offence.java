package data.models;

public enum Offence {
    ONE_WAY("one_Way", 5000),
    DRUNK_DRIVING("drunk_Driving",20_000),
    NO_SEAT_BELT("no_seat_belt",10_000),
    OVER_SPEEDING("over_speeding",300_000),;

    private final String name;
    private final int amount;
    Offence(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }
}
