package com.Pluralsight.Finance;

public class Gold extends FixedAssets{
    private double weight;

    public Gold(String name, double marketValue, double weight) {
        super(name, marketValue);
        this.weight = weight;
    }

    @Override
    public double getValue() {
        return getMarketValue() * weight;
    }
}
