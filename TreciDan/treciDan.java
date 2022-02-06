/*
        Kreiramo svoj profil u ovom zadatku
        Svako za sebe kroz skener treba da unese ime, prezime, godine
        Koristeci char uneti pol, koristeci boolean odgovoriti na pitanje da li ste rodjeni iz Srbije
        Koristeci double uneti svoj prosek ocena iz srednje skole
        Koristeci if program treba da vrati podatke na osnovu proseka da li ste bili odlicni, vrlo dobri, dobri, dovoljni ili nedovoljni
        Na kraju odstampati i odgovor da li je godina vaseg rodjenja bila prestupna */


import java.util.Scanner;

public class treciDan {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite svoje ime: ");
        String ime=s.next();
        System.out.println("Unesite svoje prezime: ");
        String prezime=s.next();
        System.out.println("Unesite svoje godište: ");
        int god=s.nextInt();
    }

}
