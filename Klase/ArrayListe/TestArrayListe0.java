package ArrayListe;

import java.util.ArrayList;

public class TestArrayListe0 {
    public static void main(String[]args){
    ArrayList<Integer> niz = new ArrayList<>();
    niz.add(2);
    niz.add(3);
    niz.add(5);
    niz.add(7);
    niz.add(11);
    for (int element: niz) {
        System.out.println(element);
    }
    //Duplirati svaki element niza
        for (int element: niz) {
            element=2*element; //Uvođenjem promenljive element u stvari ne menjamo ništa u nizu
            System.out.println(element);
        }



    //Okrenuti niz unazad - može se videti da je okrenut prvi niz, a ne duplirani
        for (int i=0; i< niz.size()-1;i++) {
            niz.add(i, niz.get(niz.size()-1));
            niz.remove(niz.size()-1);
        }
        for (int element: niz) {
            System.out.println(element);
        }
    }
}


