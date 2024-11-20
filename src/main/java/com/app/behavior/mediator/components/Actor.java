package com.app.behavior.mediator.components;

import com.app.behavior.mediator.mediator.Stadium;

//Component
public abstract class Actor {
    protected Stadium stadium;
    public void setStadium(Stadium stadium)
    {
        this.stadium=stadium;
    }
}
