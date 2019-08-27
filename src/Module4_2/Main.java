package Module4_2;

public class Main {
    public static void main(String[] args) {

        CreditAcc credit = new CreditAcc();
        DebetAcc debet = new DebetAcc();
        Human human1 = new Human();
        
        debet.subscribe(human1, "New event");
        debet.notify("Set balance", "New balance");

        credit.setBalance(0);
        credit.printBalance();
        credit.addMoney(200);
        credit.printBalance();
        credit.withDraw(400);
        credit.printBalance();

        debet.setBalance(20);
        debet.printBalance();
        debet.addMoney(30);
        debet.printBalance();
        debet.withDraw(10);
        debet.printBalance();
    }
}
