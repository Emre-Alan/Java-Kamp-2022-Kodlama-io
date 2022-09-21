public class Main {

    public static void main(String[] args) {
        int sayi=6;
        int mSayi=0;

        for (int i=1;i<sayi;i++){
            if (sayi % i==0){
                mSayi = mSayi + i;
            }
        }
        if (mSayi==sayi){
            System.out.println("mükemmel sayı");
        }else{
            System.out.println("mükemmel sayı değil.");
        }
    }
}
