package JavaTest;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int niz[]={2, 12, 432, 21, 2, 7, 12, 2, 21, -2};

        System.out.print("Unesite broj koji želite da prebrojite u nizu: ");
        int x=sc.nextInt();
        Funkcija(x, niz);

    }

    public static void Funkcija(int x,int[] niz) {
        int brojac=0;
        for (int i=0;i< niz.length;i++) {
            if (x==niz[i])
                brojac++;
        }
        if (brojac>0)
            System.out.println("Broj "+x+" se pojavljuje "+brojac+" puta u nizu.");
        else
            System.out.println("Broj "+x+" se ne pojavljuje u našem nizu.");

    }
}
