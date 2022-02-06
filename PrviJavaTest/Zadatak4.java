package JavaTest;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite iznos u dinarima: ");
        double dinari=sc.nextDouble();
        System.out.print("Unesite valutu u koju želite da konvertujete (evro/franak/dolar): ");
        String valuta=sc.next();
        double vrednostUValuti=Konvertor(dinari, valuta);

        System.out.println(dinari+" dinara, kad se prebaci u "+valuta+", iznosi "+vrednostUValuti+" u toj valuti.");

    }

    public static double Konvertor(double dinari, String valuta) {
        double vrednostUValuti=0.0; //vrednostUValuti će dobiti novu vrednost u If petlji
        if (valuta.equals("evro"))
            vrednostUValuti=dinari*0.0085;
        else if(valuta.equals("franak"))
            vrednostUValuti=dinari*0.0093;
        else if(valuta.equals("dolar"))
            vrednostUValuti=dinari*0.010;
        else System.out.println("Niste uneli ispravno valutu");

        return vrednostUValuti;
    }
}
