package Module5_2;

public interface Publisher {
    public void subscribe(Subscriber subscriber, String eventName);
    public void notify(String eventName, Object data);
}