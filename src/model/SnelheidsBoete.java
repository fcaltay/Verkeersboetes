package model;

public class SnelheidsBoete extends VerkeersBoete{
    private int gemetenSnelheid;
    private int maximumSnelheid;

    public SnelheidsBoete(String naamDader, String kenteken, int gemetenSnelheid, int maximumSnelheid) {
        super(naamDader, kenteken);
        this.gemetenSnelheid = gemetenSnelheid;
        this.maximumSnelheid = maximumSnelheid;
        bepaalBedrag();
    }

    public double bepaalBedrag() {
        if (gemetenSnelheid -maximumSnelheid > 0 && gemetenSnelheid -maximumSnelheid <= 10) {
            setBedrag(10 * gemetenSnelheid);
        }
        else if (gemetenSnelheid -maximumSnelheid > 10 && gemetenSnelheid -maximumSnelheid <= 30) {
            setBedrag(15 * gemetenSnelheid);
        }
        else if (gemetenSnelheid -maximumSnelheid > 30 ) {
            setBedrag(10 * gemetenSnelheid);
        }
        else {
            setBedrag(DEFAULT_BEDRAG);
        }
        return getBedrag();
    }

    @Override
    public String toString() {
        return String.format("%s `voor %s km/u waar %s is toegestaan`", super.toString(), this.gemetenSnelheid, this.maximumSnelheid);
    }
}
