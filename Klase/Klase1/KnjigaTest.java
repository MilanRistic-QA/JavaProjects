package Klase1;

import Klase.Osoba;

public class KnjigaTest {
    public static void main(String[] args) {
        Osoba pisac1 = new Osoba("Fjodor", "Dostojevski", 1821, 178);
        Osoba pisac2 = new Osoba("Laza", "Kostić", 1841, 186);
        Osoba vlasnik1 = new Osoba("Pera", "Perić", 1989, 178);
        Knjiga knjiga1 = new Knjiga("Maksim Crnojević", pisac2, 62, 1868);
        Knjiga knjiga2 = new Knjiga("Braća Karamazovi", pisac1, vlasnik1, -199, 1879);
        Knjiga knjiga3 = new Knjiga("Ukroćena goropad", null, vlasnik1, 235, 1715);
        System.out.println(knjiga1);
        knjiga1.setBrojStrana(-30);
        System.out.println(knjiga1);
        System.out.println(knjiga1.veličinaKnjige());
        System.out.println(knjiga2);
        System.out.println(knjiga2.veličinaKnjige());
    }
}
