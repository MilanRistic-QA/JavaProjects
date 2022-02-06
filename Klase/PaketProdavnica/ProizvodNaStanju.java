package PaketProdavnica;

public class ProizvodNaStanju {
    private Proizvod proizvod;
    private int količinaNaStanju;

    public ProizvodNaStanju(Proizvod proizvod, int količinaNaStanju) {
        this.proizvod = proizvod;
        if (proizvod.nijeNegativan(količinaNaStanju))
            this.količinaNaStanju = količinaNaStanju;
    }

    public Proizvod getProizvod() {
        return proizvod;
    }
    public int getKoličinaNaStanju() {
        return količinaNaStanju;
    }

    public void setProizvod(Proizvod proizvod) {
        this.proizvod = proizvod;
    }
    public void setKoličinaNaStanju(int količinaNaStanju) {
        if (proizvod.nijeNegativan(količinaNaStanju))
            this.količinaNaStanju = količinaNaStanju;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Naziv proizvoda: ").append(proizvod.getNazivProizvoda()).append("\n");
        sb.append("Stanje proizvoda: ").append(količinaNaStanju).append("\n");
        return sb.toString();
    }
   /* public static dodajProizvodNaStanju(String nazivProizvoda, int količinaNaStanju) {
        ProizvodNaStanju nekiProizvod = new ProizvodNaStanju();
        if(nekiProizvod.getProizvod().getNazivProizvoda().equals(nazivProizvoda)) {
              nekiProizvod.količinaNaStanju += količinaNaStanju;
        }
        else
            Proizvod p1 = new Proizvod()
            ProizvodNaStanju pS1 = new ProizvodNaStanju(nazivProizvoda, količinaNaStanju);
*/

    }

