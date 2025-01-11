package com.app.structural.decorator.primaryComponent;

import com.app.structural.decorator.component.Notifier;

public class InternalSender implements Notifier {
    @Override
    public void send(String user, String message) {
        //Simulating send internal process
        System.out.println("send to:" +user+"; message:"+message);
    }
}
