package Klase;

public class TestOsoba {
    public static void main(String[] args) {
        Osoba profesor = new Osoba("Zoran", "Milicevic", 1996, 189.2);
        System.out.println(profesor.ime);
        System.out.println(profesor.prezime);
        System.out.println(profesor.godinaRodjenja);
        System.out.println(profesor.visina);

        Osoba asistent = new Osoba("Strhinja", "Trninic", 1997, 1998);
        System.out.println(asistent.ime);
        System.out.println(asistent.prezime);
        System.out.println(asistent.godinaRodjenja);
        System.out.println(asistent.visina);
    }
}
