package soit.mint;

public enum PriceList {
    SCREW(5),
    SCREW_NUT(3),
    WASHER(1);

    private final int value;

    PriceList(final int value) {
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}
