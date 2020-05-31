package com.company;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.io.File;

public class Main {

    public static int[] liczZnakiSlowa(String nazwaPliku) throws IOException {

        File plik = new File(nazwaPliku);
        Scanner in = new Scanner(plik);
        int[] tab= new int[3];
        long iloscLinii = Files.lines(Paths.get(nazwaPliku)).count(); //zlicza ilość linii w pliku
        for (int i = 0; i < iloscLinii; i++){
            String wiersz = in.nextLine();
            tab[0] = tab[0] + wiersz.length(); //zlicza ilość znaków w każdym wierszu i sumuje

            for (int j = 0; j < wiersz.length(); j++){
                char znak;
                int kodAscii;
                znak = wiersz.charAt(j);
                kodAscii = (int)znak;    //zwraca kod ascii dla sprawdzanego znaku
                if (kodAscii == 9 || kodAscii == 13 || kodAscii == 32){    //sprawdza, czy dany znak jest tabulatorem, enterem lub spacją
                    tab[1]++; //jeżeli okaże się "białym znakiem" zwiększamy licznik o 1
                }
            }
        }
        Scanner slowa = new Scanner(plik);
        while (slowa.hasNext()) {
            slowa.next();
            tab[2]++;  //zliczamy ilość słów w pliku
        }
        slowa.close();
        return tab;
    }

    public static void main(String[] args) throws IOException {

        int[] tablica = new int[3];
        tablica = liczZnakiSlowa("tekst.txt"); //wywołujemy funkcję dla podanej nazwy pliku
        System.out.println("Liczba znakow: " + tablica[0]);
        System.out.println("Liczba białych znaków: " + tablica[1]);
        System.out.println("Liczba słów: " + tablica[2]);
    }
}
