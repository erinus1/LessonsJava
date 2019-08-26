package Module4_2;

public class Human implements Subscriber {
    @Override
    public void update(Object data) {
        System.out.println("My new balance is: " + data);
    }
}