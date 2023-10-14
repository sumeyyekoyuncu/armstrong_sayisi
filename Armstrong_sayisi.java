
import java.util.Scanner;


public class Armstrong_sayisi {

    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
        System.out.println("sayiyi giriniz");
       int sayi=scanner.nextInt();
        System.out.println("girdiğiniz sayi kaç basamakli?");
        int basamak=scanner.nextInt();
        int gecici_sayi=sayi;
        int toplam=0;
        do{
            int basamak_degeri=gecici_sayi%10;
            gecici_sayi=gecici_sayi/10;
            toplam+=Math.pow(basamak_degeri,basamak);
                   
            
        }while(gecici_sayi>0);
        if(toplam==sayi){
            System.out.println("girdiğiniz sayi armstrong sayisidir...");
                   
        }
        else
        {
            System.out.println("sayiniz armstrong sayisi değildir...");
        }
             
    }
}
