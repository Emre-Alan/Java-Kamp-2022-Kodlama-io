public class Main {

    public static void main(String[] args) {
        int sayi1=200;
        int sayi2=101;
        int sayi3=100;

        int enBuyukSayi=sayi1;

        if (sayi3<sayi1){
            enBuyukSayi=sayi1;
        }else if (sayi3<sayi2){
            enBuyukSayi=sayi2;
        }
        System.out.println("En Büyük Sayi = "+enBuyukSayi);
    }
}
