package com.github.mahambach;

import com.github.mahambach.products.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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
    public void addProductToShelf(Product product){
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
