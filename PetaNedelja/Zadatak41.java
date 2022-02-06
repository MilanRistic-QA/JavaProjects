public class Zadatak41 {
    //41. Napisati funkciju koja racuna prosecnu vrednost double[] niza.
    public static void main(String[] args) {
        double niz[]={3.14, 4.15, 15.14, 32.32};
        System.out.println("Prosečna vrednost zadatog niza je "+prosek(niz));

    }
    public static double prosek(double[] niz) {
        double avg=0;
        for (int i=0;i<niz.length;i++)
            avg+=niz[i];
        avg=avg/niz.length; //avg sa desne strane ima vrednost sumi svih članova niza
        return avg;

    }
}
