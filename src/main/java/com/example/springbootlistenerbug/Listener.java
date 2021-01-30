package com.example.springbootlistenerbug;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class Listener implements HttpSessionListener {

    public Listener(OtherClass otherClass) {
        System.out.println("Listener created!");
    }

}
