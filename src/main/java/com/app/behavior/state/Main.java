package com.app.behavior.state;

import com.app.behavior.state.context.Lamborghini;

public class Main {
    public static void main(String[] args) {
        Lamborghini myCar=new Lamborghini();
        myCar.move();
        myCar.move();
        myCar.stop();
        myCar.move();
        myCar.move();
        myCar.move();
        myCar.move();

        //Car can not move because of empty of gas!
        myCar.refuel();

        myCar.move();
        myCar.move();
        myCar.move();
        myCar.move();
        myCar.move();
        myCar.move();

        //Car can not move because of empty of gas!
        myCar.refuel();

        myCar.move();
        myCar.move();
        myCar.move();
        myCar.move();
        myCar.move();
        myCar.move();

        //Car can not move because of empty of gas!
        myCar.refuel();

        myCar.move();
        myCar.move();
        myCar.move();
        myCar.move();

        //Car can not move because of empty of service!
        myCar.fix();

        myCar.move();
        myCar.move();
        myCar.move();

        //Car can not move because of empty of gas!
        myCar.refuel();

        myCar.move();
        myCar.move();
        myCar.move();
        // finally got to the destination :>>
        myCar.stop();
    }
}
