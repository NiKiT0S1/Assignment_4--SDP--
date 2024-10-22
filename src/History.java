import java.util.Stack;

public class History {

    // Stack for storing Memento objects representing saved states.
    private Stack<Memento> mementos = new Stack<>();

    // "save" method saves the passed Memento object to the stack.
    public void save(Memento m) {
        mementos.push(m);
    }

    // "undo" method restores the previous state by retrieving the last Memento object from the stack.
    public Memento undo() {
        if (!mementos.isEmpty()) {
            return mementos.pop();
        }
        return null;
    }
}
