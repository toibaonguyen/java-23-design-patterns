package com.app.structural.composite.leaf;

import com.app.structural.composite.component.Component;

public class NewProduct extends Product{
    public NewProduct(double price ) {
        super(price );
    }

    @Override
    public double getTotalPrice() {
        return price;
    }
}
