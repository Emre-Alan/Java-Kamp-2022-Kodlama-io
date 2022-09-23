public class Main {

    public static void main(String[] args) {
        Product product=new Product(1,"Laptop","Lenova Laptop",10000,5,"Gri");

        ProductManager productManager=new ProductManager();
        productManager.add(product);

        System.out.println(product.getKod());
    }
}
