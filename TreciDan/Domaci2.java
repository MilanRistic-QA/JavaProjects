import java.util.Scanner;

public class Domaci2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite nenegativan celi broj: ");
        int x=sc.nextInt();
        for (int i=1;i<=x;i++) {
            System.out.print(i);
            if (i%3==0) {
                System.out.print("Fizz");
                if (i%5==0) {
                    System.out.println("Buzz");
                } else System.out.println();            }
            else if (i%5==0) {
                System.out.println("Buzz");
            } else System.out.println();
        }
    }
}
