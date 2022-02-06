import java.util.Scanner;

public class PasteBin8 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Unesite vaše ime i prezime: ");
        String ime=sc.next();
        String prezime=sc.next();
        //System.out.println(ime+prezime);
        System.out.print("Unesite vašu godinu rođenja: ");
        int god=sc.nextInt();
        int razlika= 2021-god;
        int x = razlika - 6;
        if (x<=0) System.out.println(ime+" "+prezime+" tek treba da počne obrazovanje.");
        else if (x>12) System.out.println(ime+" "+prezime+" je završio školu");
        else System.out.println("Dobrodošao u "+x+". razred, "+ime+" "+prezime);
    }
}
