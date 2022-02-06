package Klase;

public class TestOsoba {
    public static void main(String[] args) {
        //Profesor je (novi) objekat klase Osoba
        Osoba Profesor = new Osoba("Zoran", "Milićević", 1996, 189.2);
        // Da bi smo pristupili nekom podatku objekta osoba mi to radimo kao Profesor.podatak
/*        System.out.println(Profesor.getIme());
        System.out.println(Profesor.getPrezime());
        System.out.println(Profesor.getGodinaRodjenja());
        System.out.println(Profesor.getVisina());*/
        System.out.println(Profesor); //Nakon što smo definisali toString metodu, objekte ćemo ispisivati ovako;
                //Pravimo još jedan objekat tipa Osoba
                Osoba Asistent = new Osoba("Strahinja", "Trninić", 1997, 199.8);
        /*System.out.println(Asistent.getIme());
        System.out.println(Asistent.getPrezime());
        System.out.println(Asistent.getGodinaRodjenja());
        System.out.println(Asistent.getVisina());*/
        System.out.println(Asistent);
        // Asistent.visina=200; -Staro
        Asistent.setVisina(200); //-Novo
        System.out.println(Asistent.getVisina());

    }
}
