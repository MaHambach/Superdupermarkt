package com.github.mahambach;

import com.github.mahambach.products.*;

import java.math.BigDecimal;


public class Main {
    public static void main(String[] args) {

        ShopService shopService = ShopService.getInstance();

        shopService.addProductToShelf(ProductType.GENERIC, "Cereal", 85, 30, new BigDecimal("3.50"));
        shopService.addProductToShelf(ProductType.GENERIC, "Milk", 80, 5, new BigDecimal("2.50"));
        shopService.addProductToShelf(ProductType.GENERIC, "Bread", 70, 10, new BigDecimal("1.50"));
        shopService.addProductToShelf(ProductType.GENERIC, "Apples", 90, 7, new BigDecimal("3.00"));
        shopService.addProductToShelf(ProductType.GENERIC, "Eggs", 60, 15, new BigDecimal("2.00"));
        shopService.addProductToShelf(ProductType.GENERIC, "Chicken", 70, 3, new BigDecimal("5.00"));
        shopService.addProductToShelf(ProductType.GENERIC, "Pasta", 85, 20, new BigDecimal("1.00"));
        shopService.addProductToShelf(ProductType.GENERIC, "Bananas", 95, 5, new BigDecimal("1.50"));
        shopService.addProductToShelf(ProductType.GENERIC, "Potatoes", 75, 12, new BigDecimal("2.00"));
        shopService.addProductToShelf(ProductType.GENERIC, "Tomatoes", 80, 8, new BigDecimal("2.50"));

        shopService.addProductToShelf(ProductType.CHEESE, "Havarti", 5, 55, new BigDecimal("14.00"));
        shopService.addProductToShelf(ProductType.CHEESE, "Cheddar", 40, 80, new BigDecimal("5.00"));
        shopService.addProductToShelf(ProductType.CHEESE, "Gouda", 35, 90, new BigDecimal("6.00"));
        shopService.addProductToShelf(ProductType.CHEESE, "Brie", 45, 70, new BigDecimal("7.00"));
        shopService.addProductToShelf(ProductType.CHEESE, "Swiss", 50, 60, new BigDecimal("8.00"));
        shopService.addProductToShelf(ProductType.CHEESE, "Blue", 25, 100, new BigDecimal("9.00"));
        shopService.addProductToShelf(ProductType.CHEESE, "Mozzarella", 30, 95, new BigDecimal("10.00"));
        shopService.addProductToShelf(ProductType.CHEESE, "Feta", 20, 85, new BigDecimal("11.00"));
        shopService.addProductToShelf(ProductType.CHEESE, "Parmesan", 15, 75, new BigDecimal("12.00"));
        shopService.addProductToShelf(ProductType.CHEESE, "Provolone", 10, 65, new BigDecimal("13.00"));

        shopService.addProductToShelf(ProductType.WINE, "Riesling", 10, 0, new BigDecimal("60.00"));
        shopService.addProductToShelf(ProductType.WINE, "Red Wine", 20, 0, new BigDecimal("15.00"));
        shopService.addProductToShelf(ProductType.WINE, "White Wine", 30, 0, new BigDecimal("20.00"));
        shopService.addProductToShelf(ProductType.WINE, "Rosé Wine", 40, 0, new BigDecimal("25.00"));
        shopService.addProductToShelf(ProductType.WINE, "Sparkling Wine", 10, 0, new BigDecimal("30.00"));
        shopService.addProductToShelf(ProductType.WINE, "Merlot", 15, 0, new BigDecimal("35.00"));
        shopService.addProductToShelf(ProductType.WINE, "Chardonnay", 25, 0, new BigDecimal("40.00"));
        shopService.addProductToShelf(ProductType.WINE, "Pinot Noir", 35, 0, new BigDecimal("45.00"));
        shopService.addProductToShelf(ProductType.WINE, "Sauvignon Blanc", 45, 0, new BigDecimal("50.00"));
        shopService.addProductToShelf(ProductType.WINE, "Cabernet Sauvignon", 5, 0, new BigDecimal("55.00"));

        System.out.println();
        for(Object product : shopService.getShelvedList()){
            System.out.println(product);
        }
    }

}