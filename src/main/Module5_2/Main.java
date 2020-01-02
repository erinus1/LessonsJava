package main.Module5_2;


public class Main {
    public static void main(String[] args) {

        CreditAcc credit = new CreditAcc();
        DebetAcc debet = new DebetAcc();
        Human human1 = new Human();
        RunTimeEx ex = new RunTimeEx();

        debet.subscribe(human1, "Withdraw");
        credit.subscribe(human1, "Add money");

        ex.replenish(-10);

        credit.setBalance(10);
        credit.addMoney(9);
        credit.withDraw(2);

        debet.setBalance(320);
        debet.addMoney(40);
        debet.withDraw(20);
    }
}
