import java.util.Scanner;

public class PasteBin4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Unesite negativan ceo broj: ");

        for (int n=sc.nextInt();n<=0;n++) System.out.print(n+" ");
    }
}
