import java.util.Scanner;

public class Faktorijal {
    public static void main(String[] args) {
        System.out.println("Unesite broj čiji faktorijel želite: ");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        int f=1;
       // 4!=4*3*2*1  //7!=7*5*3*1 //6!=6*4*2
        if (n%2==0)
            for (int i=2;i<=n;i+=2)
                f=f*i;
        else if (n%2!=0)
            for (int i=1;i<=n;i+=2)
                f=f*i;

       /*
        int f=1;
        for (int i=1;i<=n;i++)
            f=f*i; */
        System.out.println("Dupli Faktorijal unetog broja je "+f);
    }
}
