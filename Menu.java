
package Orchester;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static void showMenu(ArrayList<Nastroj> nastrojList, ArrayList<Hrac> hracList) {
        Scanner scanner = new Scanner(System.in);
        int volba = 0;

        while (volba != 6) {
            System.out.println("\n1. Vypisat nastroje");
            System.out.println("2. Vypisat hrace");
            System.out.println("3. Vypisat cenu skladu");
            System.out.println("4. Vypisat cenu vystupenia");
            System.out.println("5. Sklad hraj");
            System.out.println("6. Konec");
            System.out.print("Vyberte volbu: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Neplatny vstup.");
                scanner.next();
                continue;
            }

            volba = scanner.nextInt();

            switch (volba) {
                case 1:
                    vypisatNastroje(nastrojList);
                    break;
                case 2:
                    vypisatHracov(hracList);
                    break;
                case 3:
                    vypisatCenuSkladu(nastrojList);
                    break;
                case 4:
                    System.out.print("Vyberte pocet hodin: ");
                    if (!scanner.hasNextInt()) {
                        System.out.println("Neplatny pocet hodin.");
                        scanner.next();
                        break;
                    }
                    int hodiny = scanner.nextInt();
                    vypisatCenuVystupenia(hracList, hodiny);
                    break;
                case 5:
                    skladHraj(nastrojList);
                    break;
                case 6:
                    System.out.println("Koniec menu.");
                    break;
                default:
                    System.out.println("Neplatna volba");
                    break;
            }
        }
    }

    public static void vypisatNastroje(ArrayList<Nastroj> nastrojList) {
        if (nastrojList == null || nastrojList.isEmpty()) {
            System.out.println("Ziadne nastroje.");
            return;
        }
        for (Nastroj nastroj : nastrojList) {
            System.out.println("druh: " + nastroj.getDruh() + ", cena: " + nastroj.getCena() + ", pocet: " + nastroj.getPocet());
        }
    }

    public static void vypisatHracov(ArrayList<Hrac> hracList) {
        if (hracList == null || hracList.isEmpty()) {
            System.out.println("Ziadni hraci.");
            return;
        }
        for (Hrac hrac : hracList) {
            System.out.println(hrac);
        }
    }

    public static void vypisatCenuSkladu(ArrayList<Nastroj> nastrojList) {
        if (nastrojList == null || nastrojList.isEmpty()) {
            System.out.println("Cena skladu: 0.0");
            return;
        }
        double spolu = 0;
        for (Nastroj nastroj : nastrojList) {
            spolu += nastroj.getCena() * nastroj.getPocet();
        }
        System.out.println("Cena skladu: " + spolu);
    }

    public static void vypisatCenuVystupenia(ArrayList<Hrac> hracList, int hodiny) {
        if (hracList == null || hracList.isEmpty() || hodiny <= 0) {
            System.out.println("Cena vystupenia: 0.0");
            return;
        }
        double cena = 0;
        for (Hrac hrac : hracList) {
            cena += hrac.getSadzba() * hodiny;
            System.out.println("Cena vystupenia: " + hrac.getMeno() + " " + hrac.getPriezvisko() + ": " + cena);

        }
    }

    public static void skladHraj(ArrayList<Nastroj> nastrojList) {
        if (nastrojList == null || nastrojList.isEmpty()) {
            System.out.println("Ziadne nastroje, nic nehrajeme.");
            return;
        }
        for (Nastroj nastroj : nastrojList) {
            String zvuk = nastroj.getZvuk();
            int pocet = nastroj.getPocet();
            for (int i = 0; i < pocet; i++) {
                System.out.println(zvuk);
            }
        }
    }
}