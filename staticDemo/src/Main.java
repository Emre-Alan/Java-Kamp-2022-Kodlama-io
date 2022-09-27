public class Main {

    public static void main(String[] args) {
        Product product=new Product();
        product.name="klavye";
        product.price=100;

        ProductManager productManager=new ProductManager();
        productManager.add(product);

        DatabaseHelper.Crud.create();
    }
}
