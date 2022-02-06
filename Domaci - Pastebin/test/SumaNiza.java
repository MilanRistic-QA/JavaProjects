public class SumaNiza {
    public static void main(String[] args) {
        /* int[] brojevi = {2, 13, 57, 472};
        int suma = 0;
        for (int i=0;i<brojevi.length;i++)
            suma+=brojevi[i];
        System.out.println(suma);*/
        int nizBrojeva[]={42, 3, 5, 89, 54, 30, 32};
        int min= nizBrojeva[0];
        for (int i=0;i<nizBrojeva.length;i++)
            if (nizBrojeva[i]<min) min=nizBrojeva[i];
        System.out.println("Minimum je "+min);
        int max= nizBrojeva[0];
        for (int i=0;i<nizBrojeva.length;i++)
            if (nizBrojeva[i]>max) max=nizBrojeva[i];
        System.out.println("Maksimum je "+max);
        System.out.println("Razlika između minimuma i maksimuma je "+(max-min));
        int suma=0;
        for (int i=0;i<nizBrojeva.length;i++)
            suma+=nizBrojeva[i];
        System.out.println("Prosečna vrednost niza je "+(1.0*suma/nizBrojeva.length));

    }
}
