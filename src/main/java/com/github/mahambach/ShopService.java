package com.github.mahambach;

import com.github.mahambach.products.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Data
public class ShopService {
    // Attribute
    private final List<Product> shelvedList;
    private final List<Product> toBeUnshelved;

    //#################################################################################################
    //#################################################################################################
    //#################################################################################################
    // Konstruktoren
    public ShopService() {
        this.shelvedList = new ArrayList<>();
        this.toBeUnshelved = new ArrayList<>();
    }
    public ShopService(List<Product> shelvedList, List<Product> toBeUnshelved) {
        this.shelvedList = shelvedList;
        this.toBeUnshelved = toBeUnshelved;
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


}
