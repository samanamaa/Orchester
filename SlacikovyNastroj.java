package Orchester;

public class SlacikovyNastroj extends StrunovyNastroj {
    private String sekcia;

    public SlacikovyNastroj(String druh, double cena, String zvuk, int pocet, int pocetStrun, String ladenie,
            String sekcia) {
        super(druh, cena, zvuk, pocet, pocetStrun, ladenie);
        setSekcia(sekcia);
    }

    public void setSekcia(String sekcia) {
        if (sekcia == null || sekcia.isEmpty()) {
            this.sekcia = "neznamy";
        } else {
            this.sekcia = sekcia;
        }
    }

    public String getSekcia() {
        return sekcia;
    }

    @Override
    public String toString() {
        return "SlacikovyNastroj{" +
                "sekcia='" + getSekcia() + '\'' +
                ", pocetStrun=" + getPocetStrun() +
                ", druh='" + getDruh() + '\'' +
                ", cena=" + getCena() +
                ", zvuk='" + getZvuk() + '\'' +
                ", pocet=" + getPocet() +
                '}';
    }
}
