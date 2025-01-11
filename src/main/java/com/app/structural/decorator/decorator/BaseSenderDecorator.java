package com.app.structural.decorator.decorator;

import com.app.structural.decorator.component.Notifier;

public abstract class BaseSenderDecorator implements Notifier {
    private Notifier wrappee;

    public BaseSenderDecorator(Notifier n)
    {
        this.wrappee=n;
    }
    @Override
    public void send(String user, String message) {
        wrappee.send(user,message);
    }
}
