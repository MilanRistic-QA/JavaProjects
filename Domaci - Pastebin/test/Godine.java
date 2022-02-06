import java.util.Scanner;

public class Godine {
    public static void main(String[] args) {
        int g[]={7,13,17,18}; //kada sam hteo da testiram program na osnovu godina
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite željeno godište preko tastature: ");
        for (int i=0;i<g.length;i++) {
            g[i]=sc.nextInt();
            punoletan(godineKorisnika(g[i]));
        }
    }

    public static void punoletan(int i) {
        if (i<18)
            System.out.println("Osoba ima "+i+" godina i nije punoletna.");
        else System.out.println("Osoba ima "+i+" godina i jeste punoletna.");

    }

    public static int godineKorisnika(int g) {
        int godineKorisnika=2021-g;
        return godineKorisnika;

    }
}
