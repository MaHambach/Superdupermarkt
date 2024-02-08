package com.github.mahambach.products;

public interface DailyUpdateable {
    void updateForNewDay();
    void updateQuality();
    void updateDailyPrice();

    boolean canBeShelved();
}
