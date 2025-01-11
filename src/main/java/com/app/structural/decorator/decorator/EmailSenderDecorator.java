package com.app.structural.decorator.decorator;

import com.app.structural.decorator.component.Notifier;

public class EmailSenderDecorator extends BaseSenderDecorator{
    public EmailSenderDecorator(Notifier n) {
        super(n);
    }

    @Override
    public void send(String user, String message) {
        super.send(user, message);
        System.out.println("send Email to:" +user+"; message:"+message);
    }
}
