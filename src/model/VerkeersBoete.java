package model;

import java.security.Key;

/**
 * @author Furkan Altay
 *  Het doel van deze opdracht is om een klasse te maken met twee sub-klassen.
 */
public class VerkeersBoete {
    public static final int DEFAULT_BEDRAG = 0;
    public static final String DEFAULT_NAAM_DADER = "onbekend";
    public static final String DEFAULT_KENTEKEN = "onbekend";
    private String naamDader;
    private String kenteken;
    private double bedrag;

    public VerkeersBoete(String naamDader, String kenteken, double bedrag) {
        this.naamDader = naamDader;
        this.kenteken = kenteken;
        this.bedrag = bedrag;
    }

    public VerkeersBoete(String naamDader, String kenteken) {
        this(naamDader, kenteken, DEFAULT_BEDRAG);
    }

    public VerkeersBoete() {
        this(DEFAULT_NAAM_DADER, DEFAULT_KENTEKEN, DEFAULT_BEDRAG);
    }

    public void setBedrag(double bedrag) {
        this.bedrag = bedrag;
    }

    public double getBedrag() {
        return bedrag;
    }

    @Override
    public String toString() {
        return String.format("Verkeersboete voor %s, kenteken %s, boete %.2f", this.naamDader, this.kenteken, getBedrag());
    }
}
