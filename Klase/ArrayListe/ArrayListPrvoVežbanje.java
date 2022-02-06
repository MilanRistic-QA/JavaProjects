package ArrayListe;

import java.util.ArrayList;

public class ArrayListPrvoVežbanje {
    public static void main(String[] args) {
        ArrayList<Integer> nizCelihBrojeva = new ArrayList<Integer>();
         nizCelihBrojeva.add(2);
        System.out.println("Niz je sada dužine "+nizCelihBrojeva.size());
        nizCelihBrojeva.add(5);
        nizCelihBrojeva.add(7);
        /*nizCelihBrojeva.addAll(Collection<?extends Integer>)*/ //-Kako ubaciti više elemenata odjednom;
        System.out.println("Niz je sada dužine "+nizCelihBrojeva.size());
        nizCelihBrojeva.add(13);
        nizCelihBrojeva.add(17);
        nizCelihBrojeva.add(5,19);
        nizCelihBrojeva.add(1, 3);
        nizCelihBrojeva.remove(2);

        System.out.println("Niz je sada dužine "+nizCelihBrojeva.size());
        for (int i=0; i< nizCelihBrojeva.size();i++)
            System.out.println(nizCelihBrojeva.get(i));
        nizCelihBrojeva.set(2, 5);
        System.out.println("Niz je sada dužine "+nizCelihBrojeva.size());
        /*for (int i=0; i< nizCelihBrojeva.size();i++)
            System.out.println(nizCelihBrojeva.get(i));*/
        // int i=0; pre petlje ako vam je potrebno da imate brojač sa ovim drugim načinom, pa onda u petlji i++
        for(int element: nizCelihBrojeva) { //drugi način da se ispiše niz
            System.out.println(element);
        }

    }
}
