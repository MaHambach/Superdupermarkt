package com.github.mahambach.products;

public enum ProductType {
    GENERIC(""),
    CHEESE("Käse"),
    WINE("Wein");

    private final String description;

    ProductType(String description) {
        this.description = description;
    }

    public String getDescription(){
        return this.description;
    }
}
