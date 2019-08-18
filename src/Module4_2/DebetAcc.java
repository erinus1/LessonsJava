package Module4_2;

public class DebetAcc extends BankAcc {
    float fee = 1;

    @Override
    public void setBalance(float currentAmount) {
        this.currentAmount = currentAmount;
    }

    @Override
    public float getBalance() {
        return currentAmount;
    }

    @Override
    public float addMoney(float amount) {
        System.out.println("Please enter your amount for adding to debet account: ");
        currentAmount += amount;
        return currentAmount;
    }

    @Override
    public float withDraw(float newAmount) {
        currentAmount -= (newAmount + calculateFee(fee, newAmount));
        System.out.println("Enter your amount for withdraw. Fee will be 1% ");
        return newAmount;
    }

    @Override
    public float calculateFee(float fee, float amount) {
        return fee * amount / 100;
    }
    public void printBalance() {
        System.out.println("Your balance is " + getBalance());
    }
}
