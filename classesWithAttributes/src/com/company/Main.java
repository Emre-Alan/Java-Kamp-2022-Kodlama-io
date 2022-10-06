package com.company;

public class Main {

    public static void main(String[] args) {

        Product product=new Product(0,"Laptop","Lenova Laptop",10000,10);
        /*
        product.setId(0);
        product.setName("Laptop");
        product.setDescription("Lenova Laptop");
        product.setPrice(10000);
        product.setStockAmount(10);

         */

        System.out.println(product.getKod());

        ProductManager productManager=new ProductManager();
        productManager.add(product);
    }
}
