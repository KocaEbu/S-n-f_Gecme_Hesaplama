import java.util.Scanner;
public class Sinif_Gecme_Hesaplama {

    public static void main(String[] args) {

        double matematik,fizik,turkce,kimya,muzik;
        double average;
        Scanner input= new Scanner(System.in);

        System.out.println("Matematik notunuzu giriniz: ");
        matematik= input.nextDouble();

        System.out.println("Fizik notunuzu giriniz: ");
        fizik= input.nextDouble();

        System.out.println("Turkce notunuzu giriniz: ");
        turkce= input.nextDouble();

        System.out.println("Kimya notunuzu giriniz: ");
        kimya= input.nextDouble();

        System.out.println("Muzik notunuzu giriniz: ");
        muzik= input.nextDouble();

        if(matematik>=0 && fizik>=0 && turkce>=0 && kimya>=0 && muzik>=0 && matematik<=100 && fizik<=100 && turkce<=100 && kimya<=100 && muzik<=100){

            average = (matematik+fizik+turkce+kimya+muzik)/5;

            System.out.println("Ortalamaniz : "+average);

                if(average<55){

                    System.out.println("Sinifta kaldiniz.");

                }else{
                    System.out.println("Sinifi gectiniz.");
                }
        }
        else{
            System.out.println("Notlar sifir ile yuz arasinda olmalidir!!! ");
        }

    }
}
