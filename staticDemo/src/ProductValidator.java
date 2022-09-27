public class ProductValidator {
    static {//static method çağrıldığında çalışır.
        System.out.println("static yapıcı blok çalıştı");
    }

    public ProductValidator(){ //new lenince çalışır.
        System.out.println("yapıcı blok çalıştı");
    }

    public static boolean isValid(Product product){
        if (product.price >0 && !product.name.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
    public void method(){

    }
}
