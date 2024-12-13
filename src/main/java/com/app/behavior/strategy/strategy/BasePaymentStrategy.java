package com.app.behavior.strategy.strategy;

public class BasePaymentStrategy implements PaymentStrategy {
    @Override
    public double calculate(double price, int quantity) {
        return price * quantity;
    }
}
