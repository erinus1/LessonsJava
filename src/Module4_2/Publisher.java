package Module4_2;

//import java.util.Observer;
//publisher

public interface Publisher {
//    public void addObserver(Observer obs);
//    public void removeObserver(Observer obs);
//    public void notifyObserver();

    public void subscribe(Subscriber subscriber, String eventName);
    public void notify(String eventName, Object data);
}