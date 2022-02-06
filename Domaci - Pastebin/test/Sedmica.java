public class Sedmica {
    public static void main(String[] args) {
        String[] dani= new String[7];
        dani[0]="Ponedeljak";
        dani[1]="Utorak";
        dani[2]="Sreda";
        dani[3]="Četvrtak";
        dani[4]="Petak";
        dani[5]="Subota";
        dani[6]="Nedelja";
        String niz[]={"januar", "februar", "mart", "sever", "zapad", "jug"};
        for (int i=0;i<niz.length;i++)
            System.out.println(niz[3]);

        System.out.println("************");
        for (int i=dani.length-1;i>=0;i--)
            System.out.println(dani[i]);

     /*   for (int i=0;i<7;i++)
        System.out.println(i+1+". dan u nedelji je "+dani[i]); */
    /*    int[] brDana=new int[7];
        for (int i=0;i<brDana.length;i++)
            brDana[i]=i+1;
        for (int i=0;i<brDana.length;i++)
            System.out.println(brDana[i]+". dan u neelji je "+dani[i]); */

    }
}
