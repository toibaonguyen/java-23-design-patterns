package com.app.structural.composite.leaf;

import com.app.structural.composite.component.Component;

public class UsedProduct extends Product {
    private static float DECREASE_RATE=0.2f;
    public UsedProduct(double price ) {
        super(price );
    }

    @Override
    public double getTotalPrice() {
        return  price-(price*DECREASE_RATE) ;
    }
}
