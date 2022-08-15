import java.util.ArrayList;
import java.util.Scanner;

public class EvidencePojisteni {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in, "Windows-1250");

        // Vytvoření nové databáze
        Databaze databaze = new Databaze("Evidence pojištění");

        // hlavní cyklus
        String volba = "";
        while (!volba.equals("4")) {
            // výpis možností
            System.out.println("-----------------------------------------------");
            System.out.println("Evidence pojištěných");
            System.out.println("-----------------------------------------------");
            System.out.println();
            System.out.println("Vyberte požadovanou akci: ");
            System.out.println("1 - Přidat nového pojištěného");
            System.out.println("2 - Vypsat všechny pojištěné");
            System.out.println("3 - Vyhledat pojištěného");
            System.out.println("4 - Konec");
            System.out.print("Zadejte číslo 1 - 4... ");
            volba = sc.nextLine().trim();
            System.out.println();
            // Reakce na volbu
            switch (volba) {
                // Přidání nového pojištěného
                case "1":
                    System.out.print("Zadejte jméno nového pojištěného: ");
                    String jmeno = sc.nextLine().trim();
                    System.out.print("Zadejte příjmení: ");
                    String prijmeni = sc.nextLine().trim();
                    System.out.print("Zadejte věk: ");
                    int vek = Integer.parseInt(sc.nextLine().trim());
                    System.out.print("Zadejte telefonní číslo: ");
                    int telefonniCislo = Integer.parseInt(sc.nextLine().trim());
                    Pojisteny novyPojisteny = new Pojisteny(jmeno, prijmeni, vek, telefonniCislo);
                    databaze.pridejPojisteneho(novyPojisteny);
                    System.out.print("\nNový pojištěný " + jmeno + " " + prijmeni + " byl vložený do databáze.\n\nPokračujte libovolnou klávesou... ");
                    String pokracovani = sc.nextLine();
                    System.out.println("\n\n\n\n");
                    break;
                // Výpis všech pojištěných
                case "2":
                    System.out.println("Seznam všech pojištěných:\n" + "jméno\t\tpříjmení\tvěk\ttelefonní číslo\n" + databaze.getSeznamPojistenych());
                    // Výpis počtu záznamů v ArrayListu (v databázi)
                    System.out.println("Celkem pojištěných v databázi: " + databaze.getPocetPojistenych() + "\n");
                    System.out.print("Pokračujte libovolnou klávesou... ");
                    pokracovani = sc.nextLine();
                    System.out.println("\n\n\n\n");
                    break;
                // Vyhledání pojištěného podle PŘÍJMENÍ
                case "3":
                    System.out.print("Zadejte příjmení hledaného pojištěného: ");
                    String hledanePrijmeni = sc.nextLine().trim();
                    ArrayList<Pojisteny> pojisteni = databaze.najdiPojistenehoPodlePrijmeni(hledanePrijmeni, true);
                    System.out.println("\nNalezení pojištění: ");
                    System.out.println("jméno\t\tpříjmení\tvěk\ttelefonní číslo");
                    for (Pojisteny z : pojisteni) {
                        System.out.print(z);
                    }
                    System.out.print("\nPokračujte libovolnou klávesou... ");
                    pokracovani = sc.nextLine();
                    System.out.println("\n\n\n\n");
                // Ukončení programu
                case "4":
                    System.out.print("Děkujeme za použití programu.\n\nLibovolnou klávesou program ukončíte... ");
                    pokracovani = sc.nextLine();
                    System.out.println("\n\n\n\n");
                    System.out.println("-----------------------------------------------");
                    System.out.println("Program byl ukončen");
                    System.out.println("-----------------------------------------------");
                    break;
                // Chybná volba
                default:
                    System.out.print("Neplatné zadání. \n\nStiskněte libovolnou klávesu a opakujte výběr akce... ");
                    pokracovani = sc.nextLine();
                    System.out.println("\n\n\n\n");
                    break;
            }

        }

    }

}