public class Zadatak42 {
    //Napisati funkciju koja proverava da li u nizu niski imena postoji "Marija" ili "Petar".
    public static void main(String[] args) {
        String nizImena[] = {"Ana", "Marija", "Jaca", "Milica", "Jovana"};
        /*Ovako sam prvi put radio:
        ImaLiImena("Marija", nizImena);
        ImaLiImena("Petar", nizImena);
    }
    public static void ImaLiImena(String ime, String[] nizImena) {
        boolean imaImena=false;
        for (int i=0;i< nizImena.length;i++)
            if (ime.equals(nizImena[i])) {
                System.out.println("U nizu imena postoji ime "+ime);
                imaImena=true;
            }
        if (imaImena==false)
            System.out.println("U nizu imena ne postoji ime "+ime);*/
        boolean imaImena = imaLiImena(nizImena);
        if (imaImena == true) {
            System.out.println("U nizu imena postoji bar jedno ime Marija ili Petar");
        } else {
            System.out.println("U nizu imena ne postoji ni jedno ime Marija ili Petar");
        }
    }
    public static boolean imaLiImena(String[] nizImena) {
        boolean imaImena = false;
        for (int i = 0; i < nizImena.length; i++) {
            if (nizImena[i].equals("Marija") || nizImena[i].equals("Petar")) {
                imaImena = true;
            }
        }
        return imaImena;
    }
}

