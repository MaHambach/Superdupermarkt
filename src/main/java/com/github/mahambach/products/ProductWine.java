package com.github.mahambach.products;

import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.util.Objects;

class ProductWine extends Product {
    // Attribute
    private static final int MIN_QUALITY = 0;
    private static final int MAX_QUALITY = 50;
    private static final int QUALITY_GAIN = 1;
    private int timeOnShelf;

    //#################################################################################################
    //#################################################################################################
    //#################################################################################################
    // Konstruktoren
    public ProductWine(String name, int quality, BigDecimal basePrice) {
        super(name, quality, 999, basePrice);
        this.setType(ProductType.WINE);
        this.timeOnShelf=0;
    }

    //#################################################################################################
    //#################################################################################################
    //#################################################################################################
    // Methoden
    @Override
    public void updateQuality() {
        this.timeOnShelf++;
        if (getQuality() < MAX_QUALITY && this.timeOnShelf%10 == 0) {
            int newQuality = getQuality() + QUALITY_GAIN;
            if (newQuality > MAX_QUALITY) newQuality = MAX_QUALITY;
            super.setQuality(newQuality);
        }
    }

    @Override
    public void updateDailyPrice() {
        // Wein verändern seinen Pres nicht, nachdem er ins Regal eingeräumt wurde.
    }

    @Override
    public boolean canBeShelved() {
        return getQuality() >= MIN_QUALITY;
    }

    @Override
    public String thisCantBeShelvedBecause() {
        return String.format("Qualität ist %d, muss aber mindestens %d sein.", getQuality(), MIN_QUALITY);
    }

}
