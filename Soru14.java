package soru_cozumleri;
import java.util.Scanner;
public class Soru14 {
    public static void main(String[] args) {
        //girilen bir metnin palindrome olup olmadığnı yazan program.(tersten okunuşu da aynı olan kelimeler bkz kaçak)
        Scanner tara = new Scanner(System.in);
        System.out.print("Kelimeyi giriniz : ");
        String kelime = tara.nextLine();

        int altSinir = 0;
        int ustSinir = kelime.length() - 1;
        boolean palindromeMu = true;

        while(altSinir < ustSinir){
            if(kelime.charAt(altSinir) != kelime.charAt(ustSinir)){
                palindromeMu = false;
                break;
            }

            altSinir++;
            ustSinir--;

        }
        if (palindromeMu){
            System.out.println(kelime + " kelimesi palindrome kelimedir");
        }else{
            System.out.println(kelime + " kelimesi palindrome değildir");
        }






    }
}
