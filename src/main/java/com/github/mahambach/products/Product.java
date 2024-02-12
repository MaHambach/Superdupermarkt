package com.github.mahambach.products;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Objects;

@Getter
@Setter
@EqualsAndHashCode
abstract class Product {
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
    protected Product(){}

    protected Product(String name, int quality, int expirationDate, BigDecimal basePrice) {
        this.name = name;
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
        updateQuality();
        updateDailyPrice();
    }

    public void updateQuality() {
        // Die Qualität eines generischen Produkts verändert sich nicht.
    }

    public void updateDailyPrice() {
        this.dailyPrice = this.basePrice.add(
                new BigDecimal("0.10").multiply(
                        new BigDecimal(this.quality)));
    }

    public boolean canBeShelved() {
        return true;
    }

    public String thisCantBeShelvedBecause() {
        return "Irgendwas ist furchtbar schief gelaufen.";
    }

    @Override
    public String toString() {
        return String.format("Typ= %4s, Bezeichnung= '%s'%s, Qualität=%4d, Verfallsdatum=%4d, Grundpreis=%6s €, Tagespreis=%6s €",
                type.getDescription(),
                name,
                " ".repeat(18-name.length()),
                quality,
                expirationDate,
                basePrice,
                dailyPrice
        );
    }
}
