package com.company;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.io.File;
import java.util.StringTokenizer;

/* Napisać funkcję public static void szukaj(String nazwaPlikWe, String nazwaPlikWy, String słowo) 
której zadaniem jest znalezienie wszystkich wierszy w pliku, które zawierają szukane słowo. 
Wszystkie wiersze, które zawierają słowo powinny zostać zapisane w pliku wynikowym wraz z nr wiersza (z pierwszego pliku). 
Nazwa pierwszego pliku zapamiętana jest w parametrze nazwaPlikWe, nazwa pliku wynikowego podana jest w parametrze nazwaPlikWy, 
natomiast szukane słowo w parametrze słowo.
*/

public class Main {
    public static void szukaj(String nazwaPliku, String nazwaPlikWy, String slowo) throws IOException {

        File plik = new File(nazwaPliku);
        FileWriter zapis = new FileWriter(nazwaPlikWy);
        Scanner in = new Scanner(plik);
        long iloscLinii = Files.lines(Paths.get(nazwaPliku)).count(); //liczymy ilość linii w pliku

        for(int i=1; i<=iloscLinii; i++) {
            String trescLinii = in.nextLine(); //zczytujemy kolejne linie tekstu

            StringTokenizer tresc = new StringTokenizer(trescLinii, " "); //wskazujemy, czym są rozdzielane wyrazy (tu spacją)
            while (tresc.hasMoreTokens()) {
                String znalezionyWyraz = tresc.nextToken();
                if (znalezionyWyraz.equalsIgnoreCase(slowo)) //sprawdzamy, czy znaleziony wyraz jest taki sam jak szukane słowo
                {
                    zapis.write(i+": "+trescLinii+"\n"); //jeśli tak, zapisujemy cały wiersz do pliku
                }
            }
        }
        zapis.close();
    }
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj słowo, z którym chcesz znaleźć wszystkie wersy");
        String szukaneSlowo = scan.nextLine();
        System.out.println("Podaj pełną nazwę pliku, z którego chcesz wczytać dane");
        String plikWejsciowy = scan.nextLine();
        System.out.println("Podaj pełną nazwę pliku, pod który chcesz zapisać dane");
        String plikWyjsciowy = scan.nextLine();

        szukaj(plikWejsciowy, plikWyjsciowy, szukaneSlowo);

    }
}
