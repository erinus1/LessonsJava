package main.Module5_2;

import Module5_2.Subscriber;

public class Human implements Subscriber {
    @Override
    public void update(Object data) {
        System.out.println("My new balance is: " + data);
    }
}