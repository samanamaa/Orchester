package Orchester;

public class StrunovyNastroj extends Nastroj {
    private int pocetStrun;
    private String ladenie;

    public StrunovyNastroj(String druh, double cena, String zvuk, int pocet, int pocetStrun, String ladenie) {
        super(druh, cena, zvuk, pocet);
        setPocetStrun(pocetStrun);
        setLadenie(ladenie);
    }

    public void setPocetStrun(int pocetStrun) {
        if (pocetStrun < 0) {
            System.out.println("Pocet strun nesmie byt mensi ako 0");
        } else {
            this.pocetStrun = pocetStrun;
        }
    }

    public void setLadenie(String ladenie) {
        if (ladenie == null || ladenie.isEmpty()) {
            this.ladenie = "nezname";
        } else {
            this.ladenie = ladenie;
        }
    }

    public int getPocetStrun() {
        return pocetStrun;
    }

    public String getLadenie() {
        return ladenie;
    }

    @Override
    public String toString() {
        return "StrunovyNastroj{" +
                "pocetStrun=" + pocetStrun +
                ", druh='" + getDruh() + '\'' +
                ", cena=" + getCena() +
                ", zvuk='" + getZvuk() + '\'' +
                ", pocet=" + getPocet() +
                '}';
    }

}