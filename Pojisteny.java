/**
 *
 * @author Oskar Ulrich
 * ×××××××××××××××××××××××××××××××
 * × Cvičení s kolekcí ArrayList ×
 * ×××××××××××××××××××××××××××××××
 */
// package website.ulrich.evidencepojisteni;

/**
 * Reprezentuje pojištěného v databázi pojištených
 */
public class Pojisteny implements Comparable<Pojisteny> { // implementace interface

    /**
     * Jméno
     */
    private String jmeno;

    /**
     * Příjmení
     */
    private String prijmeni;

    /**
     * Věk v letech
     */
    private int vek;

    /**
     * Telefonní číslo
     */
    private int telefonniCislo;

    /**
     * Inicalizuje instanci Pojisteny
     *
     * @param jmeno
     * @param prijmeni
     * @param vek
     * @param telefonniCislo
     */
    public Pojisteny(String jmeno, String prijmeni, int vek, int telefonniCislo) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
        this.telefonniCislo = telefonniCislo;
    }

    /**
     * Vrátí jméno
     *
     * @return jmeno
     */
    public String getJmeno() {
        return jmeno;
    }

    /**
     * Vrátí příjmení
     *
     * @return prijmeni
     */
    public String getPrijmeni() {
        return prijmeni;
    }

    /**
     * Vrátí jako String vybrané paramatery instance Pojisteny
     *
     * @return Pojisteny
     */
    @Override
    public String toString() {
        return jmeno + "\t\t" + prijmeni + "\t\t" + vek + "\t" + telefonniCislo + "\n";
    }

    /**
     * Nově přidaný záznam bude porovnaný a abecedně zařazený do ArrayListu podle parametru příjmení
     *
     * @param x bude porovnávaný s příjmením
     * @return
     */
    @Override
    public int compareTo(Pojisteny x) {
        return this.prijmeni.compareTo(x.prijmeni);
    }

}
