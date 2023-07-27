import java.util.Scanner;

public class Main16 {
    public static void main(String[] args) {
        // Değişkenleri oluştur
        int mat, fizik, kimya, turkce;

        //Scanner sınıfını oluştur
        Scanner inp = new Scanner(System.in);


        //Kullanıcıdan değerleri al

        System.out.print("Matematik ders notunu giriniz: ");
        mat = inp.nextInt();

        System.out.print("Türkçe ders notunu giriniz: ");
        turkce = inp.nextInt();

        System.out.print("Kimya ders notunu giriniz: ");
        kimya = inp.nextInt();

        System.out.print("Fizik ders notunu giriniz: ");
        fizik = inp.nextInt();

        int toplam = (mat + turkce + kimya + fizik);
        double ortalama = toplam / 4.0;

        System.out.println("Ortalamanız: " + ortalama);



        boolean aaaa = ortalama>=50;

        String gecmeDurumu = aaaa ? "Sınıfı Geçtiniz" : "Sınıfı Geçemediniz";

        System.out.println(gecmeDurumu);


    }
}




