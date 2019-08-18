package Module4_2;

abstract class BankAcc {

    public float currentAmount;

    public abstract float addMoney(float currentAmount);
    public abstract float withDraw(float newAmount);
    public abstract float getBalance();
    public abstract void setBalance (float currentAmount);
    public abstract float calculateFee(float fee, float amount);
}
