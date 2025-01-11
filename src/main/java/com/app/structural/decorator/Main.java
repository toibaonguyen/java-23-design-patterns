package com.app.structural.decorator;

import com.app.structural.decorator.decorator.EmailSenderDecorator;
import com.app.structural.decorator.decorator.SMSSenderDecorator;
import com.app.structural.decorator.primaryComponent.InternalSender;

public class Main {
    public static void main(String[] args) {
        //Create primary component
        InternalSender sender=new InternalSender();

        //Use Decorator to send both for email and SMS
        EmailSenderDecorator decorator1=new EmailSenderDecorator(sender);
        SMSSenderDecorator decorator2=new SMSSenderDecorator(decorator1);

        decorator2.send("Naruto","I found out Boruto!!!");
    }
}
