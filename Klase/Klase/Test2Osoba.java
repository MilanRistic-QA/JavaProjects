package Klase;

import java.util.Scanner;
 //Napišite program koji će od korisnika zahtevati da on unese Atribute osobe
 //U prvom primeru smo te atribute unosili statički
public class Test2Osoba {

     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         //Prva osoba
         System.out.println("Unesite ime prve osobe: ");
         String ime =sc.next();
         System.out.println("Unesite prezime prve osobe: ");
         sc.nextLine(); // Čita samo znak za novi red "\n"
         String prezime=sc.nextLine(); //"workoround" ako prezime ili bilo koji string sadrži dve reči;
         System.out.println("Unesite godinu rođenja prve osobe: ");
         int godinaRodjenja=sc.nextInt();
         System.out.println("Unesite visinu prve osobe: ");
         double visina=sc.nextDouble();

         Osoba prvaOsoba = new Osoba(ime, prezime, godinaRodjenja, visina);
         System.out.println(prvaOsoba);
         //Druga osoba
         /*System.out.println("Unesite ime druge osobe: ");
         ime =sc.next();
         System.out.println("Unesite prezime druge osobe: ");
         prezime=sc.next();
         System.out.println("Unesite godinu rođenja druge osobe: ");
         godinaRodjenja=sc.nextInt();
         System.out.println("Unesite visinu druge osobe: ");
         visina=sc.nextDouble();
         Osoba drugaOsoba = new Osoba(ime, prezime,godinaRodjenja, visina);
         System.out.println(prvaOsoba); // Ispis iz toString metode
         //Ispis
         System.out.println("Ime prve osobe je "+prvaOsoba.getIme());
         System.out.println("Prezime prve osobe je "+prvaOsoba.getPrezime());
         System.out.println("Godište prve osobe je "+prvaOsoba.getGodinaRodjenja());
         System.out.println("Visina prve osobe je "+prvaOsoba.getVisina());

         System.out.println("Ime druge osobe je "+drugaOsoba.getIme());
         System.out.println("Prezime druge osobe je "+drugaOsoba.getPrezime());
         System.out.println("Godište druge osobe je "+drugaOsoba.getGodinaRodjenja());
         System.out.println("Visina druge osobe je "+drugaOsoba.getVisina());

         System.out.println(drugaOsoba); //Ispis iz toString metode
*/
     }

}
