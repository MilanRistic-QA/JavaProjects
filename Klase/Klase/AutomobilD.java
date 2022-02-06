package Klase;
    //Rađeno za domaći
public class AutomobilD {
    private String marka;
    private String model;
    private int serijskiBr;
    private Osoba vlasnik;

        public AutomobilD(String marka, String model, int serijskiBr, Osoba vlasnik) {
            this.marka = marka;
            this.model = model;
            this.serijskiBr = serijskiBr;
            this.vlasnik = vlasnik;
        }
        public AutomobilD(String marka, String model, int serijskiBr) {
            this.marka = marka;
            this.model = model;
            this.serijskiBr = serijskiBr;
            this.vlasnik = null;
        }
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Marka automobila: ").append(marka).append("\n");
            sb.append("Model automobila: ").append(model).append("\n");
            sb.append("Serijski Broj: ").append(serijskiBr).append("\n");
            if (vlasnik==null)
                sb.append("Nema vlasnika\n");
            else
                sb.append("Podaci o vlasniku: \n").append(vlasnik); //ako hoćemo samo ime i prezime idemo preko vlasnik.getIme() i vlasnik.getPrezime()
            return sb.toString();
        }

        public String getMarka() {
            return marka;
        }
        public String getModel() {
            return model;
        }
        public int getSerijskiBr() {
            return serijskiBr;
        }
        public Osoba getVlasnik() {
            return vlasnik;
        }
        public void setVlasnik(Osoba vlasnik) {
            this.vlasnik = vlasnik;
        }
    }
