package com.app.behavior.mediator.components;

import com.app.behavior.mediator.Event;
import com.app.behavior.mediator.mediator.Stadium;

import java.util.Random;

//Component
public class GoalKeeper extends Actor{
    private final String name;
    public GoalKeeper(String name)
    {
        this.name=name;
    }
    public void catchTheBall() {
        System.out.println("Goal Keeper "+name+" is trying to catch the ball!");
        Random random=new Random();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        boolean isSuccess=random.nextBoolean();
        if(isSuccess)
        {
            System.out.println("Goal Keeper "+name+" successfully caught the ball!");
            stadium.notify(this, Event.CATCH_SUCCESS);
        }
        else
        {
            System.out.println("Goal Keeper "+name+" tried to catch the ball but failed...");
            stadium.notify(this, Event.CATCH_FAIL);
        }
    }

    public void feelGood()
    {
        System.out.println("Goal Keeper "+name+" feels good.");
    }

    public void feelVeryGood()
    {
        System.out.println("Goal Keeper  "+name+" feels very good.");
    }

    public void feelDown()
    {
        System.out.println("Goal Keeper "+name+" feels down.");
    }
}
