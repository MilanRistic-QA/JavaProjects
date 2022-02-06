import java.util.Scanner;
/* Lepo od tebe Strahinja što si nam za domaći zadao ovaj lak zadatak.
Ne verujem ni da bih stigao da uradim nešto kompleksno od onih stvari koje smo radili krajem nedelje
pošto slušam ponovo predavanja i sve zadatke radim detaljno i puno isprobavam i samim tim i puno učim
ali mi na to odlazi i puno vremena.
P.S. Na ovaj zadatak sam posebno ponosan kako sam ga uradio
 */
public class PasteBin9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Upišite jedan ceo broj: ");
        int n=sc.nextInt();
        for (int i=1;i<=n;i++) {
            System.out.print(i+" ");
            if (i%3==0)
                System.out.print("Fizz");
            if (i%5==0)
                System.out.print("Buzz");
            if (i%7==0)
                System.out.print("Zazz");
            System.out.println();
        }
    }
}
