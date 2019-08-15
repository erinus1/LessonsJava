package Module4_2;

public class CreditAcc extends AccountActions {
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
        currentAmount = currentAmount - newAmount;

        if (currentAmount >= 1) {
            newAmount = newAmount + calculateFee(1, newAmount);
            currentAmount = newAmount;
            System.out.println("Fee is 1%");}

        else if (currentAmount == 0){
            currentAmount -= calculateFee(5, newAmount);
            System.out.println("Negative balance. Fee is 5%");}

            return newAmount;
        }

    @Override
    public float calculateFee(float fee, float amount) {
        return fee * amount / 100;

    }
}






