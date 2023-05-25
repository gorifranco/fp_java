package institut;

import excepcions.InstitutException;

import java.util.ArrayList;

/**
 * @author joan
 */
public class CicleArrayList {

    private String nom;
    private int alumnes;
    private ArrayList<Modul> moduls;
    private int maximModuls;

    public ArrayList<Modul> getModuls() {
        return moduls;
    }

    public void setModuls(ArrayList<Modul> moduls) {
        this.moduls = moduls;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAlumnes() {
        return alumnes;
    }

    public void setAlumnes(int alumnes) {
        this.alumnes = alumnes;
    }

    public CicleArrayList(String nom, int alumnes, int maximModuls) {
setNom(nom);
        this.alumnes = alumnes;
        moduls = new ArrayList<>();
        this.maximModuls = maximModuls;
    }

    @Override
    public String toString() {
        return "Cicle{" + "nom=" + nom + ", alumnes=" + alumnes + '}';
    }

    /**
     * Afegeix el mòdul que li arriba com a paràmetre a la llista si no hem
     * arribat al màxim de mòduls que pot tenir el cicle.
     *
     * @param nou El mòdul que afegirem
     * @return true si l'ha pogut afegir, false si el cicle ja té el màxim de
     * mòduls permesos.
     */
    public boolean afegirModul(Modul nou){

        if (moduls.size() < maximModuls) {
            moduls.add(nou);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Torna el mòdul que té per nom el paràmetre que rep.
     *
     * @param nom EL nom del mòdul que cercam
     * @return El mòdul que hem trobat, o null si no el trobam
     */
    private Modul cercarModul(String nom){

        for (Modul m : moduls) {
            if (m.getNom().equalsIgnoreCase(nom)) {
                return m;
            }
        }
        return null;
    }

    /**
     * Elimina el mòdul que té per nom el paràmetre que rep. Utilitza el mètode
     * intern.
     *
     * @param nom El nom del mòdul que volem eliminar.
     * @return true si l'ha trobat i l'ha pogut eliminar, false en cas contrari.
     */
    public boolean eliminarModul(String nom){
        Modul eliminat = cercarModul(nom);
        if (eliminat != null) {
            moduls.remove(eliminat);
            return true;
        }

        return false;
    }

    /**
     * Elimina el mòdul que té per nom el paràmetre que rep.
     *
     * @param nom El nom del mòdul que volem eliminar.
     * @return true si l'ha trobat i l'ha pogut eliminar, false en cas contrari.
     */
    public boolean eliminarModul2(String nom) throws InstitutException{

        if(nom.length() == 0){
            throw new InstitutException("Cadena buida", 12);
        }
        for (int i = 0; i < moduls.size(); i++) {
            if (moduls.get(i).getNom().equalsIgnoreCase(nom)) {
                moduls.remove(i);
                return true;
            }
        }
        return false;
    }

    /**
     * Torna el mòdul que té per nom el paràmetre que ha rebut.
     *
     * @param nom
     * @return
     */

}


