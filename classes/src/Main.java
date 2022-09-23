public class Main {

    public static void main(String[] args) {
        //reference type
        CustomerManager customerManager=new CustomerManager();
        CustomerManager customerManager2=new CustomerManager();

        customerManager=customerManager2;

        customerManager.add();
        customerManager.remove();
        customerManager.update();

        //örnek
        int[] sayilar1=new int[]{1,5,7};
        int[] sayilar2=new int[]{6,8,9};

        sayilar2=sayilar1;
        sayilar1[0]=10;
        System.out.println(sayilar2[0]);
    }
}
