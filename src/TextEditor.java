public class TextEditor {

    /**
     * Field for storing the current text of the editor.
     * "StringBuilder" is used for easy text editing.
     */
    private StringBuilder text;

    // The constructor initializes an empty text editor.
    public TextEditor() {
        text = new StringBuilder();
    }

    // "type" method adds a new word to the current text.
    public void type(String word) {
        text.append(word);
    }

    // "getText" method returns the current text in the editor.
    public String getText() {
        return text.toString();
    }

    // "save" method creates and returns a Memento object that stores the current state of the text.
    public Memento save() {
        return new Memento(text.toString());
    }

    // "restore" method restores the text state from the passed Memento object.
    public void restore(Memento m) {
        text = new StringBuilder(m.getState());
    }
}
