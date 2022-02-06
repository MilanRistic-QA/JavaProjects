package Klase1;

import Klase.Automobil;
import Klase.Osoba;

public class TestPutovanje {
    public static void main(String[] args) {
        Grad g1 = new Grad("Novi Sad", 600000, "Srbija");
        Grad g2 = new Grad("Barslelona", 9000000, "Španija");
        Automobil a1 = new Automobil("Pežo 207", "Francuska", 2015, 300000);
        Automobil a2 = new Automobil("Mercedes","Nemačka", 2003, 1000300);
        Osoba vođa1 = new Osoba("Milan", "Ristić", 1982, 187);
        Osoba vođa2 = new Osoba("Zoran", "Milićević", 1996, 192);
        Putovanje put1 = new Putovanje(g1, vođa1, a1, 100);
        Putovanje put2 = new Putovanje(g2, a2,3000);
        Osoba putnik1 = new Osoba("Pera", "Perić", 1980, 177);
        Osoba putnik2 = new Osoba("Mika", "Mikić", 1970, 167);
        put1.prijava(putnik1);
        put1.prijava(putnik2);
        put2.prijava(putnik1);
        put2.prijava(putnik2);
        System.out.println(put1);
        System.out.println(put2);
        double x= put1.prosečnoVreme(60);
        put2.prosečnoVreme(60);
        put2.odjava(putnik1);
        System.out.println(put2);

    }
}
