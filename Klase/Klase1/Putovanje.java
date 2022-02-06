package Klase1;

import Klase.Automobil;
import Klase.Osoba;

import java.util.ArrayList;

public class Putovanje {
    private Grad destinacija;
    private Osoba vodjaPuta;
    private Automobil vozilo;
    private double udaljenostUKm;
    private ArrayList<Osoba> prijavljeneOsobe = new ArrayList<>();

    public ArrayList<Osoba> getPrijavljeneOsobe() {
        return prijavljeneOsobe;
    }
    public void setPrijavljeneOsobe(ArrayList<Osoba> prijavljeneOsobe) {
        this.prijavljeneOsobe = prijavljeneOsobe;
    }
    //Nekad je pametno ne postaviti ovaj seter jer tako niko neće moći prepisati ovaj niz, već samo dodavanje(/brisanje) članova
    public Putovanje(Grad destinacija, Osoba vodjaPuta, Automobil vozilo, double udaljenostUKm) {
        this.destinacija = destinacija;
        this.vodjaPuta = vodjaPuta;
        this.vozilo = vozilo;
        setUdaljenostUKm(udaljenostUKm); //Dodeljuje vrednost this.udaljenostUKm = udaljenostUKm ukoliko ta udaljenost nije negativna;

    }

    public Putovanje(Grad destinacija, Automobil vozilo, double udaljenostUKm) {
        this.destinacija = destinacija;
        vodjaPuta=null;
        this.vozilo = vozilo;
        setUdaljenostUKm(udaljenostUKm); //Dodeljuje vrednost this.udaljenostUKm = udaljenostUKm ukoliko ta udaljenost nije negativna;
    }

    public Grad getDestinacija() {
        return destinacija;
    }
    public void setDestinacija(Grad destinacija) {
        this.destinacija = destinacija;
    }
    public Osoba getVodjaPuta() {
        return vodjaPuta;
    }
    public void setVodjaPuta(Osoba vodjaPuta) {
        this.vodjaPuta = vodjaPuta;
    }
    public Automobil getVozilo() {
        return vozilo;
    }
    public void setVozilo(Automobil vozilo) {
        this.vozilo = vozilo;
    }
    public double getUdaljenostUKm() {
        return udaljenostUKm;
    }
    public void setUdaljenostUKm(double udaljenostUKm) {
        if (udaljenostUKm<0)
            System.out.println("udaljenost u Km. ne sme biti negativna!");
        else
            this.udaljenostUKm = udaljenostUKm;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Destinacija: ").append(destinacija.getIme()).append(", ").append(destinacija.getDržava()).append("\n");
        if (vodjaPuta==null)
            sb.append("Putovanje nema vođu puta").append("\n");
        else
        sb.append("Vodja puta je: ").append(vodjaPuta.getIme()).append(" ").append(vodjaPuta.getPrezime()).append("\n");
        sb.append("Putuje se automobilom: ").append(vozilo.getMarka()).append(", ").append(vozilo.getGodište()).append(", ").append(vozilo.getKilometraža()).append("\n");
        sb.append("Udaljenost do destinacije je: ").append(udaljenostUKm).append("\n");
        sb.append("Prijavljene Osobe:\n");
        if(prijavljeneOsobe.isEmpty()) //Može i sa if(prijavljeneOsobe.size() == 0)
            sb.append("Nema prijavljenih osoba\n");
        else
            for(Osoba prijavljena: prijavljeneOsobe)
                sb.append(prijavljena.getIme()).append(" ").append(prijavljena.getPrezime()).append("\n");
        return sb.toString();
    }
    public double prosečnoVreme(double prosečnaBrzina) { //u kmH
        double prosečnoVreme=udaljenostUKm/prosečnaBrzina;
        System.out.println("Vreme do izabrane destinacije traje prosečno (u satima): "+prosečnoVreme);
        return prosečnoVreme;
    }
    public void prijava (Osoba prijavljeni) {
        prijavljeneOsobe.add(prijavljeni);
    }
    public void odjava (Osoba prijavljeni) {
        prijavljeneOsobe.remove(prijavljeni); //Uklanja prvo pojavljivanje naznačenog objekta u nizu (ako postoji)
    }
}

