import java.util.Scanner;

public class UnosNiza {
    public static void main(String[] args) {
      /*  String niz[] = new String[5];
        System.out.print("Unesite elemente niza: ");
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<niz.length;i++)
            niz[i]=sc.next();
        for (int i=0;i<niz.length;i++)
            System.out.println(niz[i]); */
        int celiBrojevi[]={5,6,15,16,42,43};
        int nedeljiv=0;
        for(int i=0;i<celiBrojevi.length;i++) {
            if (celiBrojevi[i]%3==0) {
                nedeljiv++;
                System.out.println(celiBrojevi[i]);
            }
        }
        // System.out.println("Nedeljiv je "+nedeljiv);
        if (nedeljiv==0) System.out.println("Nijedan član niza nije deljiv sa 3");
    }
}
