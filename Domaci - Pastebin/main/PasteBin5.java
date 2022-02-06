import java.util.Scanner;

public class PasteBin5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Unesite pozitivan ceo broj: ");
       // int n=2*sc.nextInt();
       // for (int i=-14;i<=n;i++) System.out.print(i+" ");
        int n=sc.nextInt();
        for (int i=-14;i<=2*n;i++) System.out.print(i+" ");
    }
}
