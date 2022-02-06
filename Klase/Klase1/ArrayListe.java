package Klase1;

import java.util.ArrayList;

public class ArrayListe {
    public static void main(String[] args) {
        ArrayList<String> mačka = new ArrayList<String>();
        mačka.add("Šape");
        mačka.add("Rep");
        mačka.add("Okice");
        mačka.add("Krzno");
        mačka.add("Zdelica za vodu");
        mačka.add("Hrana");
        mačka.add("Brkovi");
        mačka.add("Klupko");

        System.out.println(mačka.get(2));
        mačka.set(0, "miš");
        mačka.remove(4);


        for(int i = 0; i < mačka.size(); i++){
            System.out.println(mačka.get(i));
        }

        for(String items : mačka){
            System.out.println(items);
        }
    }
}
