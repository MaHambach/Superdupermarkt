package com.github.mahambach.products;

import lombok.EqualsAndHashCode;

import java.math.BigDecimal;


class ProductCheese extends Product {
    // Attribute
    private static final int MIN_QUALITY = 30;
    private static final int QUALITY_LOSS_PER_DAY = 1;
    private static final int MIN_EXPIRATION_DAYS = 50;
    private static final int MAX_EXPIRATION_DAYS = 100;


    //#################################################################################################
    //#################################################################################################
    //#################################################################################################
    // Konstruktoren


    public ProductCheese(String name, int quality, int expirationDate, BigDecimal basePrice) {
        super(name, quality, expirationDate, basePrice);
        this.setType(ProductType.CHEESE);
    }

    //#################################################################################################
    //#################################################################################################
    //#################################################################################################
    // Methoden
    @Override
    public void updateForNewDay() {
        updateQuality();
        updateDailyPrice();
    }

    @Override
    public void updateQuality() {
        setQuality(getQuality()-QUALITY_LOSS_PER_DAY);
    }

    @Override
    public void updateDailyPrice() {
        super.updateDailyPrice();
    }

    // Methode zur Überprüfung, ob Käse im Regal eingeräumt werden kann
    @Override
    public boolean canBeShelved() {
        return getQuality() >= MIN_QUALITY;
    }

    @Override
    public String thisCantBeShelvedBecause() {
        return String.format("Qualität ist %d, muss aber mindestens %d sein.", getQuality(), MIN_QUALITY);
    }
}
