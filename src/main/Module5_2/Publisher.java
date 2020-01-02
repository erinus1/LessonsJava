package main.Module5_2;

import Module5_2.Subscriber;

public interface Publisher {
    public void subscribe(Subscriber subscriber, String eventName);
    public void notify(String eventName, Object data);
}