package com.company;
import java.util.Scanner;

public class Main {

    public static class Uczen{
        String imie;
        String nazwisko;
        String pesel;

        public void Ustaw_Imie(String podajImie){
            imie=podajImie;
        }
        public void Ustaw_nazwisko(String podajNazwisko){
            nazwisko=podajNazwisko;
        }
        public void Ustaw_pesel(String podajPesel){
            pesel=podajPesel;
        }
    }

    public static class UczenSzkoly extends Uczen{
        String Nazwa_szkoly;
        public void Ustaw_szkole(String podajSzkole){
            Nazwa_szkoly=podajSzkole;
        }
    }

    public static class UczenKlasy extends UczenSzkoly{
        String klasa;
        public void Ustaw_klase(String podajKlase){
            klasa=podajKlase;
        }
    }

    public static void main(String[] args) {

        UczenKlasy klasa1 = new UczenKlasy();
        Scanner dane = new Scanner(System.in);

        System.out.println("Podaj imię");
        String wprowadzImie = dane.nextLine();
        klasa1.Ustaw_Imie(wprowadzImie);
        System.out.println("Podaj nazwisko");
        String wprowadzNazwisko = dane.nextLine();
        klasa1.Ustaw_nazwisko(wprowadzNazwisko);
        System.out.println("Podaj pesel");
        String wprowadzPesel = dane.nextLine();
        klasa1.Ustaw_pesel(wprowadzPesel);
        System.out.println("Podaj nazwę szkoły");
        String wprowadzSzkole = dane.nextLine();
        klasa1.Ustaw_szkole(wprowadzSzkole);
        System.out.println("Podaj swoją klasę");
        String wprowadzKlase = dane.nextLine();
        klasa1.Ustaw_klase(wprowadzKlase);

    }
}
