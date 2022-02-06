package Telefonija;

public class Poziv extends Usluga {
    private int trajanjeUSekundama;

    public Poziv(Broj brojOd, Broj brojKa, int trajanjeUSekundama) {
        super(brojOd, brojKa);
        this.trajanjeUSekundama = trajanjeUSekundama;
    }

    public int getTrajanjeUSekundama() {
        return trajanjeUSekundama;
    }

    public void setTrajanjeUSekundama(int trajanjeUSekundama) {
        this.trajanjeUSekundama = trajanjeUSekundama;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append(" "); //u prvoj zagradi će pozvati toString metodu klase Usluga;
        int brojMinuta = trajanjeUSekundama/60;
        int ostatak = trajanjeUSekundama%60;
        sb.append(brojMinuta).append(":").append(ostatak);
        return sb.toString();
    }

}
