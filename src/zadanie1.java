import java.util.Scanner;

public class zadanie1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj tekst");
        String tekst = scan.nextLine();
        int dlugoscTekstu =tekst.length();
        int l=0;
        for(int i=0; i<dlugoscTekstu; i++){
            if(tekst.charAt(i)==tekst.charAt(dlugoscTekstu - 1)){
                l++;
            }

        }
        System.out.println("Ilosc ostatniej litery: "+l);
    }

}
