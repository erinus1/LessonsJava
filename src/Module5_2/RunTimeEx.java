package Module5_2;

public class RunTimeEx extends RuntimeException {

    float amount;

    public void replenish(float amount) {
        if (amount < 0) {
        throw new RuntimeException();
        }
    }
}