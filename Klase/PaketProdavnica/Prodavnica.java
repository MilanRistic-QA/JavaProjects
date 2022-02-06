package PaketProdavnica;

import Klase.Osoba;

import java.util.ArrayList;

public class Prodavnica {
    private String nazivProdavnice;
    private String ulica;
    private ArrayList<Osoba> nizZaposlenih =new ArrayList<>();
    private ArrayList<ProizvodNaStanju> nizProizvodaNaStanju =new ArrayList<>();
    private ArrayList<Račun> nizObavljenihKupovina =new ArrayList<>();

    public Prodavnica(String nazivProdavnice, String ulica) {
        this.nazivProdavnice = nazivProdavnice;
        this.ulica = ulica;
    }

    public String getNazivProdavnice() {
        return nazivProdavnice;
    }
    public String getUlica() {
        return ulica;
    }
    public ArrayList<Osoba> getNizZaposlenih() {
        return nizZaposlenih;
    }
    public ArrayList<ProizvodNaStanju> getNizProizvodaNaStanju() {
        return nizProizvodaNaStanju;
    }
    public ArrayList<Račun> getNizObavljenihKupovina() {
        return nizObavljenihKupovina;
    }

    public void setNazivProdavnice(String nazivProdavnice) {
        this.nazivProdavnice = nazivProdavnice;
    }
    public void setUlica(String ulica) {
        this.ulica = ulica;
    }
    public void setNizZaposlenih(ArrayList<Osoba> nizZaposlenih) {
        this.nizZaposlenih = nizZaposlenih;
    }
    public void setNizProizvodaNaStanju(ArrayList<ProizvodNaStanju> nizProizvodaNaStanju) {
        this.nizProizvodaNaStanju = nizProizvodaNaStanju;
    }
    public void setNizObavljenihKupovina(ArrayList<Račun> nizObavljenihKupovina) {
        this.nizObavljenihKupovina = nizObavljenihKupovina;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Naziv Prodavnice: ").append(nazivProdavnice).append("\n");
        sb.append("Ulica: ").append(ulica).append("\n");
        sb.append("Zaposleni radnici: \n");
        for (Osoba zaposleni: nizZaposlenih)
        sb.append(zaposleni.getIme()).append(" ").append(zaposleni.getPrezime()).append("\n");
        for (ProizvodNaStanju pS: nizProizvodaNaStanju)
        sb.append(pS.getProizvod()).append(" ").append(pS.getKoličinaNaStanju()).append("\n");
        return sb.toString();
    }
    public void dodajZaposlenog(Osoba zaposleni) {
        nizZaposlenih.add(zaposleni);
    }
    public void ukloniZaposlenog(Osoba zaposleni) {
        nizZaposlenih.remove(zaposleni);
    }
//    private ArrayList<Osoba> nizZaposlenih
}
