package soru_cozumleri;
import java.util.Scanner;
public class Soru2 {
    public static void main(String[] args) {

        //Klavyeden kenarları girilen bir üçgenin çeşidini veren uygulamayı yazınız.
        Scanner tara = new Scanner(System.in);
        System.out.print("birinci kenarı giriniz : ");
        int kenar1 = tara.nextInt();
        System.out.print("ikinci kenarı giriniz : ");
        int kenar2 = tara.nextInt();
        System.out.print("üçüncü kenarı giriniz : ");
        int kenar3 = tara.nextInt();

        if ((kenar1 == kenar2) && (kenar1 == kenar3)) {
            System.out.println("eşkenar üçgen");
        } else if ((kenar1 != kenar2) && (kenar1 != kenar3) && (kenar2 != kenar3)){
            System.out.println("çeşitkenar üçgen");
        } else{
            System.out.println("ikizkenar üçgen");
        }
    }
}
