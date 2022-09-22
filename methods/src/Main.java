public class Main {

    public static void main(String[] args) {
        sayiBulma();
    }
    public static void sayiBulma(){
        int[] sayilar=new int[]{1,5,25,30,45,90};
        int arananSayi=0;
        boolean varMi=false;

        for (int sayi:sayilar){
            if (sayi==arananSayi){
                varMi=true;
                break;
            }
        }
        if (varMi){
            mesajVer("Sayı mevcut: " + arananSayi);
        }else{
            mesajVer("Sayı mevcut değil: " + arananSayi);
        }
    }
    public static void mesajVer(String mesaj){
        System.out.println(mesaj);
    }
}
