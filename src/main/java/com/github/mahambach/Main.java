package com.github.mahambach;

import com.github.mahambach.products.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ShopService shopService = new ShopService();
        List<Product> productList = oldSetup();

        for(Product product : productList) shopService.addProductToShelf(product);
        System.out.println();
        System.out.println();
        for(Product product : shopService.getShelvedList()) System.out.println(product);
    }

    public static List<Product> oldSetup(){
        List<Product> productList = new ArrayList<>();

        Product product0 = new Product("Cereal", ProductType.GENERIC, 85, 30, new BigDecimal("3.50"));
        Product product1 = new Product("Milk", ProductType.GENERIC, 80, 5, new BigDecimal("2.50"));
        Product product2 = new Product("Bread", ProductType.GENERIC, 70, 10, new BigDecimal("1.50"));
        Product product3 = new Product("Apples", ProductType.GENERIC, 90, 7, new BigDecimal("3.00"));
        Product product4 = new Product("Eggs", ProductType.GENERIC, 60, 15, new BigDecimal("2.00"));
        Product product5 = new Product("Chicken", ProductType.GENERIC, 70, 3, new BigDecimal("5.00"));
        Product product6 = new Product("Pasta", ProductType.GENERIC, 85, 20, new BigDecimal("1.00"));
        Product product7 = new Product("Bananas", ProductType.GENERIC, 95, 5, new BigDecimal("1.50"));
        Product product8 = new Product("Potatoes", ProductType.GENERIC, 75, 12, new BigDecimal("2.00"));
        Product product9 = new Product("Tomatoes", ProductType.GENERIC, 80, 8, new BigDecimal("2.50"));

        productList.add(product0);
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);
        productList.add(product6);
        productList.add(product7);
        productList.add(product8);
        productList.add(product9);

        ProductCheese cheese0 = new ProductCheese("Havarti", ProductType.CHEESE, 5, 55, new BigDecimal("14.00"));
        ProductCheese cheese1 = new ProductCheese("Cheddar", ProductType.CHEESE, 40, 80, new BigDecimal("5.00"));
        ProductCheese cheese2 = new ProductCheese("Gouda", ProductType.CHEESE, 35, 90, new BigDecimal("6.00"));
        ProductCheese cheese3 = new ProductCheese("Brie", ProductType.CHEESE, 45, 70, new BigDecimal("7.00"));
        ProductCheese cheese4 = new ProductCheese("Swiss", ProductType.CHEESE, 50, 60, new BigDecimal("8.00"));
        ProductCheese cheese5 = new ProductCheese("Blue", ProductType.CHEESE, 25, 100, new BigDecimal("9.00"));
        ProductCheese cheese6 = new ProductCheese("Mozzarella", ProductType.CHEESE, 30, 95, new BigDecimal("10.00"));
        ProductCheese cheese7 = new ProductCheese("Feta", ProductType.CHEESE, 20, 85, new BigDecimal("11.00"));
        ProductCheese cheese8 = new ProductCheese("Parmesan", ProductType.CHEESE, 15, 75, new BigDecimal("12.00"));
        ProductCheese cheese9 = new ProductCheese("Provolone", ProductType.CHEESE, 10, 65, new BigDecimal("13.00"));

        productList.add(cheese0);
        productList.add(cheese1);
        productList.add(cheese2);
        productList.add(cheese3);
        productList.add(cheese4);
        productList.add(cheese5);
        productList.add(cheese6);
        productList.add(cheese7);
        productList.add(cheese8);
        productList.add(cheese9);

        ProductWine wine0 = new ProductWine("Riesling", ProductType.WINE, 10, 135, new BigDecimal("60.00"));
        ProductWine wine1 = new ProductWine("Red Wine", ProductType.WINE, 20, 100, new BigDecimal("15.00"));
        ProductWine wine2 = new ProductWine("White Wine", ProductType.WINE, 30, 95, new BigDecimal("20.00"));
        ProductWine wine3 = new ProductWine("Rosé Wine", ProductType.WINE, 40, 90, new BigDecimal("25.00"));
        ProductWine wine4 = new ProductWine("Sparkling Wine", ProductType.WINE, 10, 105, new BigDecimal("30.00"));
        ProductWine wine5 = new ProductWine("Merlot", ProductType.WINE, 15, 110, new BigDecimal("35.00"));
        ProductWine wine6 = new ProductWine("Chardonnay", ProductType.WINE, 25, 115, new BigDecimal("40.00"));
        ProductWine wine7 = new ProductWine("Pinot Noir", ProductType.WINE, 35, 120, new BigDecimal("45.00"));
        ProductWine wine8 = new ProductWine("Sauvignon Blanc", ProductType.WINE, 45, 125, new BigDecimal("50.00"));
        ProductWine wine9 = new ProductWine("Cabernet Sauvignon", ProductType.WINE, 5, 130, new BigDecimal("55.00"));

        productList.add(wine0);
        productList.add(wine1);
        productList.add(wine2);
        productList.add(wine3);
        productList.add(wine4);
        productList.add(wine5);
        productList.add(wine6);
        productList.add(wine7);
        productList.add(wine8);
        productList.add(wine9);

        return productList;

    }
}