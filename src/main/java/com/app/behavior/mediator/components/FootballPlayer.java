package com.app.behavior.mediator.components;

import com.app.behavior.mediator.Event;

//Component
public class FootballPlayer extends Actor {
    private final String name;
    public FootballPlayer(String name)
    {
        this.name=name;
    }
    public void shoot() {
        System.out.println("Player "+name+" is shooting!!");
        stadium.notify(this, Event.SHOOT);
    }

    public void feelGood()
    {
        System.out.println("Player "+name+" feels good.");
    }

    public void feelVeryGood()
    {
        System.out.println("Player "+name+" feels very good.");
    }

    public void feelDown()
    {
        System.out.println("Player "+name+" feels down.");
    }
}
