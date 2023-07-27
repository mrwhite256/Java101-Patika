import java.util.Scanner;

public class Kdv {
    public static void main(String[] args) {
        int fiyat;

        Scanner dgr = new Scanner(System.in);

        System.out.print("Kdv Hesaplaması için ürün fiyatı giriniz: " );
        fiyat = dgr.nextInt();

        double kdvorani = (fiyat<=1000) ?  0.18 : 0.08;
        double kdvdahilfyt = fiyat*(1+kdvorani), kdvtutarı = fiyat*kdvorani;


        System.out.println("Kdv Hariç Fiyat: "+ fiyat);
        System.out.println("Kdv Tutarınız: "+ kdvtutarı);
        System.out.println("Kdv Dahil Fiyat: "+ kdvdahilfyt);

    }
}
