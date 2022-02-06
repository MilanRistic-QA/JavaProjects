package Klase;

public class TestBankovniRacun {
    public static void main(String[] args) {
        Osoba Profesor = new Osoba("Zoran", "Milićević", 1996, 189.2);
        Osoba Asistent = new Osoba("Strahinja", "Trninić", 1997, 199.8);
        BankovniRačun PRačun = new BankovniRačun(Profesor, 100);
        BankovniRačun ARačun = new BankovniRačun(Asistent);
        System.out.println(PRačun);
        System.out.println(ARačun);
        ARačun.Uplata(101.1);
        System.out.println("Stanje na vašem računu je "+ARačun.getStanjeNaRačunu());
        PRačun.Isplata(101.1);
        System.out.println("Stanje na vašem računu je "+PRačun.getStanjeNaRačunu());

    }
}
