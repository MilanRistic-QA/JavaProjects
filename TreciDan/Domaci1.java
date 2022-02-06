import java.util.Scanner;

public class Domaci1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite prvi broj: ");
            int x=sc.nextInt();
        System.out.print("Unesite drugi broj: ");
            int y=sc.nextInt();
        int z=x+y;
        System.out.println(x+"+"+y+"="+z);
        z=x-y;
        System.out.println(x+"-"+y+"="+z);
        z=x*y;
        System.out.println(x+"*"+y+"="+z);
        double d=1.0*x/y;
        System.out.println(x+"/"+y+"="+d);
        z=x%y;
        System.out.println(x+"%4"+y+"="+z);

    }
}
