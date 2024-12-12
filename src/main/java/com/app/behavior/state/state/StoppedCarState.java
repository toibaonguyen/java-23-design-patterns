package com.app.behavior.state.state;

import com.app.behavior.state.context.Car;

public class StoppedCarState extends CarState{
    public StoppedCarState(Car car)
    {
        super(car);
    }
    @Override
    public void move() {
        int duration=car.getDuration();
        int gas=car.getGasoline();
        if(duration==0)
        {
            car.setState(new OutOfServiceCarState(car));
            System.out.println("Car is suddenly stopped!");
        }
        else if(gas==0)
        {
            car.setState(new OutOfGasCarState(car));
            System.out.println("Car is suddenly stopped!");
        }
        else {
            car.setGasoline(gas-2);
            System.out.println("Car is starting running!");
            car.setState(new RunningCarState(car));
        }
    }

    @Override
    public void stop() {
        System.out.println("Car is already stopped!");
    }
}