package Orchester;

public class Nastroj {
    private String druh;
    private double cena;
    private String zvuk;
    private int pocet;

    public Nastroj(String druh, double cena, String zvuk, int pocet) {
        setDruh(druh);
        setCena(cena);
        setZvuk(zvuk);
        setPocet(pocet);
    }

    public void setCena(double cena) {
        if (cena < 0)
            System.out.println("Cena nesmie byt mensia ako 0");
        else
            this.cena = cena;
    }

    public void setPocet(int pocet) {
        if (pocet < 0)
            System.out.println("Pocet nesmie byt mensi ako 0");
        else
            this.pocet = pocet;
    }

    public String getDruh() {
        return druh;
    }

    public double getCena() {
        return cena;
    }

    public String getZvuk() {
        return zvuk;
    }

    public int getPocet() {
        return pocet;
    }

    public void setDruh(String druh) {
        if (druh == null || druh.isEmpty() || !druh.matches("[a-zA-ZáäčďéěíľĺňóôöřšťúůüýžÁÄČĎÉĚÍĽĹŇÓÔÖŘŠŤÚŮÜÝŽ\\s]+"))
            this.druh = "neznamy";
        else
            this.druh = druh;
    }

    public void setZvuk(String zvuk) {
        if (zvuk == null || zvuk.isEmpty() || !zvuk.matches("[a-zA-ZáäčďéěíľĺňóôöřšťúůüýžÁÄČĎÉĚÍĽĹŇÓÔÖŘŠŤÚŮÜÝŽ\\s-]+"))
            this.zvuk = "neznamy";
        else
            this.zvuk = zvuk;
    }

    @Override
    public String toString() {
        return "Nastroj{" +
                "druh='" + druh + '\'' +
                ", cena=" + cena +
                ", zvuk='" + zvuk + '\'' +
                ", pocet=" + pocet +
                '}';
    }
}