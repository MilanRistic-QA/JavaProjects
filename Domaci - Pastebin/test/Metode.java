public class Metode {
    public static void main(String[] args) {
        množenje(3,2);
        System.out.println(kojiJeVeci(3,5));
    }

    public static void množenje(int a, int b) {
        int c=a*b;
        System.out.println("Rezultat množenja dva broja je "+c);

    }

    public static int kojiJeVeci(int a, int b) {
        if (a<b) return b;
        else return a;

    }

    /* public static void main(String[] args) {
        //mnozenje(2, 3); //ova linija mora biti prisutna za drugi nacin
        System.out.println(mnozenje(2,3));
        System.out.println("Veci broj je " + veciBroj(7, 19));
    }

    public static int mnozenje(int x, int y) {
        int z = x * y;
        //System.out.println("Mnozenje dva broja je " + z); //moguce je i ovako stampati resenje (drugi nacin)
        return z;
    }

    public static int veciBroj(int k, int h) {
        if (k > h) {
            return k;
        } else {
            return h;
        }
    }
    } */

}
