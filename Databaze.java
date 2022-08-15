import java.util.ArrayList;

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





}
