package Module4_2;

public class Main {
    public static void main(String[] args) {

        CreditAcc credit = new CreditAcc();
        DebetAcc debet = new DebetAcc();

        Human human1 = new Human();
        debet.subscribe(human1, "Withdraw");
        credit.subscribe(human1, "Add money");

        credit.setBalance(0);
        credit.addMoney(200);
        credit.withDraw(400);

        debet.setBalance(20);
        debet.addMoney(30);
        debet.withDraw(10);
    }
}
