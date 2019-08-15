package Module4_2;

abstract class BankAcc {

    public float currentAmount;
    public float newAmount;
    public float fee;
    public float balance;

    public abstract float addMoney(float currentAmount);

    public abstract float withDraw(float newAmount);

    public abstract float getBalance(float currentAmount);

    public abstract float setBalance (float currentAmount);

    public abstract float calculateFee(float fee, float amount);
}
