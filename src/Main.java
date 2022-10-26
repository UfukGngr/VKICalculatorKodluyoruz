import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        Double boy,kg,vki;

        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen boyunuzu metre cinsinde giriniz:");
        boy=scan.nextDouble();

        System.out.print("Lütfen kilonuz giriniz:");
        kg=scan.nextDouble();

        vki=kg/(boy*boy);

        System.out.println("Vücut Kitle İndeksiniz : "+vki);
    }
}