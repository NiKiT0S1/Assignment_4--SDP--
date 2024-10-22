import java.util.Stack;

public class Interpreter {

    // The evaluate method accepts a string expression and calculates its result.
    public static int evaluate(String expression) {

        // We split the string into tokens (numbers and operators), using a space as a separator.
        String[] tokens = expression.split(" ");
        Stack<Expression> values = new Stack<>();
        Stack<Character> operators = new Stack<>();

        // We go through each element of tokens.
        for (String token : tokens) {
            /**
             * If the token is an operator, it is compared to the operator at the top of the stack
             * to follow the order of operations
             */
            if (token.equals("+") || token.equals("-")) {

                /**
                 * As long as there are no empty operators on the stack and the current operator has a lower or equal priority
                 * than the operator at the top of the stack, we perform an operation with two numbers from the stack.
                 **/
                while (!operators.isEmpty() && hasPrecedence(token.charAt(0), operators.peek())) {
                    Expression right = values.pop();
                    Expression left = values.pop();
                    char op = operators.pop();
                    values.push(new OperationExpression(left, right, op));
                }
                // Adding the current statement to the stack
                operators.push(token.charAt(0));
            } else {
                // If the token is a number, add it to the stack as an expression
                values.push(new NumberExpression(Integer.parseInt(token)));
            }
        }

        // Performing the remaining operations in the statement stack
        while (!operators.isEmpty()) {
            Expression right = values.pop();
            Expression left = values.pop();
            char op = operators.pop();
            values.push(new OperationExpression(left, right, op));
        }

        // Returning the final calculation result
        return values.pop().interpret();
    }

    /**
     * The hasPrecedence method determines the priority of operations.
     * In this case, all operations (+ and -) have the same priority.
     */
    private static boolean hasPrecedence(char op1, char op2) {
        if ((op1 == '+' || op1 == '-') && (op2 == '+' || op2 == '-')) {
            return true;
        }
        return false;
    }
}
