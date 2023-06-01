package piles;

public class Preferencia {
    private int ordre;
    private String plat;

    public Preferencia(int ordre, String plat) {
        this.ordre = ordre;
        this.plat = plat;
    }

    public int getOrdre() {
        return ordre;
    }

    public String getPlat() {
        return plat;
    }

    @Override
    public String toString() {
        return "Preferencia{" +
                "ordre=" + ordre +
                ", plat='" + plat + '\'' +
                '}';
    }
}
