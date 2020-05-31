package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj tekst");
        String tekst = scan.nextLine();
        int dlugoscTekstu =tekst.length();
        int suma=0;
        for(int i=0; i<dlugoscTekstu; i++){ //sprawdzamy po kolei każdy znak w tekście
            if(Character.getNumericValue(tekst.charAt(i))>=0 && Character.getNumericValue(tekst.charAt(i))<10){ //sprawdzamy, czy dany znak jest cyfrą
                int cyfra=Character.getNumericValue(tekst.charAt(i)); //jeśli jest, zapisujemy jej wartość
                suma=suma+cyfra;  //sumujemy po kolei znalezione cyfry
            }
        }
        System.out.println("Suma cyfr to: "+suma);
    }
}
