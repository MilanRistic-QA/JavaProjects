package Klase;

public class Krug {
    double prečnik;

    public Krug(double prečnik) {
        if (prečnik<0) {
            System.out.println("Greška! Uneli ste negativan prečnik!");
        } else
        this.prečnik = prečnik;
    }
    public double getPrečnik() {
        return prečnik;
    }
    public void setPrečnik(double prečnik) {
        if (prečnik<0) {
            System.out.println("Greška! Uneli ste negativan prečnik!");
        } else
        this.prečnik = prečnik;
    }
    public double Poluprečnik() {
        double poluprečnik = prečnik/2;
        return poluprečnik;

    }
    public double Obim() {
        double obim=2* Poluprečnik() *Math.PI;
        return obim;
    }
    public double Površina() {
        double površina = Poluprečnik() * Poluprečnik() *Math.PI;
        return površina;
    }
    public String toString() {
        /*return "Prečnik kruga je "+prečnik;*/ //StringBuilder kao ni String klase nisu potrebne
        StringBuilder sb = new StringBuilder("Prečnik kruga je "+prečnik);
        return sb.toString();
    }
}
