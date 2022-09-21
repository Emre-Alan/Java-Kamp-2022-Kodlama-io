public class Main {

    public static void main(String[] args) {
        //For
        for (int i=0; i<10;i++){
            System.out.println(i);
        }
        System.out.println("For döngüsü bitti");

        //while
        int a=0;
        while (a<10){
            System.out.println(a);
            a+=2;
        }
        System.out.println("while döngüsü bitti");

        //do-while
        int j=1;
        do {
            System.out.println(j);
            j+=2;
        }while (j<10);
        System.out.println("do-while döngüsü bitti");

    }
}
