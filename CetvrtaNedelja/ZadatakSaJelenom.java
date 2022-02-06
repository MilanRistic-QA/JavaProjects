public class ZadatakSaJelenom {
    public static void main(String[] args) {
        int niz[]={34, 22, 53 ,3, 46, 5};
        int x=Minimum(niz);
        System.out.println("Minimum je "+x);


    }

    public static int Minimum(int[] niz) {
        int min=niz[0];
        for (int i=0;i<niz.length;i++) {
            if (min>niz[i])
                min=niz[i];
        }
        return min;

    }
}
