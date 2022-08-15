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

        //  METODY - PRÁCE S DATABÁZÍ

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

        // metoda nalezení záznamů podle JMÉNA a PRIJMENI......................................






}
