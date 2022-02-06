import java.util.Scanner;

public class Pastebin27_31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite dužinu niza: ");
        int n=sc.nextInt();
        System.out.println("Unesite članove niza: ");
        int niz[] = new int[n];
        for (int i=0;i<niz.length;i++)
            niz[i]=sc.nextInt();
        // int niz[] = {4, 8, 15, 16, 23, 42}; //Korišćeno za potrebe testitanja
        PB27(niz);
        PB28(niz);
        PB29(niz);
        PB30(niz);
        PB31(3, 5, 7);
    }

    public static void PB27(int[] niz) {
        System.out.print("Zadatak 27: ");
        for (int i = 0; i < niz.length; i += 2)
            System.out.print(niz[i] + " ");
    }

    public static void PB28(int[] niz) {
        System.out.print("\nZadatak 28: ");
        int suma = 0;
        for (int i = 0; i < niz.length; i++)
            suma += niz[i];
        System.out.println("Suma unetog niza je " + suma);
    }

    public static void PB29(int[] niz) {
        System.out.print("Zadatak 29: ");
        for (int i = niz.length - 1; i >= 0; i -= 3)
            System.out.print(niz[i] + " ");
    }
    public static void PB30(int[] niz) {
        System.out.print("\nZadatak 30: ");
        int proizvod=1;
        for (int i=0;i<niz.length;i++)
            proizvod*=niz[i];
        System.out.println("Proizvod elemenata niza je "+proizvod);
    }
    public static int PB31(int a, int b, int c) {
        System.out.print("Zadatak 31: ");
        int proizvod=a*b*c;
            System.out.print("Proizvod zadata 3 broja je: "+proizvod);
            return proizvod;
    }
}