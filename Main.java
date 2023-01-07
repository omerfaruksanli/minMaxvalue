import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int deger, i, max = 0, min=0,sayi;
        System.out.print("Kaç tane değer gireceksiniz : ");
        deger = input.nextInt();

        for (i = 1; i<=deger; i++){
            System.out.print(i + ".Sayı Giriniz :" );
            sayi = input.nextInt();
            while (i==1){
                max=sayi;
                min=sayi;
                break;
            }
            if (sayi > max){
                max=sayi;
            }
            else if(sayi < min){
                min = sayi;
            }
        }
        System.out.println(" En küçük sayı : "+ min);
        System.out.println(" En büyük sayı : "+ max);






    }
}