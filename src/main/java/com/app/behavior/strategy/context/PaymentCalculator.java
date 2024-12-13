package com.app.behavior.strategy.context;

import com.app.behavior.strategy.strategy.PaymentStrategy;

public class PaymentCalculator {
    private PaymentStrategy paymentStrategy;
    public void setPriceStrategy(PaymentStrategy paymentStrategy)
    {
        this.paymentStrategy = paymentStrategy;
    }
    public double calculate(double price,int quantity)
    {
        return paymentStrategy.calculate(price,quantity);
    }

}
