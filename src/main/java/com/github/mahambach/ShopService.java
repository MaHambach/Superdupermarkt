package com.github.mahambach;

import com.github.mahambach.products.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ShopService {
    // Attribute
    private List<Product> shelvedList;
    private List<Product> toBeUnshelved;

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

    //#################################################################################################
    //#################################################################################################
    // Getter, Setter und andere generische Methoden

    public List<Product> getShelvedList() {
        return shelvedList;
    }

    public void setShelvedList(List<Product> shelvedList) {
        this.shelvedList = shelvedList;
    }

    public List<Product> getToBeUnshelved() {
        return toBeUnshelved;
    }

    public void setToBeUnshelved(List<Product> toBeUnshelved) {
        this.toBeUnshelved = toBeUnshelved;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShopService that = (ShopService) o;
        return Objects.equals(shelvedList, that.shelvedList) && Objects.equals(toBeUnshelved, that.toBeUnshelved);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shelvedList, toBeUnshelved);
    }

    @Override
    public String toString() {
        return "ShopService{" +
                "shelvedList=" + shelvedList +
                ", toBeUnshelved=" + toBeUnshelved +
                '}';
    }
}
