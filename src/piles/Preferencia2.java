package piles;

import java.util.Objects;

public class Preferencia2 {
    private int ordre;
    private String plat;

    public Preferencia2(int ordre, String plat) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Preferencia2 that = (Preferencia2) o;
        return ordre == that.ordre && Objects.equals(plat, that.plat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ordre, plat);
    }
}
