public class Main {

    public static void main(String[] args) {
	    int sayi=0;

        boolean asal=true;

        if (sayi==1){
            System.out.println("Sayı Asal Değil");
            return;
        }
        if (sayi<1){
            System.out.println("Geçersiz Sayı");
            return;
        }
        for (int i=2; i<sayi; i++){
            if (sayi %i==0){
                asal=false;
            }
        }
        if (asal){
            System.out.println("Sayı Asal");
        }else{
            System.out.println("Sayı Asal Değil");
        }

    }
}
