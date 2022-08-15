/**
 *
 * @author Oskar Ulrich
 * ×××××××××××××××××××××××××××××××
 * × Cvičení s kolekcí ArrayList ×
 * ×××××××××××××××××××××××××××××××
 */
// package website.ulrich.evidencepojisteni;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Reprezentuje databázi pojištěných
 */
public class Databaze {

    /**
     * Název databáze
     */
    private String nazev;

    /**
     * Kolekce pojištených
     */
    private ArrayList<Pojisteny> pojisteni = new ArrayList<>();

    /**
     * Inicializuje novou instanci
     *
     * @param nazev
     */
    public Databaze(String nazev) {
        this.nazev = nazev;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "" + pojisteni;
    }

    // METODY - PRÁCE S DATABÁZÍ

    // VOLBA 1 -----------------------------------------------------------------

    /**
     * Přidá pojištěného do databáze
     *
     * @param pojisteny Pojisteny
     */
    public void pridejPojisteneho(Pojisteny pojisteny) {
        pojisteni.add(pojisteny);
        Collections.sort(pojisteni); // seřadí pojištěné abecedně podle příjmení
    }

    // VOLBA 2 -----------------------------------------------------------------

    /**
     * Vrátí výpis pojištěných v databázi (v kolekci)
     *
     * @return výpis pojištěných
     */
    public String getSeznamPojistenych() {
        String s = "";
        for (Pojisteny i : pojisteni) {
            s += i;
        }
        return s;
    }

    /**
     * Vrátí počet pojištěných v databázi
     *
     * @return Počet pojištěných v databázi
     */
    public int getPocetPojistenych() {
        return pojisteni.size();
    }

    // VOLBA 3 -----------------------------------------------------------------
    // metoda vyhledávání záznamů podle PŘÍJMENÍ

    public ArrayList<Pojisteny> najdiPojistenehoPodlePrijmeni(String hledanePrijmeni, boolean dlePrijmeni) {
        ArrayList<Pojisteny> nalezenePrijmeni = new ArrayList<>();
        for (Pojisteny z : pojisteni) {
            if ((dlePrijmeni && z.getPrijmeni().equals(hledanePrijmeni))) {
                nalezenePrijmeni.add(z);
            }
        }
        return nalezenePrijmeni;
    }

    // VOLBA 4 -----------------------------------------------------------------
    // metoda nalezení záznamů podle JMÉNA a PŘÍJMENÍ

    public ArrayList<Pojisteny> najdiPojisteneho(String hledaneJmeno, String hledanePrijmeni) {
        ArrayList<Pojisteny> nalezeneZaznamy = new ArrayList<>();
        for (Pojisteny z : pojisteni) {
            if ((z.getJmeno().equals(hledaneJmeno)) && (z.getPrijmeni().equals(hledanePrijmeni))) {
                nalezeneZaznamy.add(z);
            }
        }
        return nalezeneZaznamy;
    }

}
