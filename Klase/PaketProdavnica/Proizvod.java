package PaketProdavnica;

public class Proizvod {
    private String nazivProizvoda;
    private double cenaProizvoda;
    private String opisProizvoda;
    private int težinaUGramima;
    public boolean nijeNegativan(double unos) {
        if(unos>0)
            return true;
        else {
            System.out.println("Podatak koji ste uneli '"+unos+"' ne može biti negativan broj!");
            return false;
        }
    }
    public Proizvod (String nazivProizvoda, double cenaProizvoda, String opisProizvoda, int težinaUGramima) {
        this.nazivProizvoda = nazivProizvoda;
        if (nijeNegativan(cenaProizvoda))
            this.cenaProizvoda = cenaProizvoda;
        this.opisProizvoda = opisProizvoda;
        if (nijeNegativan(težinaUGramima))
            this.težinaUGramima = težinaUGramima;
    }

    public Proizvod(String nazivProizvoda, double cenaProizvoda, int težinaUGramima) {
        this.nazivProizvoda = nazivProizvoda;
        if (nijeNegativan(cenaProizvoda))
            this.cenaProizvoda = cenaProizvoda;
        if (nijeNegativan(težinaUGramima))
            this.težinaUGramima = težinaUGramima;
    }

    public String getNazivProizvoda() {
        return nazivProizvoda;
    }
    public double getCenaProizvoda() {
        return cenaProizvoda;
    }
    public String getOpisProizvoda() {
        return opisProizvoda;
    }
    public int getTežinaUGramima() {
        return težinaUGramima;
    }

    public void setNazivProizvoda(String nazivProizvoda) {
        this.nazivProizvoda = nazivProizvoda;
    }
    public void setCenaProizvoda(double cenaProizvoda) {
        if (nijeNegativan(cenaProizvoda))
        this.cenaProizvoda = cenaProizvoda;
    }
    public void setOpisProizvoda(String opisProizvoda) {
        this.opisProizvoda = opisProizvoda;
    }
    public void setTežinaUGramima(int težinaUGramima) {
        if (nijeNegativan(težinaUGramima))
        this.težinaUGramima = težinaUGramima;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Naziv proizvoda: ").append(nazivProizvoda).append("\n");
        sb.append("Cena proizvoda: ").append(cenaProizvoda).append("\n");
        sb.append("Opis proizvoda: ").append(opisProizvoda).append("\n");
        sb.append("Težina proizvoda: ").append(težinaUGramima).append("g\n");
        return sb.toString();
    }
}
