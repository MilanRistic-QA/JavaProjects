package Klase;

public class TestSportista {
    public static void main(String[] args) {
        Sportista igrac1 = new Sportista("Pera Petrović", "Košarka", "Panatenaikos", 5);
        Sportista igrac2 = new Sportista("Mitar Mirković","Fudbal", "Partizan", 1);
        Sportista igrac3 = new Sportista("Boško Barjaktarević", "Tenis", "Crvena Zvezda", 0);
        System.out.println(igrac1.getImeIPrezime()+" "+igrac1.getSport()+" "+
                igrac1.getKlub()+" "+igrac1.getBrojDresa());
        System.out.println(igrac2.getImeIPrezime()+" "+igrac2.getSport()+" "+
                igrac2.getKlub()+" "+igrac2.getBrojDresa());
        System.out.println(igrac3.getImeIPrezime()+" "+igrac3.getSport()+" "+
                igrac3.getKlub()+" "+igrac3.getBrojDresa());
        System.out.println(igrac1);
        System.out.println(igrac2);
        System.out.println(igrac3);

        igrac2.setKlub("Crvena Zvezda");
        igrac3.setBrojDresa(3);

        System.out.println(igrac1.getImeIPrezime()+" "+igrac1.getSport()+" "+
                igrac1.getKlub()+" "+igrac1.getBrojDresa());
        System.out.println(igrac2.getImeIPrezime()+" "+igrac2.getSport()+" "+
                igrac2.getKlub()+" "+igrac2.getBrojDresa());
        System.out.println(igrac3.getImeIPrezime()+" "+igrac3.getSport()+" "+
                igrac3.getKlub()+" "+igrac3.getBrojDresa());
    }


}
