// TEST

public class InterpreterMain {
    public static void main(String[] args) {
        String expression = "5 + 2 - 3";
        Interpreter interpreter = new Interpreter();
        int result = interpreter.evaluate(expression);
        System.out.println("Expression: " + expression + " = " + result);
    }
}