package com.github.mahambach.products;

import java.math.BigDecimal;

public class ProductCheese extends Product implements DailyUpdateable{
    // Attribute
    private static final int MIN_QUALITY = 30;
    private static final int QUALITY_LOSS_PER_DAY = 1;
    private static final int MIN_EXPIRATION_DAYS = 50;
    private static final int MAX_EXPIRATION_DAYS = 100;


    //#################################################################################################
    //#################################################################################################
    //#################################################################################################
    // Konstruktoren


    public ProductCheese(String name, ProductType type, int quality, int expirationDate, BigDecimal basePrice) {
        super(name, type, quality, expirationDate, basePrice);
    }

    //#################################################################################################
    //#################################################################################################
    //#################################################################################################
    // Methoden
    // Methode zur Überprüfung, ob Käse im Regal eingeräumt werden kann
    @Override
    public boolean canBeShelved() {
        return getQuality() >= MIN_QUALITY;
    }

    @Override
    public void updateForNewDay() {
        updateQuality();
        updateDailyPrice();
    }

    @Override
    public void updateQuality() {
        setQuality(getQuality()-QUALITY_LOSS_PER_DAY);
    }
}
