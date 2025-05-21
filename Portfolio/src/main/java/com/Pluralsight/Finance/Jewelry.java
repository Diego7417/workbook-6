package com.Pluralsight.Finance;

public class Jewelry extends FixedAssets {
    private double karat;

    public Jewelry(String name, double marketValue, double karat) {
        super(name, marketValue);
        this.karat = karat;
    }

    @Override
    public double getValue() {
        return getMarketValue() * (karat / 24.0);
    }
}
