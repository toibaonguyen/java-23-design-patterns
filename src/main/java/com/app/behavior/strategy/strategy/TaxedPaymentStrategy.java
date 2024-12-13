package com.app.behavior.strategy.strategy;

public class TaxedPaymentStrategy implements PaymentStrategy {
    private final double taxRate;
    public TaxedPaymentStrategy(double taxRate)
    {
        this.taxRate=taxRate;
    }
    @Override
    public double calculate(double price, int quantity) {
        return (price * quantity) * (1 + taxRate);
    }
}
