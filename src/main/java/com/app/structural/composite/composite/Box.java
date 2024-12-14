package com.app.structural.composite.composite;

import com.app.structural.composite.component.Component;

import java.util.ArrayList;
import java.util.List;

public class Box implements Component {
    private List<Component> components;

    public Box() {
        this.components = new ArrayList<>();
    }

    public void add(Component component)
    {
        this.components.add(component);
    }

    public void remove(Component component)
    {
        this.components.remove(component);
    }

    @Override
    public double getTotalPrice() {
        double totalPrice=0;
        for (Component c:components)
        {
            totalPrice+=c.getTotalPrice();
        }
        return totalPrice;
    }
}
