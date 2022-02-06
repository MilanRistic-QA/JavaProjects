package Klase;

public class Osoba {
    //Polja (Atributi) klase:
    private String ime;
    private String prezime;
    private int godinaRodjenja;
    private double visina;

    /*Konstruktor metodu moramo definisati
    Ime te metode je uvek isto imenu klase
    Ona nema povratnu vrednost
     */
    public Osoba (String ime, String prezime, int godinaRodjenja, double visina) {
        this.ime = ime;
        this.prezime = prezime;
        this.godinaRodjenja=godinaRodjenja;
        this.visina = visina;

    }
    // Getter i seter metode
    // - za ime
    public String getIme() {
        return ime;
    }
    public void setIme(String ime) {
        this.ime=ime;
    }

    // - za prezime
    public String getPrezime() {
        return prezime;
    }
    public void setPrezime(String prezime) {
        this.prezime=prezime;
    }

    // - Geteri za godinaRodjenja i visina

    public int getGodinaRodjenja() {
        return godinaRodjenja;
    }
    public double getVisina() {
        return visina;
    }
    // - Seteri za Godina rođenja i visina
    public void setGodinaRodjenja(int godinaRodjenja) {
        this.godinaRodjenja = godinaRodjenja;
    }
    public void setVisina (double visina) {
        this.visina=visina;
    }
    public String toString() {
        StringBuilder ispisObjekta = new StringBuilder();
        ispisObjekta.append("Ime: "+ime+"\n");
        ispisObjekta.append("Prezime: "+prezime+"\n");
        ispisObjekta.append("Godina rodjenja: "+godinaRodjenja+"\n");
        ispisObjekta.append("Visina: "+visina+"\n");
        return ispisObjekta.toString();

    }
}
