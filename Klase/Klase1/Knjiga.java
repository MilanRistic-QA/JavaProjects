package Klase1;

import Klase.Osoba;

public class Knjiga {
    private String nazivKnjige;
    private Osoba Autor;
    private Osoba Vlasnik;
    private int brojStrana;
    private int godinaIzdanja;

    public Knjiga(String nazivKnjige, Osoba Autor, int brojStrana, int godinaIzdanja) {
        this.nazivKnjige=nazivKnjige;
        this.Autor=Autor;
        this.Vlasnik=null;
        this.brojStrana=brojStrana;
        this.godinaIzdanja=godinaIzdanja;
        if (brojStrana<0||godinaIzdanja<0)
            System.out.println("Pokušavate da napravite knjigu sa negativnim brojem strana ili godinom izdanja");
    }

    public Knjiga(String nazivKnjige, Osoba Autor, Osoba Vlasnik, int brojStrana, int godinaIzdanja) {
        this.nazivKnjige = nazivKnjige;
        this.Autor = Autor;
        this.Vlasnik = Vlasnik;
        if (brojStrana<0||godinaIzdanja<0)
            System.out.println("Pokušavate da napravite knjigu sa negativnim brojem strana ili godinom izdanja");
        else {
            this.brojStrana = brojStrana;
            this.godinaIzdanja = godinaIzdanja;
        }

    }

    public String getNazivKnjige() {
        return nazivKnjige;
    }
    public Osoba getAutor() {
        return Autor;
    }
    public Osoba getVlasnik() {
        return Vlasnik;
    }
    public int getBrojStrana() {
        return brojStrana;
    }
    public int getGodinaIzdanja() {
        return godinaIzdanja;
    }

    public void setNazivKnjige(String nazivKnjige) {
        this.nazivKnjige = nazivKnjige;
    }
    public void setAutor(Osoba autor) {
        Autor = autor;
    }
    public void setVlasnik(Osoba vlasnik) {
        Vlasnik = vlasnik;
    }
    public void setBrojStrana(int brojStrana) {
        if (brojStrana<0)
            System.out.println("Pokušavate da setujete knjigu na negativan broj strana!");
        else
            this.brojStrana = brojStrana;
    }
    public void setGodinaIzdanja(int godinaIzdanja) {
        if (godinaIzdanja<0)
            System.out.println("Pokušavate da setujete knjigu na negativnu godinu izdanja!");
        else
            this.godinaIzdanja = godinaIzdanja;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Naziv knjige je: ").append(nazivKnjige).append("\n");
        sb.append("Autor knjige je: ");
        if (Autor==null)
            sb.append("Nepoznat\n");
        else
            sb.append(Autor.getIme()).append(" ").append(Autor.getPrezime()).append("\n");
        sb.append("Vlasnik knjige je: ");
        if (Vlasnik==null)
            sb.append("knjiga nema vlasnika\n");
        else
            sb.append(Vlasnik.getIme()).append(" ").append(Vlasnik.getPrezime()).append("\n");
        sb.append("Broj strana: ").append(brojStrana).append("\n");
        sb.append("Godina izdanja: ").append(godinaIzdanja).append("\n");
        return sb.toString();
    }
    public String veličinaKnjige() {
        if (brojStrana<=100)
            return "mala knjiga";
        else if (brojStrana<=300)
            return "srednje velika knjiga";
        else if (brojStrana<=600)
            return "velika knjiga";
        else
            return "baš velika knjiga";

    }
}
