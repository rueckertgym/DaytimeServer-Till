package src;

public class Einhornfurzkissen {
    private String groesse;
    private String farbe;
    private double preis;

    public Einhornfurzkissen() {

    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public void setGroesse(String groesse) {
        this.groesse = groesse;
    }

    public String getGroesse() {
        return groesse;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public String getFarbe() {
        return farbe;
    }
}
