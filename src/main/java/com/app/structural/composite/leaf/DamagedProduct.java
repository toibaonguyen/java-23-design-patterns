package com.app.structural.composite.leaf;

import com.app.structural.composite.component.Component;

public class DamagedProduct extends Product {
    private static float DECREASE_RATE=0.4f;
    public DamagedProduct(double price ) {
        super(price);
    }

    @Override
    public double getTotalPrice() {
        return price-(price*DECREASE_RATE) ;
    }
}
