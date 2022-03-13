import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

     Scanner giris = new Scanner(System.in);



        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz : ");
        double boy = giris.nextDouble();
        System.out.print("Kilonuzu kilonuzu giriniz : ");
        double kilo = giris.nextDouble();

        double kitle = kilo / (boy * boy);

        System.out.println("Vücut Kitle İndeksiniz : "+ kitle);

        }
}