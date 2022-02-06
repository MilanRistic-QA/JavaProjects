package Telefonija;

public class Poruka extends Usluga {
    private String tekstPoruke;

    public Poruka(Broj brojOd, Broj brojKa, String tekstPoruke) {
        super(brojOd, brojKa);
        this.tekstPoruke = tekstPoruke;
    }

    public String getTekstPoruke() {
        return tekstPoruke;
    }
    public void setTekstPoruke(String tekstPoruke) {
        this.tekstPoruke = tekstPoruke;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append(" ").append(tekstPoruke); //u prvoj zagradi će pozvati toString metodu klase Usluga;
        /*sb.append(brojOd).append(" -> ").append(brojKa); //brojOd će pozvati automatski toString metodu klase Broj prikazanu dole:*/
        /*sb.append("+").append(tekstKodDržave).append(" ").append(pozivniBroj).append(" ").append(broj);*/
        return sb.toString();
    }
     /*- nadjacati metodu cena usluge. Metoda vraca koliko je cena slanja poruke sa brojOd na brojKa.
                Cena poruke ukoliko ju je moguce poslati je 3 dinara, ukoliko je nije moguce poslati cena je 0 dinara.
                Poruku je moguce poslati ako
        - brojOd nije jednak null
                - brojKa nije jednak null i
                - brojOd i brojKa nisu jednaki medjusobno i
        - brojOd nije fiksni broj i
        - brojKa nije fiksni broj*/
}
