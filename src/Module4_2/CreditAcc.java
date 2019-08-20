package Module4_2;

import java.util.Observer;

public class CreditAcc extends BankAcc implements Notifier {

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
        System.out.println("Please enter your amount for adding to credit account : ");
        currentAmount += amount;
        return currentAmount;
    }
    @Override
    public float withDraw(float newAmount) {
        System.out.println("Enter your amount for withdraw: ");
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
        System.out.println(msg);
        return newAmount;
    }
    @Override
    public float calculateFee(float fee, float amount) {
        return fee * amount / 100;
    }

    @Override
    public void addObserver(Observer obs) {

    }

    @Override
    public void removeObserver(Observer obs) {

    }

    @Override
    public void notifyObserver() {

    }
}
