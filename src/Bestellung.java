package src;

import src.utils.List;

public class Bestellung {
    private boolean bestaetigt;
    private int idnr;
    private List<Einhornfurzkissen> warenListe;

    public Bestellung() {
        warenListe = new List<>();
    }

    public List<Einhornfurzkissen> getWarenListe() {
        return warenListe;
    }

    public void addWare(Einhornfurzkissen pWare) {
        warenListe.append(pWare);
    }

    public boolean getBestaetigt() {
        return bestaetigt;
    }

    public void setBestaetigt(boolean bestaetigt) {
        this.bestaetigt = bestaetigt;
    }

    public int getIdnr() {
        return idnr;
    }

    public void setIdnr(int idnr) {
        this.idnr = idnr;
    }
}
