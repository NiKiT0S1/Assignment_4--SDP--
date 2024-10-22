public class OperationExpression implements Expression {

    // Fields for storing the left and right operands, as well as the operator (for example, + or -).
    private Expression leftExpression;
    private Expression rightExpression;
    private char operator;

    // The constructor accepts two operands (left and right) and an operator.
    public OperationExpression(Expression left, Expression right, char operator) {
        this.leftExpression = left;
        this.rightExpression = right;
        this.operator = operator;
    }

    /**
     * "interpret" method performs an operator-based calculation.
     * Depending on which operator was passed, the corresponding operation is performed (addition or subtraction).
     */
    @Override
    public int interpret() {
        switch (operator) {
            case '+':
                return leftExpression.interpret() + rightExpression.interpret();
            case '-':
                return leftExpression.interpret() - rightExpression.interpret();
            default:
                throw new UnsupportedOperationException("Unsupported operation: " + operator);
        }
    }
}