import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AirplaneService {

    void displayMenu() {
        Scanner inp = new Scanner(System.in);
        int secim;

        do {
            System.out.println("Ucak Rezervasyon Sistemine Hosgeldiniz");
            System.out.println("""
                    1. Koltuk Durumunu Göster
                    2. Koltuk Rezerve Et
                    3. Rezervasyonları Göster
                    4.Rezervasyon İptal Et
                    0. Çıkış
                    Bir seçenek girin:
                     """);

            secim = inp.nextInt();

            switch (secim) {
                case 1:
                    System.out.println("Koltuk durumu gösterme işlemi ");
                    break;
                case 2:
                    System.out.println("Koltuk rezervasyonu yapma işlemi ");
                    break;
                case 3:
                    System.out.println("Rezervasyonlari goster ");
                    break;
                case 4:
                    System.out.println("Rezervasyon iptal et ");
                    break;
                case 0:
                    System.out.println("Programdan çıkıs ");
                    break;
                default:
                    System.out.println("Geçersiz seçenek. Lütfen tekrar deneyiniz.");
            }
        } while (secim != 4);

    }


   /* Valiz hakki: Ekonomi icin 15 kiloya kadar ucretsiz business icin 30 kilo. Bunu asarsa ek ucret olacak.
    Kilo basi ekonomi icin 20 business icin 10
    Baslangic noktasi Istanbul. Bununla birlikte 5 ulke secilir.
    Istanbuldan gidilecek ulkeye gore fiyat secenegi olur.
    Business fiyati 50% daha pahali.
            3 yas ve asagisi ucretsiz.
            3 ile 7 arasi 50% indirimli.
    Enum kullanilacak.
    OOP kullanilacak.*/

    static double calculatePrice(int age, boolean isBusinessClass) {


        if (age < 0 || age > 101) {

            throw new IllegalArgumentException("Invalid age for the plane..");
        }

        // double adultPrice;
        double economyClass = 100;
        double businessClass = ((economyClass * 50) / 100) + economyClass;
        double adultPrice = isBusinessClass ? businessClass : economyClass;


//        if (isBusinessClass) {
//            adultPrice = businessClass;
//        } else {
//            adultPrice = economyClass;
//        }

        if (age > 0 && age <= 3) {
            return 0;
        } else if (age <= 7) {
            return (adultPrice * 50) / 100;
        } else {
            return adultPrice;
        }

    }

    public static void main(String[] args) {
        System.out.println(calculatePrice(25, true));

    }


}
