package Orchester;

public class Hrac {
    private String meno;
    private String priezvisko;
    private String nastroj;
    private double sadzba;

    public Hrac(String meno, String priezvisko, String nastroj, double sadzba) {
        setMeno(meno);
        setPriezvisko(priezvisko);
        setNastroj(nastroj);
        setSadzba(sadzba);
    }

    public void setMeno(String meno) {
        if (meno != null && !meno.isEmpty() || meno.matches("[a-zA-ZáäčďéěíľĺňóôöřšťúůüýžÁÄČĎÉĚÍĽĹŇÓÔÖŘŠŤÚŮÜÝŽ\\s]+")) {
            this.meno = meno;
        } else {
            this.meno = "neznáme";
        }
    }

    public void setPriezvisko(String priezvisko) {
        if (priezvisko != null && !priezvisko.isEmpty()
                || priezvisko.matches("[a-zA-ZáäčďéěíľĺňóôöřšťúůüýžÁÄČĎÉĚÍĽĹŇÓÔÖŘŠŤÚŮÜÝŽ\\s]+")) {
            this.priezvisko = priezvisko;
        } else {
            this.priezvisko = "neznáme";
        }
    }

    public void setNastroj(String nastroj) {
        if (nastroj != null && !nastroj.isEmpty()
                || nastroj.matches("[a-zA-ZáäčďéěíľĺňóôöřšťúůüýžÁÄČĎÉĚÍĽĹŇÓÔÖŘŠŤÚŮÜÝŽ\\s]+")) {
            this.nastroj = nastroj;
        } else {
            this.nastroj = "neznámy";
        }
    }

    public void setSadzba(double sadzba) {
        if (sadzba >= 0) {
            this.sadzba = sadzba;
        } else {
            System.out.println("Sadzba nemôže byť záporná. Nastavujem na 0.");
            this.sadzba = 0;
        }
    }

    public String getMeno() {
        return meno;
    }

    public String getPriezvisko() {
        return priezvisko;
    }

    public String getNastroj() {
        return nastroj;
    }

    public double getSadzba() {
        return sadzba;
    }

    @Override
    public String toString() {
        return "Hráč: " + meno + " " + priezvisko + ", Nástroj: " + nastroj + ", Sadzba: " + sadzba;
    }
}