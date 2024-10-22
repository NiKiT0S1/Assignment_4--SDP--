public interface Observable {

    // "addObserver" method adds a new observer to the list.
    public void addObserver(Observer observer);

    // "removeObserver" method removes an observer from the list if it is no longer needed.
    public void removeObserver(Observer observer);

    // "notifyObservers" method notifies all registered observers of a state change.
    public void notifyObservers();
}
