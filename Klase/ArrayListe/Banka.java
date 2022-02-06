package ArrayListe;

import Klase.BankovniRačun;
import Klase.Osoba;

import java.util.ArrayList;

public class Banka {
    private String ime;
    private String ulica;
    private Osoba Direktor;
    private ArrayList<BankovniRačun> nizBankovnihRačuna;

    public Banka(String ime, String ulica, Osoba direktor, ArrayList<BankovniRačun> nizBankovnihRačuna) {
        this.ime = ime;
        this.ulica = ulica;
        Direktor = direktor;
        if(nizBankovnihRačuna==null)
            this.nizBankovnihRačuna = new ArrayList<>();
        else
            this.nizBankovnihRačuna = nizBankovnihRačuna;
    }

    public String getIme() {
        return ime;
    }
    public String getUlica() {
        return ulica;
    }
    public Osoba getDirektor() {
        return Direktor;
    }
    public ArrayList<BankovniRačun> getNizBankovnihRačuna() {
        return nizBankovnihRačuna;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }
    public void setUlica(String ulica) {
        this.ulica = ulica;
    }
    public void setDirektor(Osoba direktor) {
        Direktor = direktor;
    }
    public void setNizBankovnihRačuna(ArrayList<BankovniRačun> nizBankovnihRačuna) {
        this.nizBankovnihRačuna = nizBankovnihRačuna;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ime banke: ").append(ime).append("\n");
        sb.append("Ulica: ").append(ulica).append("\n");
        sb.append("Direktor: ").append(Direktor.getIme()).append(" ").append(Direktor.getPrezime()).append("\n");
        if(nizBankovnihRačuna.isEmpty()==true) //"==true" može i da se izostavi
            sb.append("U ovoj banci trenutno ne postoje bankovni računi.");
        else {
            sb.append("Osobe koje imaju račun u ovoj banci su: \n");
            for(BankovniRačun element: nizBankovnihRačuna) {
                sb.append(element);
            }
        }

        return sb.toString();
    }
    public void dodajBankovniRačun(BankovniRačun b) {
        nizBankovnihRačuna.add(b);
    }
    public void ukloniBankovniRačun(BankovniRačun b) {
        nizBankovnihRačuna.remove(b);
    }
    //Ovako sam ja uradio:
    /*public void ukloniBankovniRačun(Osoba klijent) {
        boolean računPostoji=false;
        for (BankovniRačun račun: nizBankovnihRačuna) {
            if (račun.getOsoba().equals(klijent)) {
                nizBankovnihRačuna.remove(račun);
                računPostoji=true;
                break;
            }
        }
        if (računPostoji==false)
            System.out.println("U ovoj banci ne postoji račun koji ima ta osoba");
        else
            System.out.println("Račun osobe "+klijent+"je uspešno obrisan");
    }*/
    //Ovako je Zoki uradio:
    public void ukloniBankovniRačun(Osoba klijent) {
        BankovniRačun bankovniRačunOveOsobe =null;
        for (BankovniRačun račun: nizBankovnihRačuna) {
            Osoba vlasnikOvogRačuna =račun.getOsoba();
            /*if(klijent.equals(račun.getOsoba()))*/
            if(vlasnikOvogRačuna.equals(klijent)){
                bankovniRačunOveOsobe=račun;
                break;
            }
        }
        if (bankovniRačunOveOsobe == null)
            System.out.println(klijent.getIme()+" "+klijent.getPrezime()+" nema Bankovni račun u ovoj banci");
        else
            nizBankovnihRačuna.remove(bankovniRačunOveOsobe);

    }
}
