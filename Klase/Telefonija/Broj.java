package Telefonija;

public class Broj {
    private String tekstKodDržave;
    private String pozivniBroj;
    private String broj;
    private boolean fiksniBroj;

    public Broj (String tekstKodDržave, String pozivniBroj, String broj, boolean fiksniBroj) {
        if(proveriBroj(tekstKodDržave, pozivniBroj, broj)) {//Funkcija će izvršiti dodelu vrednosti samo ako je proveri Broj==true
            //Poruke o grešci će se automatski ispisati
            this.tekstKodDržave = tekstKodDržave;
            this.pozivniBroj = pozivniBroj;
            this.broj = broj;
            this.fiksniBroj = fiksniBroj;
        }
    }

    public String getTekstKodDržave() {
        return tekstKodDržave;
    }
    public String getPozivniBroj() {
        return pozivniBroj;
    }
    public String getBroj() {
        return broj;
    }
    public boolean getFiksniBroj() {
        return fiksniBroj;
    }

    public void setTekstKodDržave(String tekstKodDržave) {
        if(proveriBroj(tekstKodDržave, pozivniBroj, broj)) //Funkcija će izvršiti dodelu vrednosti samo ako je proveri Broj==true
            //Poruke o grešci će se automatski ispisati
        this.tekstKodDržave = tekstKodDržave;
    }
    public void setPozivniBroj(String pozivniBroj) {
        if(proveriBroj(tekstKodDržave, pozivniBroj, broj)) //Funkcija će izvršiti dodelu vrednosti samo ako je proveri Broj==true
            //Poruke o grešci će se automatski ispisati
        this.pozivniBroj = pozivniBroj;
    }
    public void setBroj(String broj) {
        if(proveriBroj(tekstKodDržave, pozivniBroj, broj)) //Funkcija će izvršiti dodelu vrednosti samo ako je proveri Broj==true
            //Poruke o grešci će se automatski ispisati
        this.broj = broj;
    }
    public void setFiksniBroj(boolean fiksniBroj) {
        this.fiksniBroj = fiksniBroj;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("+").append(tekstKodDržave).append(" ").append(pozivniBroj).append(" ").append(broj);
        return sb.toString();
    }
    private static boolean proveriDaLiStringSadrziSamoNumerike(String brojevi) {
        return true;
    }
    private static boolean proveriBroj(String kodDržave, String pozivniBroj, String broj) {
        boolean dobarBroj = true;
        if(kodDržave==null || kodDržave.length()!=3 || proveriDaLiStringSadrziSamoNumerike(kodDržave)!=true) {
            dobarBroj = false;
            System.out.println("Niste uneli ste dobar broj");
        }
        else if (pozivniBroj==null || pozivniBroj.length()!=2 || proveriDaLiStringSadrziSamoNumerike(kodDržave)!=true) {
            System.out.println("Niste uneli ste dobar broj");
            dobarBroj = false;
        }
        else if (broj==null || broj.length()!=7 || broj.length()!=8|| proveriDaLiStringSadrziSamoNumerike(kodDržave)!=true) {
            System.out.println("Niste uneli ste dobar broj");
            dobarBroj = false;
        }
        else {
            System.out.println("Uneli ste dobar broj");
        }
        return dobarBroj;
    }
}
