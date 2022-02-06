package Klase;

public class BankovniRačun {
    private Osoba osoba;
    private double stanjeNaRačunu;

    public BankovniRačun(Osoba osoba) {
        this.osoba=osoba;
        stanjeNaRačunu=0;
    }
    public BankovniRačun(Osoba osoba, double stanjeNaRačunu) {
        this.osoba=osoba;
        this.stanjeNaRačunu=stanjeNaRačunu;
    }
    public Osoba getOsoba(){
        return osoba;
    }
    public double getStanjeNaRačunu() {
        return stanjeNaRačunu;
    }
    public void setOsoba(Osoba osoba) {
        this.osoba=osoba;
    }
    public void setStanjeNaRačunu(double stanjeNaRačunu) {
        this.stanjeNaRačunu=stanjeNaRačunu;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vlasnik računa je ").append(osoba.getIme()).append(" ").append(osoba.getPrezime()).append("\n");
        sb.append("Stanje na računu: ").append(stanjeNaRačunu).append("\n");
        return sb.toString();
    }
    public void Uplata(Double uplata) {
        stanjeNaRačunu+=uplata;
    }
    public void Isplata(Double isplata) {
        if (stanjeNaRačunu<isplata)
            System.out.println("Nemate dovoljno sredstava na računu!");
        else {
            stanjeNaRačunu-=isplata;
        }
    }
}
