package institut;

import excepcions.*;

public class Modul {
    private String nom;
    private int horesSetmanals;

    public Modul(String nom, int horesSetmanals) throws Exception {
        setNom(nom);
        setHoresSetmanals(horesSetmanals);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) throws InstitutException {
        if (nom == null) {
            throw new InstitutException("Valor null", 12);
        }
        if (nom.length() == 0) {
            throw new InstitutException("Cadena es 0", 125);
        }
        if (nom.matches(".*\\d.*")) {
            throw new InstitutException("numero a nes nom", 654);
        }
        this.nom = nom;
    }

    public int getHoresSetmanals() {
        return horesSetmanals;
    }

    public void setHoresSetmanals(int horesSetmanals) {
        this.horesSetmanals = horesSetmanals;
    }

    @Override
    public String toString() {
        return "Modul{" +
                "nom='" + nom + '\'' +
                ", horesSetmanals=" + horesSetmanals +
                '}';
    }
}
