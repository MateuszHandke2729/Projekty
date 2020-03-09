import java.util.Scanner;

public class zadanie4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj tekst");
        String tekst = scan.nextLine();
        int dlugoscTekstu =tekst.length();
        int suma=0;
        for(int i=0; i<dlugoscTekstu; i++){
            if(Character.getNumericValue(tekst.charAt(i))>=0 && Character.getNumericValue(tekst.charAt(i))<10){
                int cyfra=Character.getNumericValue(tekst.charAt(i));
                suma=suma+cyfra;
            }
        }
        System.out.println("Suma cyfr to: "+suma);
    }
}
