package Telefonija;

public class TestProgram {
    public static void main(String[] args) {
        Broj b1 = new Broj("381", "69", "1234567", false);
        Broj b2 = new Broj("381", "61", "2345678", false);
        Korisnik k1 = new Korisnik("Pera", "Perić", b1);
        Korisnik k2 = new Korisnik("Mika", "Mikić", b2);

        System.out.println(k1);
        System.out.println(k2);
    }
}
