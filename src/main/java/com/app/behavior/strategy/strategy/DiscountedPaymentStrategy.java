package com.app.behavior.strategy.strategy;

public class DiscountedPaymentStrategy implements PaymentStrategy {
    private final double discountRate;
    public DiscountedPaymentStrategy(double discountRate)
    {
        this.discountRate=discountRate;
    }
    @Override
    public double calculate(double price, int quantity) {
        return (price * quantity) * (1 - discountRate);
    }
}
