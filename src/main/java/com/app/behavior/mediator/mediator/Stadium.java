package com.app.behavior.mediator.mediator;

import com.app.behavior.mediator.Event;
import com.app.behavior.mediator.components.Actor;

//Mediator
public interface Stadium {
    void notify(Actor actor, Event event);
}
