package com.app.behavior.strategy;

import com.app.behavior.strategy.context.PaymentCalculator;
import com.app.behavior.strategy.strategy.BasePaymentStrategy;
import com.app.behavior.strategy.strategy.DiscountedPaymentStrategy;
import com.app.behavior.strategy.strategy.TaxedPaymentStrategy;

public class Main {
    public static void main(String[] args) {
        PaymentCalculator paymentCalculator=new PaymentCalculator();
        final double applePrice=5000;
        // First customer buy => discount 30%
        int appleQuantity=3;
        paymentCalculator.setPriceStrategy(new DiscountedPaymentStrategy(0.3));
        System.out.println("First customer buy => discount 30%");
        System.out.println("Total amount: "+paymentCalculator.calculate(applePrice,appleQuantity));

        // 2nd customer buy => base price
        appleQuantity=4;
        System.out.println("2nd customer buy => base price");
        paymentCalculator.setPriceStrategy(new BasePaymentStrategy());
        System.out.println("Total amount: "+paymentCalculator.calculate(applePrice,appleQuantity));

        // 3rd customer buy => taxed price 5%
        appleQuantity=3;
        System.out.println("3rd customer buy => taxed price 5%");
        paymentCalculator.setPriceStrategy(new TaxedPaymentStrategy(0.05));
        System.out.println("Total amount: "+paymentCalculator.calculate(applePrice,appleQuantity));
    }
}
