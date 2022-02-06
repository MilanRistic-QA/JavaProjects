package Telefonija;

public abstract class Usluga {
    private Broj brojOd;
    private Broj brojKa;

    public Usluga(Broj brojOd, Broj brojKa) {
        this.brojOd = brojOd;
        this.brojKa = brojKa;
    }

    public Broj getBrojOd() {
        return brojOd;
    }
    public Broj getBrojKa() {
        return brojKa;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(brojOd).append(" -> ").append(brojKa); //brojOd će pozvati automatski toString metodu klase Broj prikazanu dole:
        /*sb.append("+").append(tekstKodDržave).append(" ").append(pozivniBroj).append(" ").append(broj);*/
        return sb.toString();
    }
    /*public abstract double cenaUsluge();*/ //Nije bilo vremena da je implementiram a ako je ostavim ona će zahtevati da bude implementirana u Poruka i Pozivu
}
