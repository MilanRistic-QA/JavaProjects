package PaketProdavnica;

import Klase.Osoba;

import java.util.ArrayList;

public class Račun {
    private ArrayList<Proizvod> nizKupljenihProizvoda;
    private String Datum;
    private Osoba kupac;
    private Osoba prodavac;
    private double iznos;

    public Račun(ArrayList<Proizvod> nizKupljenihProizvoda, String datum, Osoba kupac, Osoba prodavac, double iznos) {
        this.nizKupljenihProizvoda = nizKupljenihProizvoda;
        Datum = datum;
        this.kupac = kupac;
        this.prodavac = prodavac;
        if (nizKupljenihProizvoda.get(0).nijeNegativan(iznos))
        this.iznos = iznos;
    }

    public ArrayList<Proizvod> getNizKupljenihProizvoda() {
        return nizKupljenihProizvoda;
    }
    public String getDatum() {
        return Datum;
    }
    public Osoba getKupac() {
        return kupac;
    }
    public Osoba getProdavac() {
        return prodavac;
    }
    public double getIznos() {
        return iznos;
    }

    public void setNizKupljenihProizvoda(ArrayList<Proizvod> nizKupljenihProizvoda) {
        this.nizKupljenihProizvoda = nizKupljenihProizvoda;
    }
    public void setDatum(String datum) {
        Datum = datum;
    }
    public void setKupac(Osoba kupac) {
        this.kupac = kupac;
    }
    public void setProdavac(Osoba prodavac) {
        this.prodavac = prodavac;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Kupac: ").append(kupac.getIme()).append(" ").append(kupac.getPrezime()).append("\n");
        sb.append("Prodavac: ").append(prodavac.getIme()).append(" ").append(prodavac.getPrezime()).append("\n");
        sb.append("Datum: ").append(Datum).append("\n");
        sb.append("Iznos: ").append(iznos).append("\n");
        sb.append("Kupljeni proizvodi:\n");
        for (Proizvod nekiProizvod: nizKupljenihProizvoda) {
            sb.append("Naziv: ").append(nekiProizvod.getNazivProizvoda()).append(", ");
            sb.append(nekiProizvod.getCenaProizvoda()).append("\n");
        }
        return sb.toString();
        }
    public void dodajProizvod(Proizvod nekiProizvod) {
        nizKupljenihProizvoda.add(nekiProizvod);
    }
    public void ukloniProizvod(Proizvod nekiProizvod) {
        nizKupljenihProizvoda.remove(nekiProizvod);
    }
}
