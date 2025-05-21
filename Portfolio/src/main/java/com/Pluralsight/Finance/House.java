package com.Pluralsight.Finance;

public class House extends FixedAssets{
    private int yearBuilt;
    private int squareFeet;
    private int bedroom;

    public House(String name, double marketValue, int yearBuilt, int squareFeet, int bedroom) {
        super(name, marketValue);
        this.yearBuilt = yearBuilt;
        this.squareFeet = squareFeet;
        this.bedroom = bedroom;
    }

    @Override
    public double getValue() {
        return getMarketValue();
    }
}
