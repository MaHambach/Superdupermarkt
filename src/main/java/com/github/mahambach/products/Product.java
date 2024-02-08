package com.github.mahambach.products;

import java.math.BigDecimal;
import java.util.Objects;

public class Product implements DailyUpdateable{
    // Attribute
    private String name; //Bezeichnung
    private ProductType type;
    private int quality; //Qualität
    private int expirationDate; //Verfallsdatum: Zählt die Tage bis zum Verfall.
    private BigDecimal basePrice; //Grundpreis
    private BigDecimal dailyPrice; //Tagespreis

    //#################################################################################################
    //#################################################################################################
    //#################################################################################################
    // Konstruktoren

    public Product(String name, ProductType type, int quality, int expirationDate, BigDecimal basePrice) {
        this.name = name;
        this.type = type;
        this.quality = quality;
        this.expirationDate = expirationDate;
        this.basePrice = basePrice;
        updateDailyPrice();

    }

    //#################################################################################################
    //#################################################################################################
    //#################################################################################################
    // Methoden
    // Aktualisiert die Daten des Produkts für den neuen Tag.
    public void updateForNewDay(){
        updateDailyPrice();
    }

    @Override
    public void updateQuality() {
        // Die Qualität eines generischen Produkts verändert sich nicht.
    }

    @Override
    public void updateDailyPrice() {
        this.dailyPrice = this.basePrice.add(
                new BigDecimal("0.10").multiply(
                        new BigDecimal(this.quality)));
    }

    @Override
    public boolean canBeShelved() {
        return true;
    }

    //#################################################################################################
    //#################################################################################################
    // Getter, Setter und andere generische Methoden
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public int getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(int expirationDate) {
        this.expirationDate = expirationDate;
    }

    public BigDecimal getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(BigDecimal basePrice) {
        this.basePrice = basePrice;
    }

    public BigDecimal getDailyPrice() {
        return dailyPrice;
    }

    public void setDailyPrice(BigDecimal dailyPrice) {
        this.dailyPrice = dailyPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return quality == product.quality && expirationDate == product.expirationDate && Objects.equals(name, product.name) && Objects.equals(basePrice, product.basePrice) && Objects.equals(dailyPrice, product.dailyPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, quality, expirationDate, basePrice, dailyPrice);
    }

    @Override
    public String toString() {
        return String.format("Product{name= '%s'%s, quality=%4d, expirationDate=%4d, priceBase=%6s €, priceDaily=%6s €}"
        , name, " ".repeat(18-name.length()), quality, expirationDate, basePrice, dailyPrice );
    }
}
