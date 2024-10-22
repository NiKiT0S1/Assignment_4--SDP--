// TEST

public class MementoMain {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        History history = new History();

        editor.type("Hello");
        history.save(editor.save());
        System.out.println("Current text: " + editor.getText());

        editor.type(" SE-2308");
        history.save(editor.save());
        System.out.println("Current text: " + editor.getText());

        editor.restore(history.undo());
        System.out.println("After undo: " + editor.getText());

        editor.restore(history.undo());
        System.out.println("After undo: " + editor.getText());
    }
}
