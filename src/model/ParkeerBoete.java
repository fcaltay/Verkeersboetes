package model;

public class ParkeerBoete extends VerkeersBoete {
    private int zone;

    public ParkeerBoete(String naamDader, String kenteken, int zone) {
        super(naamDader, kenteken);
        this.zone = zone;
        setBedrag(bepaalBedrag());
    }

    public double bepaalBedrag() {
        double bedrag = DEFAULT_BEDRAG;
        if (zone == 1) {
            bedrag = 60;
        } else if (zone == 2) {
            bedrag = 100;
        } else if (zone == 3) {
            bedrag = 180;
        }
        return bedrag;
    }

    @Override
    public String toString() {
        return String.format("%s", super.toString());
    }
}

