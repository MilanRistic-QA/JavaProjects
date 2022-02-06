package Klase;

import java.util.Scanner;

//Napišite program koji će od korisnika zahtevati da on unese Atribute Automobila
//U prvom primeru smo te atribute unosili statički
public class Test2Automobil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Prvi automobil
        System.out.println("Unesite marku auta1: ");
        String marka = sc.next();
        System.out.println("Unesite zemlju proizvodnje auta1: ");
        String zemljaProizvodnje = sc.next();
        System.out.println("Unesite godište auta1: ");
        int godište = sc.nextInt();
        System.out.println("Unesite pređenu kilometražu auta1: ");
        double kilometraža = sc.nextDouble();

        Automobil Auto1 = new Automobil(marka,zemljaProizvodnje, godište, kilometraža);
        //Drugi automobil
        System.out.println("Unesite marku auta2: ");
        marka = sc.next();
        System.out.println("Unesite zemlju proizvodnje auta2: ");
        zemljaProizvodnje = sc.next();
        System.out.println("Unesite godište auta2: ");
        godište = sc.nextInt();
        System.out.println("Unesite pređenu kilometražu auta2: ");
        kilometraža = sc.nextDouble();

        Automobil Auto2 = new Automobil(marka,zemljaProizvodnje, godište, kilometraža);
        //Ispis

        System.out.println(Auto1.getMarka());
        System.out.println(Auto1.getZemljaProizvodnje());
        System.out.println(Auto1.getGodište());
        System.out.println(Auto1.getKilometraža());

        System.out.println(Auto2.getMarka());
        System.out.println(Auto2.getZemljaProizvodnje());
        System.out.println(Auto2.getGodište());
        System.out.println(Auto2.getKilometraža());
    }

}
