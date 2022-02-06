package Klase;

public class TestKrug {
    public static void main(String[] args) {
        Krug k = new Krug(11);
        System.out.println(k);
        /*System.out.println("Prečnik kruga je "+k.getPrečnik());*/
        System.out.println("Obim kruga je "+k.Obim());
        System.out.println("Površina kruga je "+k.Površina());
        System.out.println("Poluprečnik kruga je "+k.Poluprečnik());

        k.setPrečnik(22);
        System.out.println("Prečnik kruga je "+k.getPrečnik()); //može i System.out.println(k);
        System.out.println("Poluprečnik kruga je "+k.Poluprečnik());
        System.out.println("Obim kruga je "+k.Obim());
        System.out.println("Površina kruga je "+k.Površina());
    }
}
