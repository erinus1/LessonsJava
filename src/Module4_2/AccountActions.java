package Module4_2;

abstract class AccountActions {

    private int currentAmount;
    private int newAmount;
    private int fee;
    private int balance;

    public abstract int addMoney(int currentSumm, int newAmount);

    public abstract int withDraw(int newSumm);

    public abstract int calculateFee(int fee);
}
