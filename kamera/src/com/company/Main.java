package com.company;

public class Main {
    public static class Prostokat
    {
        public static int x;
        public static int y;

        public int zwrocX()
        {
            return x;
        }
        public void wczytajX(int x)
        {
            this.x = x;
        }
        public int zwrocY()
        {
            return y;
        }
        public void wczytajY(int y)
        {
            this.y = y;
        }
    }
    public static class Punkt
    {
        public static int iloscPunktow;
        public int zwrociloscPunktow()
        {
            return iloscPunktow;
        }
        public void wczytajiloscPunktow(int iloscPunktow)
        {
            this.iloscPunktow = iloscPunktow;
        }
    }
    public static void dodajX() { //funkcja przesuwa kamere w prawo
        Prostokat klasa1 = new Prostokat();
        Punkt klasa2 = new Punkt();

        klasa1.wczytajY(klasa1.zwrocY() + 20); //zwiększa pozycje kamery o 20 w gore
        if(klasa1.zwrocY()<500)
        {
            klasa1.wczytajY(klasa1.zwrocY() + 20); //jeżeli się da, to o kolejne 20 zwiększa pozycje kamery
            do                                  //ponieważ 500 nie dzieli się przez 40, zatem ostatnia pozycja kamery zwiekszy sie tylko o 20, aby sfotografować cały obszar i nie zabrakło paska o wysokości 20
            {
                klasa1.wczytajX(klasa1.zwrocX() + 40); //pozycja kamery o 40 w prawo
                klasa2.wczytajiloscPunktow(klasa2.zwrociloscPunktow() + 1); //zwiększamy o 1 punkt pomiarowy (wykonane zdjęcie)

            } while (klasa1.zwrocX() <600); //gdy kamera dojdzie do prawej krawędzi obszaru wywołujemy funkcję "odejmijX"
            odejmijX();
        }
        else
        { //gdy osiagniemy najwyzszy pułap, nie wywołujemy juz kolejnej funkcji
            do
            {
                klasa1.wczytajX(klasa1.zwrocX() + 40); //pozycja kamery o 40 w prawo
                klasa2.wczytajiloscPunktow(klasa2.zwrociloscPunktow() + 1); //zwiększamy o 1 punkt pomiarowy (wykonane zdjęcie)
            } while (klasa1.zwrocX() < 600);
            System.out.println(klasa2.zwrociloscPunktow());
        }

    }

    public static void odejmijX() { //funkcja przesuwa kamerę w lewo
        Prostokat klasa1 = new Prostokat();
        Punkt klasa2 = new Punkt();

        klasa1.wczytajY(klasa1.zwrocY() + 20); //zwiększa pozycję kamery o 20 w gore
        if (klasa1.zwrocY()<500)
        {
            klasa1.wczytajY(klasa1.zwrocY() + 20); //jeśli się da, to zwiększa o kolejne 20 (analogicznie jak dodajX)
            do
            {
                klasa1.wczytajX(klasa1.zwrocX() -40); //pozycja kamery o 40 w lewo
                klasa2.wczytajiloscPunktow(klasa2.zwrociloscPunktow() + 1); //zwiększamy o 1 punkt pomiarowy (wykonane zdjęcie)

            } while (klasa1.zwrocX() > 0); //gdy kamera dojdzie do lewej krawędzi obszaru wywołujemy funkcję "dodajX"
            dodajX();
        }
        else
        {
            do
            {
                klasa1.wczytajX(klasa1.zwrocX() - 40); //pozycja kamery o 40 w lewo
                klasa2.wczytajiloscPunktow(klasa2.zwrociloscPunktow() + 1); //zwiększamy o 1 punkt pomiarowy (wykonane zdjęcie)

            } while (klasa1.zwrocX() > 0);
            System.out.println(klasa2.zwrociloscPunktow());
        }
    }
    public static void main(String[] args) {
        dodajX();
    }

}
