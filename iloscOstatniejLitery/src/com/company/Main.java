package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj tekst");
        String tekst = scan.nextLine();
        int dlugoscTekstu =tekst.length();
        int iloscOstatniejLitery=0;
        for(int i=0; i<dlugoscTekstu; i++){ //przeszukujemy cały tekst
            if(tekst.charAt(i)==tekst.charAt(dlugoscTekstu - 1)){ //patrzymy czy obecny znak jest równy ostatniemu
                iloscOstatniejLitery++; //jeśli jest, zwiększamy licznik o 1
            }

        }
        System.out.println("Ilosc ostatniej litery: "+iloscOstatniejLitery);
    }

}
