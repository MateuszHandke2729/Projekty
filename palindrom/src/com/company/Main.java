package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj tekst");
        String tekst = scan.nextLine();
        int dlugoscTekstu =tekst.length();
        byte kontrolna=0; //w zależności od jej wartości wyświetlamy odpowiedni napis
        for(int i=0; i<dlugoscTekstu; i++){
            if(tekst.charAt(i)!=tekst.charAt(dlugoscTekstu - 1)){ //porównujemy kolejne litery na zasadzie pierwsza-ostatnia, druga-przedostatnia etc...
                System.out.println("Nie jest palindromem");
                kontrolna=1;
                break;
            }

            dlugoscTekstu--;
        }
        if(kontrolna==0){
            System.out.println("Tekst jest palindromem");
        }
    }
}
