package Orchester;

public class KlavesovyNastroj extends Nastroj {
    private int pocetKlavies;

    public KlavesovyNastroj(String druh, double cena, String zvuk, int pocet, int pocetKlavies) {
        super(druh, cena, zvuk, pocet);
        setPocetKlavies(pocetKlavies);
    }

    public void setPocetKlavies(int pocetKlavies) {
        if (pocetKlavies < 0) {
            System.out.println("Pocet klavies nesmie byt mensi ako 0");
        } else {
            this.pocetKlavies = pocetKlavies;
        }
    }

    public int getPocetKlavies() {
        return pocetKlavies;
    }

    @Override
    public String toString() {
        return "KlavesovyNastroj{" +
                "pocetKlavies=" + getPocetKlavies() +
                ", druh='" + getDruh() + '\'' +
                ", cena=" + getCena() +
                ", zvuk='" + getZvuk() + '\'' +
                ", pocet=" + getPocet() +
                '}';
    }

}
