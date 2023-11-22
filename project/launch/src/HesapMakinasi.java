import java.util.Scanner;

public class HesapMakinasi {
    public static void main(String[] args) {
        int n1, n2, select;
        Scanner input = new Scanner(System.in);
        System.out.println("********---------HOŞGELDİNİZ---------***********");
        System.out.print("ilk sayıyı giriniz : ");
        n1 = input.nextInt();
        System.out.print("ikinci sayıyı giriniz : ");
        n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme ");
        System.out.print("seçiminiz nedir  : ");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.println("*****CEVABINIZ*****");
                System.out.println("Toplam :" + (n1+n2));

                break;
            case 2:
                System.out.println("Çıkan :"+ ((n1)-(n2)));
                break;
            case 3:
                System.out.println("Çarpılan :" + (n1*n2));
                break;
            case 4:
                System.out.println("Bölünen :" + (n1 / n2));
                break;
            default:
                System.out.println("-----------Hatalı Giriş Yaptınız----------");


        }


    }
}
