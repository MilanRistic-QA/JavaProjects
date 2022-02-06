package Klase;
/* Napisati klasu Automobil, koja treba da ima sledece atribute:
    marka, zemljaProizvodnje, godiste, kilometrzu. Napisati test program u kome treba
    napraviti 2 automobila, i ispisati ih na izlaz */
public class Automobil {
    String marka;
    String zemljaPorekla;
    int godiste;
    int kilometraza;
    //Sledi Konstruktor metoda, argumenti se odvajaju sa zarezom
    Automobil (String marka1, String zemljaPorekla1, int godiste1, int kilometraza1) {
        marka =marka1;
        zemljaPorekla = zemljaPorekla1;
        godiste =godiste1;
        kilometraza=kilometraza1;
    }
    // Praksa je da se svi složeni tipovi podataka pišu prvim velikim slovom
}
