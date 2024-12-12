package com.app.behavior.state.state;

import com.app.behavior.state.context.Car;

public abstract class CarState {
    protected Car car;
    public CarState(Car car)
    {
        this.car=car;
    }
    public abstract void move();
    public abstract void stop();
}
