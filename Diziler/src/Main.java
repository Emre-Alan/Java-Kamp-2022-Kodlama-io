public class Main {

    public static void main(String[] args) {
        double[] myList={1.7,2.9,4.6,7.6,9.9};
        double total=0;
        double max=myList[0];

        for (double number:myList){
            if (max<number){
                max=number;
            }
            total=total+number;
            System.out.println(number);
        }
        System.out.println("En Büyük Sayı = "+max);
        System.out.println("Total = "+total);
    }
}
