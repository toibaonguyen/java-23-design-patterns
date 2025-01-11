package com.app.structural.decorator.decorator;

import com.app.structural.decorator.component.Notifier;

public class SMSSenderDecorator extends BaseSenderDecorator{
    public SMSSenderDecorator(Notifier n) {
        super(n);
    }

    @Override
    public void send(String user, String message) {
        super.send(user, message);
        System.out.println("send SMS to:" +user+"; message:"+message);
    }
}
