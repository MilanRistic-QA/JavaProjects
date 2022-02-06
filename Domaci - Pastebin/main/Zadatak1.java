import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Unesite broj čiji želite dupli faktorijel: ");
        int n=sc.nextInt();
        int f=1;
        if (n%2==0) {
            for (int i=2;i<=n;i+=2) {
                f=f*i;
            }
        }
        else {
            for (int i=1; i<=n;i+=2) {
                f*=i;
            }
        }
        System.out.println(f);
    }
}
