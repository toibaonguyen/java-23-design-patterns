package com.app.behavior.state.state;

import com.app.behavior.state.context.Car;

public class ReadyCarState extends CarState{
    public ReadyCarState(Car car)
    {
        super(car);
        this.car.refuel();
        this.car.fix();
    }
    @Override
    public void move() {
        car.reduceDuration();
        car.setGasoline(car.getGasoline()-1);
        System.out.println("Car is starting running!");
        car.setState(new RunningCarState(car));
    }

    @Override
    public void stop() {
        System.out.println("Car is already stopped!");
    }
}
