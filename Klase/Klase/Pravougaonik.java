package Klase;

public class Pravougaonik {
    private double dužina;
    private double visina;

    public Pravougaonik(double dužina, double visina) {
        this.dužina = dužina;
        this.visina = visina;
    }
    public double getDužina() {
        return dužina;
    }
    public double getVisina() {
        return visina;
    }
    public void setDužina(double dužina) {
        this.dužina = dužina;
    }
    public void setVisina(double visina) {
        this.visina = visina;
    }
    //metode obim i površina
    public double Obim() {
        double obim = 2 * dužina + 2 * visina;
        return obim;
    }
    public double Površina() {
        double površina = dužina*visina;
        return površina;
    }
    public String toString() {
        /*String ispisObjekta;
        ispisObjekta = "Dužina pravougaonika je "+dužina+"\n";
        ispisObjekta+= "Visina pravougaonika je "+visina+"\n";
        return ispisObjekta;*/
        StringBuilder ispisObjekta = new StringBuilder();
        ispisObjekta.append("Dužina pravougaonika je "+dužina+"\n");
        ispisObjekta.append("Visina pravougaonika je "+visina+"\n");
        return ispisObjekta.toString();
    }
}



