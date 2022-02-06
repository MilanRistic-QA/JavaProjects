import java.util.Scanner;

public class PasteBin7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mesec, dan;
        System.out.print("Unesite mesec za koji želite da odredite Horoskopski znak (Brojevi 1-12): ");
        mesec = sc.nextInt();
        System.out.print("Unesite dan u mesecu: ");
        dan = sc.nextInt();
        switch (mesec) {
            case 1:
                if (dan<20) System.out.println("Jarac");
                else System.out.println("Vodolija");
                break;
            case 2:
                if (dan<20) System.out.println("Vodolija");
                else System.out.println("Ribe");
                break;
            case 3:
                if (dan<21) System.out.println("Ribe");
                else System.out.println("Ovan");
                break;
            case 4:
                if (dan<21) System.out.println("Ovan");
                else System.out.println("Bik");
                break;
            case 5:
                if (dan<21) System.out.println("Bik");
                else System.out.println("Blizanci");
                break;
            case 6:
                if (dan<21) System.out.println("Blizanci");
                else System.out.println("Rak");
                break;
            case 7:
                if (dan<23) System.out.println("Rak");
                else System.out.println("Lav");
                break;
            case 8:
                if (dan<23) System.out.println("Lav");
                else System.out.println("Devica");
                break;
            case 9:
                if (dan<23) System.out.println("Devica");
                else System.out.println("Vaga");
                break;
            case 10:
                if (dan<23) System.out.println("Vaga");
                else System.out.println("Škorpija");
                break;
            case 11:
                if (dan<23) System.out.println("Škorpija");
                else System.out.println("Strelac");
                break;
            case 12:
                if (dan<22) System.out.println("Strelac");
                else System.out.println("Jarac");
                break;
            default:
                System.out.println("Uneti mesec mora biti broj između 1 i 12!");
        }
    }
}
