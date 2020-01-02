package main.Module5_2;

import Module5_2.Subscriber;

import java.util.ArrayList;
import java.util.HashMap;

public class CreditAcc extends BankAcc implements Publisher {

    HashMap<String, ArrayList<Subscriber>> subscribers;

    public CreditAcc() {
        subscribers = new HashMap();
    }

    @Override
    public void setBalance(float currentAmount) {
        this.currentAmount = currentAmount;
    }

    @Override
    public float getBalance() {
        return currentAmount;
    }

    public void printBalance() {
        System.out.println("Credit account. Your balance is " + getBalance());
    }

    @Override
    public float addMoney(float amount) {
        currentAmount += amount;
        return currentAmount;
    }

    @Override
    public float withDraw(float newAmount) {
        float fee;
        String msg;

        if ((currentAmount - newAmount) >= 0) {
            fee = 1;
            msg = "Fee is 1%";
        } else {
            fee = 5;
            msg = "Negative balance. Fee is 5%";
        }
        currentAmount -= (newAmount + calculateFee(fee, newAmount));
        return newAmount;
    }

    @Override
    public float calculateFee(float fee, float amount) {
        return fee * amount / 100;
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