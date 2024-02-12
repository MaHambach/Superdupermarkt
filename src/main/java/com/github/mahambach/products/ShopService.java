package com.github.mahambach.products;

import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Data
public class ShopService {
    // Attribute
    private static ShopService instance;

    private final List<Product> shelvedList;
    private final List<Product> toBeUnshelved;


    //#################################################################################################
    //#################################################################################################
    //#################################################################################################
    // Konstruktoren
    private ShopService() {
        this.shelvedList = new ArrayList<>();
        this.toBeUnshelved = new ArrayList<>();
    }

    public static ShopService getInstance() {
        if (instance == null) {
            instance = new ShopService();
        }
        return instance;
    }

    //#################################################################################################
    //#################################################################################################
    //#################################################################################################
    // Methoden
//    ProductWine   (String name, int quality,                      BigDecimal basePrice)
//    ProductGeneric(String name, int quality, int expirationDate,  BigDecimal basePrice)
//    ProductCheese (String name, int quality, int expirationDate,  BigDecimal basePrice)

    public void addProductToShelf(ProductType type, String name, int quality, int expirationDate, BigDecimal basePrice){
        Product product;
        if(type == ProductType.WINE){
            product = new ProductWine(name, quality, basePrice);
        }
        else if(type == ProductType.CHEESE){
            product = new ProductCheese(name, quality, expirationDate, basePrice);
        }
        else{
            product = new ProductGeneric(name, quality, expirationDate, basePrice);
        }

        System.out.println("Versuche {" + product + "} ins Regal zu räumen.");
        if(product.canBeShelved()){
            shelvedList.add(product);
            System.out.println("Erfolg!");
        }
        else System.out.println("Error: Product can't be shelved. Reason: "+ product.thisCantBeShelvedBecause());
    }

    public List<Product> updateShelf(){
        for(Product product : shelvedList){
            product.updateForNewDay();
            if(!product.canBeShelved()) toBeUnshelved.add(product);
        }
        for(Product product : toBeUnshelved){
            shelvedList.remove(product);
        }
        return shelvedList;
    }

}
