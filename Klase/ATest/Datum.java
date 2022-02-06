package ATest;
//Nisam uradio pozivanje proveriDatum u seterima i Konstruktorima; U slučaju nevalidnosti ispisati poruku o greški
public class Datum {
    private int dan;
    private int mesec;
    private int godina;
    private static boolean proveriDatum(int dan, int mesec, int godina) {
        boolean dobarDatum = false;
        if (0<mesec && mesec<13 && godina>2000) { // mesec nisam morao da proveravam, pokrivam ga sa Switch
            switch (mesec) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    if (0<dan && dan<32)
                        dobarDatum = true;
                    else
                        System.out.println("Dan koji ste uneli nije validan!");
                    break;
                case 2:
                    if (0<dan && dan<29)
                        dobarDatum = true;
                    else if (dan==29 && godina%4==0)
                        dobarDatum = true;
                    else
                        System.out.println("Dan koji ste uneli nije validan!");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    if (0<dan && dan<31)
                        dobarDatum = true;
                    else
                        System.out.println("Dan koji ste uneli nije validan!");
                    break;
                default:
                    System.out.println("Mesec koji ste uneli nije validan!");
            }
        }
        else {
            System.out.println("Godina koju ste uneli nije ispravna!");
        }
        return dobarDatum;
    }

    public Datum(int dan, int mesec, int godina) {
        this.dan = dan;
        this.mesec = mesec;
        this.godina = godina;
    }

    public int getDan() {
        return dan;
    }
    public int getMesec() {
        return mesec;
    }
    public int getGodina() {
        return godina;
    }
    public void setDan(int dan) {
        this.dan = dan;
    }
    public void setMesec(int mesec) {
        this.mesec = mesec;
    }
    public void setGodina(int godina) {
        this.godina = godina;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(dan).append("-").append(mesec).append("-").append(godina);
        return sb.toString();
    }
}
