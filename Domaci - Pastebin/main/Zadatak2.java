import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Unesite dva cela broja od kojih je prvi broj manji: ");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int suma=0;
        for (int i=m;i<=n;i++) suma=suma+i;
        System.out.println("Suma intervala brojeva od "+m+" do "+n+" je: "+suma);
    }
}
