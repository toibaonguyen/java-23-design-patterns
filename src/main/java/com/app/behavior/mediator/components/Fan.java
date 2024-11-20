package com.app.behavior.mediator.components;

import com.app.behavior.mediator.Event;

//Component
public class Fan extends Actor{
    private final String name;
    public Fan(String name)
    {
        this.name=name;
    }
    public void cheer() {
        System.out.println("Fan "+name+" cheering for the team!");
        stadium.notify(this, Event.CHEER);
    }

    public void feelsExcited()
    {
        System.out.println("Fan "+name+" feels excited!!!");
    }
}
