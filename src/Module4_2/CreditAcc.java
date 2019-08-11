package Module4_2;

public class CreditAcc extends AccountActions{
    public CreditAcc() {
        currentAmount = 0;
    }

    public void printBalance() {
        System.out.println("Your balance is " + currentAmount);
    }

    @Override
    public float addMoney(float newAmount) {
        currentAmount += newAmount;
        return currentAmount;
    }

    @Override
    public float withDraw(float newAmount) {
        currentAmount -= (newAmount + calculateFee(1, newAmount));
        return newAmount;
    }

    @Override
    public float calculateFee(float fee, float amount) {
        return fee * amount / 100;
    }

    
}
