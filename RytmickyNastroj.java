package Orchester;

public class RytmickyNastroj extends Nastroj {
    private int pocetZvukov;

    public RytmickyNastroj(String druh, double cena, String zvuk, int pocet, int pocetZvukov) {
        super(druh, cena, zvuk, pocet);
        setPocetZvukov(pocetZvukov);
    }

    public void setPocetZvukov(int pocetZvukov) {
        this.pocetZvukov = pocetZvukov;
        if (pocetZvukov < 1)
            System.out.println("Pocet zvukov nesmie byt mensi ako 1");
        else
            this.pocetZvukov = pocetZvukov;
    }

    public int getPocetZvukov() {
        return pocetZvukov;
    }

    @Override
    public String toString() {
        return "RytmickyNastroj{" +
                super.toString() +
                ", pocetZvukov=" + pocetZvukov +

                '}';
    }
}
