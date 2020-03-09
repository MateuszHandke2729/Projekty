import java.util.Scanner;

public class zadanie3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj tekst");
        String tekst = scan.nextLine();
        int dlugoscTekstu =tekst.length();
        int j=dlugoscTekstu;
        int kontrolna=0;
        for(int i=0; i<dlugoscTekstu; i++){
            if(tekst.charAt(i)!=tekst.charAt(j - 1)){
                System.out.println("Nie jest palindromem");
                kontrolna=1;
                break;
            }
            j--;
        }
        if(kontrolna==0){
            System.out.println("Tekst jest palindromem");
        }
    }
}
