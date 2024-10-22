public interface Observer {

    /**
     * The update method is called to notify the observer of a state change.
     * The headline parameter represents a new header to be processed by the observer.
     */
    public void update(String headline);
}
