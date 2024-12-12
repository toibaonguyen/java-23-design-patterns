package com.app.behavior.state.context;

import com.app.behavior.state.state.CarState;

public abstract class Car {
    protected CarState state;
    protected int duration;
    protected int gasoline;
    public void setState(CarState state)
    {
        this.state=state;
    }
    public int getDuration()
    {
        return this.duration;
    }
    public void setGasoline(int gasoline)
    {
        this.gasoline=gasoline;
    }
    public int getGasoline()
    {
        return this.gasoline;
    }
    public abstract void reduceDuration();
    public abstract void move();
    public abstract void stop();
    public abstract void fix();
    public abstract void refuel();
}
