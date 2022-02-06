package Klase1;

import Klase.Pravougaonik;

import java.util.Scanner;

public class NizPravougaonika {
    public static void main(String[] args) {
        System.out.println("unesite koliko pravougaonika želite da kreirate: ");
        Scanner sc = new Scanner(System.in);
        int dužinaNiza = sc.nextInt();
        //Pravim niz pravougaonika dužine dužinaNiza;
        Pravougaonik nizPravougaonika[] = new Pravougaonik[dužinaNiza];
        double dužina, širina;
        for (int i=0;i<dužinaNiza;i++) {
            System.out.print("Unesite dužinu pravougaonika na pozociji "+i+": ");
            dužina=sc.nextDouble();
            System.out.print("Unesite širinu pravougaonika na pozociji "+i+": ");
            širina=sc.nextDouble();
            nizPravougaonika[i] = new Pravougaonik(dužina, širina);
        }
        for (int i=0;i<dužinaNiza;i++) {
            Pravougaonik p = nizPravougaonika[i];
            System.out.println(p);
            System.out.println("Obim pravougaonika je: "+nizPravougaonika[i].Obim());
            System.out.println("Površina pravougaonika je: "+nizPravougaonika[i].Površina());
            System.out.println();
        }
    }
}
