package Klase;

public class Trougao {
    private double stranicaA;
    private double stranicaB;
    private double stranicaC;
    private boolean daLiJeTrougaoValidan(){
        //Bonus uslov koji bi trebao da se uvrsti jeste da zbir dužina bilo koje dve stranice nije manji od dužine treće
        //Funkcija vraća true samo ako je trougao validan
        if (stranicaA<=0 || stranicaB<=0 || stranicaC <=0 )
            return false;
        else if ((stranicaA+stranicaB)<stranicaC)
            return false;
        else if ((stranicaA+stranicaC)<stranicaB)
            return false;
        else if ((stranicaB+stranicaC)<stranicaA)
            return false;
        else
            return true;
    }
    public Trougao (double stranicaA, double stranicaB, double stranicaC) {
        //Da li je trougao validan?
        boolean validan=daLiJeTrougaoValidan();
        if (validan==false)
            System.out.println("Greška! Uneli ste nevalidan trougao");
        else {
            this.stranicaA = stranicaA;
            this.stranicaB = stranicaB;
            this.stranicaC = stranicaC;
        }

    }
    public double getStranicaA() {
        return stranicaA;
    }
    public double getStranicaB() {
        return stranicaB;
    }
    public double getStranicaC() {
        return stranicaC;
    }
    public void setStranicaA(double stranicaA) {
            this.stranicaA = stranicaA;
            boolean validan=daLiJeTrougaoValidan();
            if (validan==false)
                System.out.println("Vaša izmena straniceA je učinilo trougao nevalidnim!");
    }
    public void setStranicaB(double stranicaB) {
            this.stranicaB = stranicaB;
        boolean validan=daLiJeTrougaoValidan();
        if (validan==false)
            System.out.println("Vaša izmena straniceB je učinilo trougao nevalidnim!");
    }
    public void setStranicaC(double stranicaC) {
            this.stranicaC = stranicaC;
        boolean validan=daLiJeTrougaoValidan();
        if (validan==false)
            System.out.println("Vaša izmena straniceC je učinilo trougao nevalidnim!");
    }
    public double Obim() {
        double obim = stranicaA+stranicaB+stranicaC;
        return obim;
    }
    public double površina() {
        //Koristićemo Heronov obrazac P=sqrt[s*(s-a)*(s-b)*(s-c)]
        //s je poluobim trougla (obim/2)
        double s = Obim()/2;
        double p =Math.sqrt(s*(s-stranicaA)*(s-stranicaB)*(s-stranicaC));
        return p;
    }
    public String toString() {
        /*String ispisObjekta; -Ovaj način uklkučuje mnogo kopiranja u memoriju
        ispisObjekta = "Za trougao: \n";
        ispisObjekta+= "Dužina stranica A je: "+stranicaA+"\n";
        ispisObjekta+= "Dužina stranica B je: "+stranicaB+"\n";
        ispisObjekta+= "Dužina stranica C je: "+stranicaC+"\n";
        return ispisObjekta;*/
        StringBuilder sb = new StringBuilder();
        sb.append("Dužina stranica A je: ").append(stranicaA).append("\n");
        sb.append("Dužina stranica B je: ").append(stranicaB).append("\n");
        sb.append("Dužina stranica C je: ").append(stranicaC).append("\n");
        /*sb.append("Dužina stranica C je: "+stranicaC+"\n");*/
        return sb.toString();
    }

}
