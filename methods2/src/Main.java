public class Main {

    public static void main(String[] args) {
        String mesaj =sehir();
        System.out.println(mesaj);
        int toplam1=topla(15,20);
        System.out.println(toplam1);

        int toplam2=topla2(1,5,9,10,25,50);
        System.out.println(toplam2);

    }
    public static void ekle (){
        System.out.println("veri eklendi");
    }
    public static void sil(){
        System.out.println("veri silindi");
    }
    public static void guncelle(){
        System.out.println("veri güncellendi");
    }
    public static int topla(int sayi1,int sayi2){
        return sayi1+sayi2;
    }
    //Variable Arguments
    public static int topla2(int... sayilar){
        int toplam=0;
        for (int sayi:sayilar){
            toplam +=sayi;
        }
        return toplam;
    }

    public static String sehir (){
        return "Erzurum";
    }
}
