import java.util.Scanner;

public class PasteBin2 {
    public static void main(String[] args) {
        System.out.print("Unesite makoji ceo broj: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if (n<0) System.out.println("Negativan");
        else if (n>0) System.out.println("Pozitivan");
        else System.out.println("Neutralan");
    }
}
