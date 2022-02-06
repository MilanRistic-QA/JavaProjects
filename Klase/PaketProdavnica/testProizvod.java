package PaketProdavnica;

public class testProizvod {
    public static void main(String[] args) {
        Proizvod p1 = new Proizvod("Čaša",230.99,"Staklena", -50);
        System.out.println(p1);
        p1.setCenaProizvoda(-250.23);
        System.out.println(p1);
        ProizvodNaStanju pS1 = new ProizvodNaStanju(p1, 123);
        pS1.setKoličinaNaStanju(-10);
        System.out.println(pS1);
    }
}
