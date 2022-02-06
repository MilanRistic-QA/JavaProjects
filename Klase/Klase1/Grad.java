package Klase1;

public class Grad {
    private String ime;
    private int brojStanovnika;
    private String država;

    public Grad(String ime, int brojStanovnika, String država) {
        this.ime = ime;
        setBrojStanovnika(brojStanovnika); //Funkcija dozvoljava dodelu vrednosti this.brojStanovnika=brojStanovnika ukoliko brojStanovnika nije negativan;
        this.država = država;
    }
    public String getIme() {
        return ime;
    }
    public int getBrojStanovnika() {
        return brojStanovnika;
    }
    public String getDržava() {
        return država;
    }
    public void setIme(String ime) {
        this.ime = ime;
    }
    public void setBrojStanovnika(int brojStanovnika) {
        if (brojStanovnika<0)
            System.out.println("Broj stanovnika ne može biti negativan!");
        else
            this.brojStanovnika = brojStanovnika;
    }
    public void setDržava(String država) {
        this.država = država;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ime grada: ").append(ime).append("\n");
        sb.append("Broj stanovnika: ").append(brojStanovnika).append("\n");
        sb.append("Država: ").append(država).append("\n");
        return sb.toString();
    }

}
