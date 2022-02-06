import java.util.Scanner;

public class PasteBin1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite neki ceo broj: ");
        int x=sc.nextInt();
        if (x%2==0) System.out.println("Paran");
        else System.out.println("Neparan");
    }
}
