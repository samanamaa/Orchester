package Orchester;

public class Dychovy extends Nastroj {
    private int pocetDier;
    private String Ladenie;
    public Dychovy(String druh, double cena, String zvuk, int pocet, int pocetDier, String ladenie) {
        super(druh, cena, zvuk, pocet);
        setPocetDier(pocetDier);
        setLadenie(ladenie);
    }
    public void setPocetDier(int pocetDier) {
        if (pocetDier < 0) System.out.println("Pocet dier nesmie byt mensi ako 0");
        else this.pocetDier = pocetDier;
    }
    public void setLadenie(String ladenie) {
        if (ladenie == null) this.Ladenie = "neznamy";
        else this.Ladenie = ladenie;
    }
    public int getPocetDier() {
        return pocetDier;
    }
    public String getLadenie() {
        return Ladenie;
    }
    @Override
    public String toString() {
        return "Dychovy{" +
                "pocetDier=" + pocetDier +
                ", Ladenie='" + Ladenie + '\'' +
                "} " + super.toString();
    }
}
