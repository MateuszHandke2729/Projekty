package com.company;
import java.util.Scanner;
//Zadanie polegające na przećwiczeniu konstruktorów i bloków statycznych
public class Main {

    public static class Rownanie {

        static int x;
        static int x2;
        double a;
        double b;
        double c;

        Rownanie() //konstruktor bez parametrów
        {
            System.out.println("Twoje rozwiązania: ");
        }
        Rownanie(double a, double b, double c) //konstruktor z trzema parametrami
        {
            this(); //wypisanie tego, co ma konstruktor bez parametrów
            this.a=a;
            this.b=b;
            this.c=c;
        }
        private double delta(){
            return  (b*b)-4*a*c;
        }
        private double X0(){
            return -b/2*a;
        }
        private double X1(){
            return (-b+Math.sqrt(delta()))/2*a;
        }
        private double X2(){
            return (-b-Math.sqrt(delta()))/2*a;
        }
        private double wartosc(){
            return (a*x*x)+(b*x)+c;
        }
        private double wartosc2(){
            return (a*x2*x2)+(b*x2)+c;
        }
        private double wierzcholekQ(){
            return -delta()/4*a;
        }

        public void zwrocWynik(){
            if(delta()>0){
                System.out.println("Miejscami zerowymi Twojej funkcji kwadratowej są: " +X1()+ " i "+X2());
                System.out.println("Wierzchołek Twojej funkcji kwadratowej to punkt ("+X0()+","+wierzcholekQ()+")");
                System.out.println("Wartość Twojej funkcji kwadratowej dla x = "+x+" wynosi: "+wartosc());
                System.out.println("Wartość Twojej funkcji kwadratowej dla x = "+x2+" wynosi: "+wartosc2());
            }
            if(delta()==0){
                System.out.println("Miejscem zerowym Twojej funkcji kwadratowej jest: " +X0());
                System.out.println("Wierzchołek Twojej funkcji kwadratowej to punkt ("+X0()+","+wierzcholekQ()+")");
                System.out.println("Wartość Twojej funkcji kwadratowej dla x = "+x+" wynosi: "+wartosc());
                System.out.println("Wartość Twojej funkcji kwadratowej dla x = "+x2+" wynosi: "+wartosc2());
            }
            if(delta()<0){
                System.out.println("Twoja funkcja kwadratowa nie ma miejsc zerowych");
                System.out.println("Wierzchołek Twojej funkcji kwadratowej to punkt ("+X0()+","+wierzcholekQ()+")");
                System.out.println("Wartość Twojej funkcji kwadratowej dla x = "+x+" wynosi: "+wartosc());
                System.out.println("Wartość Twojej funkcji kwadratowej dla x = "+x2+" wynosi: "+wartosc2());
            }

        }
        static { //blok statyczny podający wartość x
            x=100;
        }
        static { //blok statyczny podający wartość x2
            x2=-100;
        }

    }

    public static void main(String[] args) {

        Scanner dane = new Scanner(System.in);

        System.out.println("Podaj a funkcji kwadratowej");
        double aFunkcjiKwadratowej = dane.nextDouble();
        System.out.println("Podaj b funkcji kwadratowej");
        double bFunkcjiKwadratowej = dane.nextDouble();
        System.out.println("Podaj c funkcji kwadratowej");
        double cFunkcjiKwadratowej = dane.nextDouble();

        Rownanie klasa1 = new Rownanie(aFunkcjiKwadratowej,bFunkcjiKwadratowej,cFunkcjiKwadratowej);
        klasa1.zwrocWynik();


    }
}
