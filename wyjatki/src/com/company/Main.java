package com.company;

public class Main {
    public static class wypisz {
        void wypiszDługość(String slowo) {
            System.out.println(slowo.length()); //wypisanie długości słowa
        }
    }

    public static void main(String[] args) throws Exception {
        try {
            wypisz dlugoscSlowa = new wypisz();
            // String wyrazenie="Mateusz"; //poprawne testowanie funkcji dla poprawnego argumentu "wyrazenie"
            dlugoscSlowa.wypiszDługość(null);  //testujemy obsługę wyjątku
        } catch (NullPointerException wyjatek){
            throw new Exception(wyjatek); //obsługa wyjątku
        }
    }
}
