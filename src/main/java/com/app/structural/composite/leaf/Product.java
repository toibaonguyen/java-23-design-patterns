package com.app.structural.composite.leaf;

import com.app.structural.composite.component.Component;

public abstract class Product implements Component {
    protected final double price;
    public Product(double price )
    {
        this.price=price;
    }
}
