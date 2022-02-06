package Klase;

public class Automobil {
    //Atributi
    private String marka;
    private String zemljaProizvodnje;
    private int godište;
    private double kilometraža;
    //Konstruktor
    public Automobil(String marka, String zemljaProizvodnje, int godište, double kilometraža) {
        this.marka = marka;
        this.zemljaProizvodnje = zemljaProizvodnje;
        this.godište = godište;
        this.kilometraža = kilometraža;
    }
    //getter metode
    public String getMarka() {
        return marka;
    }
    public String getZemljaProizvodnje() {
        return zemljaProizvodnje;
    }
    public int getGodište() {
        return  godište;
    }
    public double getKilometraža() {
        return kilometraža;
    }
    //seter metode
    public void setMarka (String marka) {
        this.marka = marka;
    }
    public void setZemljaProizvodnje (String zemljaProizvodnje) {
        this.zemljaProizvodnje = zemljaProizvodnje;
    }
    public void setGodište(int godište) {
        this.godište = godište;
    }
    public void setKilometraža(double kilometraža) {
        this.kilometraža = kilometraža;
    }

    public String toString() {
        /*String stringKojiVraćam;
        stringKojiVraćam="Marka automobila je "+marka+"\n";
        stringKojiVraćam+="Zemlja proizvodnje je "+zemljaProizvodnje+"\n";
        stringKojiVraćam+="Godina proizvodnje automobila je "+godište+"\n";
        stringKojiVraćam+="Auto jr prešao "+kilometraža+"Km"+"\n";
        return stringKojiVraćam;*/
        StringBuilder sb = new StringBuilder();
        sb.append("Marka automobila je "+marka+"\n");
        sb.append("Zemlja proizvodnje je "+zemljaProizvodnje+"\n");
        sb.append("Godina proizvodnje automobila je "+godište+"\n");
        sb.append("Auto jr prešao "+kilometraža+"Km"+"\n");
        return sb.toString();
    }
}
