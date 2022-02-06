package Telefonija;

import java.util.ArrayList;

public class Korisnik {
    private static int lastId;
    private int korisnikId;
    private String ime;
    private String prezime;
    private Broj Broj;
    private ArrayList<Usluga> istorijaUsluga;

    public Korisnik(String ime, String prezime, Telefonija.Broj broj) {
        korisnikId = lastId++;
        this.ime = ime;
        this.prezime = prezime;
        Broj = broj;
        this.istorijaUsluga = new ArrayList<>();
    }

    public static int getLastId() {
        return lastId;
    }
    public int getKorisnikId() {
        return korisnikId;
    }
    public String getIme() {
        return ime;
    }
    public String getPrezime() {
        return prezime;
    }
    public Telefonija.Broj getBroj() {
        return Broj;
    }
    public ArrayList<Usluga> getIstorijaUsluga() {
        return istorijaUsluga;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }
    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }
    public void setBroj(Telefonija.Broj broj) {
        Broj = broj;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ime).append(" ").append(prezime).append(" ").append(Broj).append("\n");
        sb.append("Istorija usluga: \n");
        for (Usluga u: istorijaUsluga) {
            sb.append(u).append("\n"); //u će pozvati toString metodu automatski
        }

        return sb.toString();
    }
}
