package Klase;

public class Glumci {
    private String ime;
    private String prezime;
    char pol;
    int godine;
    double ocenaOd1Do10;
    boolean izSrbije;

    public Glumci(String ime, String prezime, char pol, int godine, double ocenaOd1Do10, boolean izSrbije) {
        this.ime = ime;
        this.prezime = prezime;
        this.pol = pol;
        this.godine = godine;
        this.ocenaOd1Do10 = ocenaOd1Do10;
        this.izSrbije = izSrbije;
    }
    public String toString() {
        StringBuilder sb= new StringBuilder();
        sb.append("Ime: ").append(ime).append("\n");
        sb.append("Prezime: ").append(prezime).append("\n");
        sb.append("Pol: ").append(pol).append("\n");
        sb.append("Godine: ").append(godine).append("\n");
        sb.append("Ocena (Od 1-10): ").append(ocenaOd1Do10).append("\n");
        if (izSrbije==true)
            sb.append("Poreklom iz Srbije").append("\n");
        else
            sb.append("Nije poreklom iz Srbije").append("\n");
        return sb.toString();
    }
}
