package soru_cozumleri;
import java.util.Scanner;
public class Soru8 {
    public static void main(String[] args) {
        /*Soru 8:Aşağıda tanımı verilen f(x,y) fonksiyonunu klavyeden girilen x ve y değerleri için hesaplayınız.
        x>0, y<0 ise f(x,y) = 4x+2y+4
        x>0, y=0 ise f(x,y) = 2x-y+3
        x<0, y>0 ise f(x,y) = 3x+4y+3
         */
        Scanner giris = new Scanner(System.in);
        System.out.print("x : ");
        int x = giris.nextInt();
        System.out.print("y : ");
        int y = giris.nextInt();
        int sonuc;

        if (x>0 && y<0){
            sonuc = (4*x + 2*y + 4);
            System.out.println("f(x,y) : " + sonuc);
        }else if (x>0 && y==0){
            sonuc = (2*x - y + 3);
            System.out.println("f(x,y) : " + sonuc);
        }else if (x<0 && y>0){
            sonuc = (3*x + 4*y + 3);
            System.out.println("f(x,y) : " + sonuc);
        }else{
            System.out.println("fonksiyon bu değerleri içermemektedir");
        }
    }
}
