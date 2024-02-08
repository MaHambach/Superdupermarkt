package com.github.mahambach.products;

import java.math.BigDecimal;

public class ProductWine extends Product implements DailyUpdateable{
    // Attribute
    private static final int MIN_QUALITY = 0;
    private static final int MAX_QUALITY = 50;
    private static final int QUALITY_GAIN = 1;
    private int timeOnShelf;

    //#################################################################################################
    //#################################################################################################
    //#################################################################################################
    // Konstruktoren
    public ProductWine(String name, int quality, int expirationDate, BigDecimal priceBase) {
        super(name, quality, expirationDate, priceBase);
        this.timeOnShelf=0;
    }

    //#################################################################################################
    //#################################################################################################
    //#################################################################################################
    // Methoden
    // Methode zur Überprüfung, ob Wein im Regal eingeräumt werden kann
    public boolean canBeShelved() {
        return true;
    }

    @Override
    public void updateForNewDay() {
        updateQuality();
        updateDailyPrice();
    }

    // Methode zur Aktualisierung der Qualität
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
        // Der Preis von Wein verändert sich nicht, wenn er im Regal steht.
    }
}
