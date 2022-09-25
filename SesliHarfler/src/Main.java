public class Main {

    public static void main(String[] args) {
        char harf='i';

        char harf2=Character.toLowerCase(harf);
        switch (harf2){
            case 'a':
            case 'ı':
            case 'o':
            case 'u':
                System.out.println("Kalın Sesli Harf");
                break;
            case 'e':
            case 'i':
            case 'ö':
            case 'ü':
                System.out.println("İnce Sesli Harf");
                break;
            default:
                System.out.println("Geçersiz Harf Girdiniz");
                break;
        }
    }
}
