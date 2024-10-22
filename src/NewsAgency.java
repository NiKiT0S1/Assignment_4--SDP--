import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements Observable {

    // List for storing registered observers.
    private List<Observer> observers = new ArrayList<>();

    private String headline;

    // "addObserver" method adds a new observer to the list.
    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    // "removeObserver" method removes an observer from the list.
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    // "notifyObservers" method notifies all registered observers of a header change.
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(headline);
        }
    }

    // "setHeadline" method sets a new header and notifies observers of the change.
    public void setHeadline(String headline) {
        this.headline = headline;

        // Notifies all observers of the new header.
        notifyObservers();
    }
}
