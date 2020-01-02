package main.Module5_2;

import Module5_2.Subscriber;

import java.util.ArrayList;
import java.util.HashMap;

public class DebetAcc extends BankAcc implements Publisher {
    float fee = 1;
    HashMap<String, ArrayList<Subscriber>> subscribers;

    public DebetAcc() {
        subscribers = new HashMap();
    }
    @Override
    public void setBalance(float currentAmount) {
        this.currentAmount = currentAmount;
        notify("New balance", currentAmount);
    }

    @Override
    public float getBalance() {
        return currentAmount;
    }

    @Override
    public float addMoney(float amount) {
        currentAmount += amount;
        notify("Add money", currentAmount);
        return currentAmount;
    }

    @Override
    public float withDraw(float newAmount) {
        currentAmount -= (newAmount + calculateFee(fee, newAmount));
        notify("Withdraw", currentAmount);
        return newAmount;
    }

    @Override
    public float calculateFee(float fee, float amount) {
        return fee * amount / 100;
    }

    public void printBalance() {
        System.out.println("Your balance is " + getBalance());
    }

    @Override
    public void subscribe(Subscriber subscriber, String eventName) {
        if (subscribers.containsKey(eventName)) {
            ArrayList previousSubscribers = subscribers.get(eventName);
            previousSubscribers.add(subscriber); //
        } else {
            ArrayList<Subscriber> newSubscribers = new ArrayList();
            newSubscribers.add(subscriber);
            subscribers.put(eventName, newSubscribers);
        }
    }

    @Override
    public void notify(String eventName, Object data) {
        if (subscribers.containsKey(eventName)) {
            ArrayList<Subscriber> allSubs = subscribers.get(eventName);
            for (int i = 0; i < allSubs.size(); i++) {
                Subscriber subs = allSubs.get(i);
                subs.update(data);
            }
        }
    }
}

