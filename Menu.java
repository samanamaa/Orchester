
package Orchester;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static void showMenu(ArrayList<Nastroj> nastrojList, ArrayList<Hrac> hracList) {
        Scanner scanner = new Scanner(System.in);
        int volba = 0;
        Lod lod1 = new Lod("Lod1", 1000.0, "Lod", 5, "Krst");

        while (volba != 11) {
            System.out.println("\n1. Vypisat nastroje");
            System.out.println("2. Vypisat hracov");
            System.out.println("3. Vypisat cenu skladu");
            System.out.println("4. Vypisat cenu vystupenia");
            System.out.println("5. Sklad hraj");
            System.out.println("6. Akord");
            System.out.println("7. Náklady vystúpenia");
            System.out.println("8. Obsadenie orchestra");
            System.out.println("9. Orchester hraj");
            System.out.println("10. Krst lode");
            System.out.println("11. Koniec");


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
                    vypisAkord(nastrojList,lod1);
                    break;
                case 7:
                    vypisatNakladyVystupenia(hracList, nastrojList);
                    break;
                case 8:
                    vypisatObsadenieOrchestra(hracList);
                    break;
                case 9:
                    orchesterHraj(hracList, nastrojList);
                    break;
                case 10:
                    krstLode(hracList, nastrojList, lod1);
                    break;
                case 11:
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
    
    public static void vypisAkord(ArrayList<Nastroj> nastrojList,Lod lod1) {
        if (nastrojList == null || nastrojList.isEmpty()) {
            System.out.println("Ziadne nastroje, nic nehrajeme.");
            return;
        }
        for (Nastroj nastroj : nastrojList) {
            String akord = nastroj.getZvuk();
            int pocet = nastroj.getPocet();
            for (int i = 0; i < pocet; i++) {
                System.out.println(akord);
            }
        }
        System.out.println(lod1.getZvuk());
        
    }
    public static void vypisatNakladyVystupenia(ArrayList<Hrac> hracList,ArrayList<Nastroj> nastrojList) {
        if (hracList == null || hracList.isEmpty()) {
            System.out.println("Ziadni hraci.");
            return;
        }
        if (nastrojList == null || nastrojList.isEmpty()) {
            System.out.println("Ziadne nastroje.");
            return;
        }

        double naklady = 0;
        for (Hrac hrac : hracList) {
            naklady += hrac.getSadzba();
        }
        for (Nastroj nastroj : nastrojList) {
            naklady += nastroj.getCena() * 0.002;
        }
        System.out.println("Naklady vystupenia: " + naklady);
    }
    public static void  vypisatObsadenieOrchestra(ArrayList<Hrac> hracList){
        if (hracList == null || hracList.isEmpty()) {
            System.out.println("Ziadni hraci.");
            return;
        }
        for (Hrac hrac : hracList) {
            System.out.println(hrac.getMeno() + " " + hrac.getPriezvisko() + " - " + hrac.getNastroj());
        }
    }
    public static void orchesterHraj(ArrayList<Hrac> hracList,ArrayList<Nastroj> nastrojList){
        if (hracList == null || hracList.isEmpty()) {
            System.out.println("Ziadni hraci, orchester nehra.");
            return;
        }
        if (nastrojList == null || nastrojList.isEmpty()) {
            System.out.println("Ziadne nastroje, orchester nehra.");
            return;
        }
        for (Hrac hrac : hracList) {
            String nastrojHrac = hrac.getNastroj();
            for (Nastroj nastroj : nastrojList) {
                if (nastroj.getDruh().equals(nastrojHrac)) {
                    String zvuk = nastroj.getZvuk();
                    System.out.println(zvuk);
                }
            }
        }
    }
    public static void krstLode(ArrayList<Hrac> hracList,ArrayList<Nastroj> nastrojList,Lod lod1){
        orchesterHraj(hracList, nastrojList);
        System.out.println(lod1.getZvuk());
        lod1.spustiNaVodu();
        System.err.println("Stav lode po krste: " + (lod1.isNaVode() ? "na vode" : "nie na vode"));

    }
}