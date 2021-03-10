package soit.mint;

public class Order {
    private int screw;
    private int screw_nut;
    private int washer;

    public Order() {}

    public void setScrew(int screw) {
        this.screw = screw;
    }

    public void setScrew_nut(int screw_nut) {
        this.screw_nut = screw_nut;
    }

    public void setWasher(int washer) {
        this.washer = washer;
    }

    public boolean checkOrder() {
        return screw <= screw_nut;
    }

    public float totalPrice() {
        float totalScrew = this.screw * PriceList.SCREW.getValue();
        float totalScrewNut = this.screw_nut * PriceList.SCREW_NUT.getValue();
        float totalWasher = this.washer * PriceList.WASHER.getValue();
        return totalScrew + totalScrewNut + totalWasher;
    }
}
