package com.github.mahambach.products;

import lombok.Data;

import java.math.BigDecimal;

class ProductGeneric extends Product {
    // Attribute
    //#################################################################################################
    //#################################################################################################
    //#################################################################################################
    // Konstruktoren

    public ProductGeneric(String name, int quality, int expirationDate, BigDecimal basePrice) {
        super(name, quality, expirationDate, basePrice);
        this.setType(ProductType.GENERIC);
    }

    //#################################################################################################
    //#################################################################################################
    //#################################################################################################
    // Methoden
    public void updateQuality(){
        // Die Qualität eines generischen Produkts verändert sich nicht.
    }

    @Override
    public void updateDailyPrice() {
        super.updateDailyPrice();
    }

    @Override
    public boolean canBeShelved() {
        return true;
    }

    public String thisCantBeShelvedBecause() {
        return "Irgendwas ist furchtbar schief gelaufen. Generische Produkte können immer eingeräumt werden.";
    }
}


