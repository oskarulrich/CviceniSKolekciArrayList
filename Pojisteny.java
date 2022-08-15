/**
 * Reprezentuje pojištěného v databázi pojištených
 */
public class Pojisteny {

    /**
     * Jméno
     */
    private String jmeno; // nabízí final - co to je????????????????????????????

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
     * Vrátí jako String vybrané paramatery instance Pojisteny
     *
     * @return Pojisteny
     */
    @Override
    public String toString() {
        return jmeno + "\t\t" + prijmeni + "\t\t" + vek + "\t" + telefonniCislo + "\n";
    }

}