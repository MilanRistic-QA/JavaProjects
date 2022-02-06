package JavaTest;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int broj=11; //Promenljiva broj će biti reinicijalizovana na početku petlje
        int i=1;
        int zbir=0;
        while (broj !=0) {
            System.out.println("Molim vas unesite " + i + ". broj: ");
            broj = sc.nextInt();
            zbir += broj;
            i++;

        }
        System.out.println("Uneli ste 0 Kraj Programa");
       // System.out.println("Zbir unetih brojeva je "+zbir); //S obzirom da se ne traži ispis zbira ova linija je zakomentarisana
    }
}
