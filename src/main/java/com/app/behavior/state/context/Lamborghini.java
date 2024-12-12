package com.app.behavior.state.context;

import com.app.behavior.state.state.ReadyCarState;
import com.app.behavior.state.state.StoppedCarState;

public class Lamborghini extends Car{
    private final static int MAX_DURATION=10;
    private final static int MAX_GASOLINE=5;
    private final static int DURATION_REDUCTION_COST=1;
    public Lamborghini()
    {
        state = new ReadyCarState(this);
    }

    @Override
    public void reduceDuration() {
        duration-=DURATION_REDUCTION_COST;
    }

    @Override
    public void move() {
        state.move();
    }

    @Override
    public void stop() {
        state.stop();
    }

    @Override
    public void fix() {
        duration=MAX_DURATION;
        System.out.println("Fix the car!");
        state=new StoppedCarState(this);
    }

    @Override
    public void refuel() {
        gasoline=MAX_GASOLINE;
        System.out.println("Refuel the car!");
        state=new StoppedCarState(this);
    }
}
