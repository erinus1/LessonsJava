package Module4_2;
import java.util.ArrayList;
import java.util.Observer;


public class DebetAcc extends BankAcc implements Notifier {
    float fee = 1;

    public DebetAcc(){
        observers = new ArrayList();
    }

    @Override
    public void setBalance(float currentAmount) {
        this.currentAmount = currentAmount;
        notifyObserver();
    }
    @Override
    public float getBalance() {
        return currentAmount;
    }
    @Override
    public float addMoney(float amount) {
        System.out.println("Please enter your amount for adding to debet account: ");
        currentAmount += amount;
        notifyObserver();
        return currentAmount;
    }
    @Override
    public float withDraw(float newAmount) {
        currentAmount -= (newAmount + calculateFee(fee, newAmount));
        System.out.println("Enter your amount for withdraw. Fee will be 1% ");
        notifyObserver();
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
    public void addObserver(Observer obs) {
        observers.add(obs);
    }

    @Override
    public void removeObserver(Observer obs) {

    }

    @Override
    public void notifyObserver() {

        }
    }

