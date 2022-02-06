public class Stringovi {
    public static void main(String[] args) {
        String niz[] = {"pon", "uto", "sre", "čet", "pet", "sub", "ned"};
        String niz2[] = {"abc", "abd", "cdf", "čet", "pet", "sub", "ned"};
        svakiTreci(niz);
        svakiTreci(niz2);


    }

    public static void svakiTreci(String[] niz) {
        for (int i=2; i<niz.length;i+=3)
            System.out.println(niz[i]);

    }
}
