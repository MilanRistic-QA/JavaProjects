package Klase;

    public class Osoba {
        // polje (atribut) klase
        String ime;
        String prezime;
        int godinaRodjenja;
        double visina;

        // konstruktor metoda
        // nema povratnu vrednost!
        // ime te metode je uvek isto kao ime klase
        Osoba(String ime1, String prezime1, int godinaRodjenja1, double visina1) {
            ime = ime1;
            prezime = prezime1;
            godinaRodjenja = godinaRodjenja1;
            visina = visina1;
        }
    }

