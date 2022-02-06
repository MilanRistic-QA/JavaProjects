import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Unesite ceo broj čiju naizmeničnu sumu želite: ");
        int n=sc.nextInt();
        int nsuma=0;
        for(int i=1;i<=n;i++)
            if(i%2==0)
            nsuma=nsuma-i;
        else nsuma=nsuma+i;
        System.out.println("Rešenje izraza 1-2+3-...(+/-)n jednako je: "+nsuma);

    }
}
