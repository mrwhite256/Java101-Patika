import java.util.Scanner;
public class Alan {
    public static void main(String[] args) {
        double a, b, c;

        Scanner uzunluk = new Scanner(System.in);


        System.out.print("A Kenarının Uzunluğunu Giriniz: ");
        a = uzunluk.nextDouble();

        System.out.print("B Kenarının Uzunluğunu Giriniz: ");
        b = uzunluk.nextDouble();

        System.out.print("C Kenarının Uzunluğunu Giriniz: ");
        c = uzunluk.nextDouble();


        double u = (a+b+c)/2;

        double carpimsal= (u*(u-a)*(u-b)*(u-c));
        double alan= Math.sqrt(carpimsal);

        System.out.println("Üçgenin alanı : " +  alan);

    }



}
