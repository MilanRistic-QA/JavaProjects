package Klase1;

import Klase.Krug;

import java.util.Scanner;

public class NizKrugova {
    public static void main(String[] args) {
        System.out.print("Unesite koliko krugova želite da kreirate: ");
        Scanner sc = new Scanner(System.in);
        int dužinaNiza = sc.nextInt();
        Krug[] nizKrugova = new Krug[dužinaNiza];
        double poluprečnik;
        for (int i=0;i<dužinaNiza;i++) {
            System.out.print("Unesite dužinu poluprečnika kruga na poziciji "+i+": ");
            poluprečnik=sc.nextDouble();
            nizKrugova[i] = new Krug(poluprečnik*2);
        }
        //Idem kroz niz kreiranih krugova i ispisujem svaki zasebno sa njihovim obimom i površinom
        for (int i=0;i<dužinaNiza;i++) {
            Krug k = nizKrugova[i];
            System.out.println("Generalije "+(i+1)+". kruga su: \n"+k);
            System.out.println("Obim kruga je : "+nizKrugova[i].Obim());
            System.out.println("Površina kruga je: "+nizKrugova[i].Površina());

        }
    }
}
