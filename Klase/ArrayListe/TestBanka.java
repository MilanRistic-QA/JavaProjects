package ArrayListe;

import Klase.BankovniRačun;
import Klase.Osoba;

import java.util.ArrayList;

public class TestBanka {
    public static void main(String[] args) {
        Osoba Direktor1 = new Osoba("Miloš", "Cvetković", 1988, 178);
        Banka novaBanka = new Banka("Nova Banka", "Tu odma na uglu", Direktor1, null);
        Osoba o1 = new Osoba("Milan", "Ristić", 1982, 187);
        BankovniRačun b1 = new BankovniRačun(o1,300000);
        ArrayList<BankovniRačun> nizBankovnihRačuna= new ArrayList<>();
        nizBankovnihRačuna.add(b1);
        novaBanka.setNizBankovnihRačuna(nizBankovnihRačuna);
        Osoba o2 = new Osoba("Pera", "Perić", 1995, 177);
        BankovniRačun b2 = new BankovniRačun(o2);
        nizBankovnihRačuna.add(b2);
        novaBanka.setNizBankovnihRačuna(nizBankovnihRačuna);
        BankovniRačun b3 = new BankovniRačun(o2, 100000);
        novaBanka.dodajBankovniRačun(b3);
        System.out.println(novaBanka);
        novaBanka.ukloniBankovniRačun(b1);
        novaBanka.ukloniBankovniRačun(o1);
        System.out.println(novaBanka);
    }
}
