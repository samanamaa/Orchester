package Orchester;

public class Main {
    public static void main(String[] args) {
        Hrac hrac1 = new Hrac("Ján", "Novák", "gitara", 50.0);
        Hrac hrac2 = new Hrac("Mária", "Kováčová", "husle", 60.0);
        System.out.println("Hráči v orchestri:");
        System.out.println(hrac1);
        System.out.println(hrac2);
    }
}