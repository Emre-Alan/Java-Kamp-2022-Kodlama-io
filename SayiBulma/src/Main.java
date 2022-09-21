public class Main {

    public static void main(String[] args) {
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
            System.out.println("Sayı mevcut");
        }else{
            System.out.println("Sayı mevcut değil");
        }
    }
}
