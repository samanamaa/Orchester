package Orchester;

public class Lod extends Nastroj {
    private String typ;
    private boolean naVode;

    public Lod(String druh, double cena, String zvuk, int pocet, String typ) {
        super(druh, cena, zvuk, pocet);
        setTyp(typ);
        this.naVode = false;
    }

    public void setTyp(String typ) {
        if (typ == null || typ.isEmpty())
            this.typ = "neznámy";
        else
            this.typ = typ;
    }

    public String getTyp() {
        return typ;
    }

    public boolean isNaVode() {
        return naVode;
    }

    public void spustiNaVodu() {
        if (!naVode) {
            naVode = true;
            System.out.println("Loď " + getDruh() + " sa spustila na vodu.");
        } else {
            System.out.println("Loď " + getDruh() + " je už na vode.");
        }
    }

    public void vydatZvuk() {
        System.out.println(getZvuk());
    }

    @Override
    public String toString() {
        return "Loď{" +
                "druh='" + getDruh() + '\'' +
                ", typ='" + typ + '\'' +
                ", naVode=" + naVode +
                ", cena=" + getCena() +
                ", zvuk='" + getZvuk() + '\'' +
                ", pocet=" + getPocet() +
                '}';
    }
}