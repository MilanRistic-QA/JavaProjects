package Klase;

public class TestAutomobil {
    public static void main(String[] args) {
        Automobil Auto1 = new Automobil("Mercedes", "Nemačka", 2003, 300000.34);
        System.out.println(Auto1.getMarka());
        System.out.println(Auto1.getZemljaProizvodnje());
        System.out.println(Auto1.getGodište());
        System.out.println(Auto1.getKilometraža());

        System.out.println(Auto1);

        Automobil Auto2 = new Automobil("Pežo", "Francuska", 2010, 237456.24);
        System.out.println(Auto2.getMarka());
        System.out.println(Auto2.getZemljaProizvodnje());
        System.out.println(Auto2.getGodište());
        System.out.println(Auto2.getKilometraža());

        System.out.println(Auto2);

        Auto2.setKilometraža(Auto2.getKilometraža()+15);
        System.out.println("Nova kilometraža Auto2 je "+Auto2.getKilometraža());
    }
}
