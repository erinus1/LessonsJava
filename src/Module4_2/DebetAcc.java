package Module4_2;
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
        System.out.println("Please enter your amount for adding to debet account: ");
        currentAmount += amount;
        notify("Add money", currentAmount);
        return currentAmount;
    }

    @Override
    public float withDraw(float newAmount) {
        currentAmount -= (newAmount + calculateFee(fee, newAmount));
        System.out.println("Enter your amount for withdraw. Fee will be 1% ");
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
        if (subscribers.containsKey(eventName)) { //поиск по ключу ивентНейм
            ArrayList previousSubscribers = subscribers.get(eventName); //получить подписчика по ивентНемйу и добавить в список
            previousSubscribers.add(subscriber); //
        } else {
            ArrayList<Subscriber> newSubscribers = new ArrayList();
            newSubscribers.add(subscriber);
            subscribers.put(eventName, newSubscribers);
        }
    }

    @Override
    public void notify(String eventName, Object data) {
        // 1 - проверить, есть ли в подписчиках (хэш-мап) нужный ивент
        // 2 - взять всех подписчеков по имени ивента из хэш-мапа
        // 3 - пройтись по каждому из подписчиков и вызвать метод "update"

        if (subscribers.containsKey(eventName)) {
            ArrayList<Subscriber> allSubs = subscribers.get(eventName);
            for (int i = 0; i < allSubs.size(); i++) {
                Subscriber subs = allSubs.get(i);
                subs.update(data);
            }
        }
    }
}

