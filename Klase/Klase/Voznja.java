package Klase;

public class Voznja {
    public static void main(String[] args) {
        /*AutomobilD a1 = new AutomobilD("Pežo", "207",12345678, "Pera Perić");*/
        AutomobilD a1 = new AutomobilD("Pežo", "207", 12345678,new Osoba("Pera", "Perić", 1982, 187));
        /*Osoba vlasnik1 = new Osoba("Pera", "Perić", 1982, 187);*/
        System.out.println(a1);
                /*System.out.println(a1.getMarka()+" "+a1.getModel()+" "+a1.getSerijskiBr()+" "+a1.getVlasnik());*/
        AutomobilD a2 = new AutomobilD("Reno", "Insignia", 11223344);
        /*System.out.println(a2.getMarka()+" "+a2.getModel()+" "+a2.getSerijskiBr()+" "+a2.getVlasnik());*/
        System.out.println(a2);

        Osoba vlasnik2 = new Osoba("Mika", "Mikić", 1988, 178);
        a2.setVlasnik(vlasnik2);
        System.out.println(a2);
    }
}
