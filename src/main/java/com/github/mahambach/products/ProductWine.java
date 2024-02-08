package com.github.mahambach.products;

import java.math.BigDecimal;
import java.util.Objects;

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
    public ProductWine(String name, ProductType type, int quality, int expirationDate, BigDecimal basePrice) {
        super(name, type, quality, 1000, basePrice);
        this.timeOnShelf=0;
    }

    //#################################################################################################
    //#################################################################################################
    //#################################################################################################
    // Methoden
    // Methode zur Überprüfung, ob Wein im Regal eingeräumt werden kann
    @Override
    public boolean canBeShelved() {
        return getQuality() >= MIN_QUALITY;
    }

    @Override
    public void updateForNewDay() {
        updateQuality();
        updateDailyPrice();
    }

    // Methode zur Aktualisierung der Qualität
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
        // Der Preis von Wein verändert sich nicht, wenn er im Regal steht.
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ProductWine that = (ProductWine) o;
        return timeOnShelf == that.timeOnShelf;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), timeOnShelf);
    }
}
