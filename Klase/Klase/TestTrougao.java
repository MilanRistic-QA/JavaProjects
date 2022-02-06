package Klase;

public class TestTrougao {
    public static void main(String[] args) {
        Trougao t = new Trougao(3,4,-5);
        /*System.out.println("Dužine stranica trougla su "+t.getStranicaA()+", "+t.getStranicaB()+" i "+ t.getStranicaC());*/
        System.out.println(t);
        System.out.println("Obim trougla je "+t.Obim());
        System.out.println("Površina trougla je "+t.površina());
        t.setStranicaC(100);
    }
}
