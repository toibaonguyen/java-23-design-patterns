package com.app.behavior.state.state;

import com.app.behavior.state.context.Car;

public class OutOfServiceCarState extends CarState{
    public OutOfServiceCarState(Car car)
    {
        super(car);
    }
    @Override
    public void move() {
        System.out.println("Car can not move because of empty of service!");
    }

    @Override
    public void stop() {
        System.out.println("Car is already stopped!");
    }
}