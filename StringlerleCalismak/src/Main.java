public class Main {

    public static void main(String[] args) {
        String mesaj="Bugün hava Erzurum";
        System.out.println(mesaj);
        System.out.println("Eleman Sayısı: " +mesaj.length());
        System.out.println("12. Eleman: "+mesaj.charAt(11));
        System.out.println(mesaj.concat(" amman amman")); //stringleri birleştirme
        System.out.println(mesaj.startsWith("B")); //mesaj B ile başlıyor mu?
        System.out.println(mesaj.endsWith("u")); //mesaj u ile bitiyor mu?

        //*******************************************************

        //karakterleri getir
        char[] karakterler=new char[10];
        mesaj.getChars(11,18,karakterler,0);
        System.out.println(karakterler);

        //*******************************************************

        System.out.println(mesaj.toUpperCase());//Tüm harfleri büyük yapar.
        System.out.println(mesaj.toLowerCase()); //Tüm harfleri küçük yapar.

        //*******************************************************

        //Metin içerisinden parça almak
        System.out.println(mesaj.substring(6));// 6. indexten sona kadar olan kısım
        System.out.println(mesaj.substring(6,10)); //6. ve 10. indexler arası

        //*******************************************************

        System.out.println(mesaj.indexOf("h")); //kaçıncı indexte olduğuna bakar (Taramaya baştan başlar).
        System.out.println(mesaj.lastIndexOf("E")); //kaçıncı indexte olduğuna bakar (Taramaya sondan başlar).

        //Mesaj içindeki karakterleri değiştirme
        System.out.println(mesaj.replace(" ","-"));

        //kelimeri ayırma(boşluk gördükçe ayırıp dizi içine atacak
        for (String kelime:mesaj.split(" ")){
            System.out.println(kelime);
        }

        //Mesajın başındaki ve sonundaki boşlukları atma
        String mesaj2="          Bugün hava Erzurum         ";
        System.out.println(mesaj2.trim());

        //Tüm boşlukları siler
        mesaj2=mesaj2.replaceAll(" ","");
        System.out.println(mesaj2);

        //**************************************
        String yeniMesaj="        Bugün   hava    Erzurum      ";
        System.out.println(yeniMesaj.replaceAll("\\s+"," ").trim());

    }
}
