public class NumberExpression implements Expression {
    private int number;

    // The constructor accepts a number and stores it in a field.
    public NumberExpression(int number) {
        this.number = number;
    }

    /**
     * "interpret" method returns a numeric value.
     * Is an implementation of a method from "Expression" interface that simply returns a number.
     */
    @Override
    public int interpret() {
        return this.number;
    }
}
