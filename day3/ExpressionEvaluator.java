package day3;

public class ExpressionEvaluator {

    // Evaluates an arithmetic expression with + - * /
    // Uses integer arithmetic only
    public static int evaluate(String expr) {

        int result = 0;
        int lastNumber = 0;
        int currentNumber = 0;
        char operator = '+';

        int i = 0;

        while (i < expr.length()) {

            char ch = expr.charAt(i);

            // Skip spaces
            if (ch == ' ') {
                i++;
                continue;
            }

            // Build multi-digit number
            if (Character.isDigit(ch)) {
                currentNumber = 0;

                while (i < expr.length() && Character.isDigit(expr.charAt(i))) {
                    currentNumber = currentNumber * 10
                            + (expr.charAt(i) - '0');
                    i++;
                }
                continue;
            }

            // Operator encountered
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {

                switch (operator) {
                    case '+':
                        result += lastNumber;
                        lastNumber = currentNumber;
                        break;
                    case '-':
                        result += lastNumber;
                        lastNumber = -currentNumber;
                        break;
                    case '*':
                        lastNumber = lastNumber * currentNumber;
                        break;
                    case '/':
                        if (currentNumber == 0) {
                            System.out.println("Invalid expression: Division by zero");
                            System.exit(0);
                        }
                        lastNumber = lastNumber / currentNumber;
                        break;
                }

                operator = ch;
                currentNumber = 0;
            } else {
                System.out.println("Invalid character found: " + ch);
                System.exit(0);
            }

            i++;
        }

        // Process last number
        switch (operator) {
            case '+':
                result += lastNumber;
                result += currentNumber;
                break;
            case '-':
                result += lastNumber;
                result -= currentNumber;
                break;
            case '*':
                result += lastNumber * currentNumber;
                break;
            case '/':
                if (currentNumber == 0) {
                    System.out.println("Invalid expression: Division by zero");
                    System.exit(0);
                }
                result += lastNumber / currentNumber;
                break;
        }

        return result;
    }

    public static void main(String[] args) {
        String expr = "12 + 3 * 4 - 5 / 2";
        int result = evaluate(expr);
        System.out.println("Result: " + result);
    }
}
