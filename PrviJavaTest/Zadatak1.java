package JavaTest;

public class Zadatak1 {
    public static void main(String[] args) {
        int niz[]={11, 22, 33, 44, 55, 66, 77, 88, 99, 1010};
        int najveći=niz[0];
        for (int i=1;i< niz.length;i++)
            if (najveći<niz[i])
                najveći=niz[i];
        System.out.println("Najveći broj u nizu je "+najveći);
    }
}
