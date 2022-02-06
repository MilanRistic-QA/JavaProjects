package Klase1;
import java.util.ArrayList;

    public class DuplaPetlja {
        public static void main(String[] args) {

            ArrayList<Integer> dani = new ArrayList<Integer>();
            dani.add(1);
            dani.add(2);
            dani.add(3);
            dani.add(4);
            dani.add(5);
            dani.add(6);
            dani.add(7);

            ArrayList<Integer> nedelja = new ArrayList<Integer>();
            nedelja.add(1);
            nedelja.add(2);
            nedelja.add(3);

            for(int sedmica : nedelja) {
                System.out.println("Nedelja: " + sedmica);
                for (int dan : dani) {
                    System.out.println("Dan: " + dan);
                }
            }

        }
    }
