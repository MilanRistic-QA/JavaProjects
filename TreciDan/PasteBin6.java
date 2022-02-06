import java.util.Scanner;

public class PasteBin6 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Unesite pozitivan celi broj: ");
            int x=sc.nextInt();
            int f=1;
            for (int i=1;i<=x;i++) {
                f=f*i;
            }
            System.out.println("Proizvod prvih "+x+" celih brojeva je: "+f);

        }
    }
