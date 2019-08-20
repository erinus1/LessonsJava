package Module4_2;


import java.util.Observer;
//publisher

public interface Notifier {
    public void addObserver(Observer obs);
    public void removeObserver(Observer obs);
    public void notifyObserver();

}
