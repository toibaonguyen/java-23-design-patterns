package com.app.behavior.state.state;

import com.app.behavior.state.context.Car;

public class RunningCarState extends CarState{
    public RunningCarState(Car car)
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
        else
        {
            car.reduceDuration();
            car.setGasoline(car.getGasoline()-1);
            System.out.println("Car is still running!");
        }
    }

    @Override
    public void stop() {
        System.out.println("Car is stopped!");
        car.setState(new StoppedCarState(car));
    }
}
