public class Memento {
    private String state;

    // The constructor accepts the state to save.
    public Memento(String state) {
        this.state = state;
    }

    // "getState" method returns the saved state.
    public String getState() {
        return state;
    }
}
