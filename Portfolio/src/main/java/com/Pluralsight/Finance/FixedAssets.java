package com.Pluralsight.Finance;

public abstract class FixedAssets implements Valuable {
    private String name;
    private double marketValue;


    public FixedAssets(String name, double marketValue) {
        this.name = name;
        this.marketValue = marketValue;


    }

    public String getName() {
        return name;
    }

    public double getMarketValue() {
        return marketValue;
    }

    @Override
    public double getValue() {
        return marketValue;
    }
}
