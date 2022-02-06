import java.util.Scanner;

public class Pastebin26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      /*  System.out.println("Unesite dužinu niza: ");
        int n=sc.nextInt();
        System.out.println("Unesite članove niza: ");
        int niz[] = new int[n];
        for (int i=0;i<niz.length;i++)
            niz[i]=sc.nextInt(); */ //Zakomentarisano za potrebe testa
        int niz[] = {4, 8, 15, 16, 23, 42};
        PB26(niz);
    }

    public static void PB26(int[] niz) {
        for (int i=niz.length-1;i>=0;i--)
        System.out.println(niz[i]);

    }


}
