package Klase;

public class Krug {
    double poluPrecnik;
    Krug (double poluPrecnik) {
        this.poluPrecnik = poluPrecnik;
    }
    double obim() {
        double obim = 2*poluPrecnik*3.14;
        return obim;
    }
    double povrsina() {
        double povrsina=poluPrecnik*poluPrecnik*3.14;
        return povrsina;
    }
}
