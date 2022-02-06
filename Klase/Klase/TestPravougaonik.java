package Klase;

public class TestPravougaonik {
    public static void main(String[] args) {
        Pravougaonik prav1 = new Pravougaonik(4,6);
        /*System.out.println("Dužina pravougaonika je "+prav1.getDužina());
        System.out.println("Visina pravougaonika je "+prav1.getVisina());*/
        System.out.println(prav1);
        System.out.println("Obim pravougaonika je "+prav1.Obim());
        System.out.println("Površina pravougaonika je "+prav1.Površina());

    }
}
