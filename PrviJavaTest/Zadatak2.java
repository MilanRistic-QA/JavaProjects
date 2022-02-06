package JavaTest;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print ("Unesite tip vozila: ");
        String tipVozila=sc.next(); //U zadatku piše da nakon što korisnik unese tip vozila otvara se ostatak programa kroz switch
        switch (tipVozila) {
            case "Motor": {
                System.out.print("Molim vas unesite distancu u Km: ");
                double distanca = sc.nextDouble();
                double potrošnja = distanca * 5 / 100;
                System.out.println("Motor na "+distanca+"Km potroši "+potrošnja+"litara goriva.");
                break;
            }
            case "Automobil": {
                System.out.print("Molim vas unesite distancu u Km: ");
                double distanca = sc.nextDouble();
                double potrošnja = distanca * 7 / 100;
                System.out.println("Automobil na "+distanca+"Km potroši "+potrošnja+"litara goriva.");
                break;
            }
            case "Kombi": {
                System.out.print("Molim vas unesite distancu u Km: ");
                double distanca = sc.nextDouble();
                double potrošnja = distanca * 11 / 100;
                System.out.println("Kombi na "+distanca+"Km potroši "+potrošnja+"litara goriva.");
                break;
            }
            case "Kamion": {
                System.out.print("Molim vas unesite distancu u Km: ");
                double distanca = sc.nextDouble();
                double potrošnja = distanca * 15 / 100;
                System.out.println("Kamion na "+distanca+"Km potroši "+potrošnja+"litara goriva.");
                break;
            }
            default:
                System.out.println("Niste uneli ispravan tip vozila (Obratite pažnju na velika i mala slova!)");
        }

        }

    }

