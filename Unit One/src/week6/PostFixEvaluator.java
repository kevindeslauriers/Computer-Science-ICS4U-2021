package week6;

import java.util.Stack;

public class PostFixEvaluator {
  public static void main(String[] args) {
    System.out.println(evaluate("2 3 4 + 5 6 * * +"));
  }

  private static int evaluate(String expression) {
    Stack<Integer> operands = new Stack<Integer>();
    String[] parts = expression.split(" ");

    for (String part : parts) {
      if ("+-*/".indexOf(part) >= 0) {
        int op1 = operands.pop();
        int op2 = operands.pop();
        if (part.equals("+"))
          operands.push(op1 + op2);
        else if (part.equals("-"))
          operands.push(op2 - op1);
        else if (part.equals("*"))
          operands.push(op2 * op1);
        else if (part.equals("/"))
          operands.push(op2 / op1);
        else
          throw new IllegalArgumentException();

      } else {
        int val = Integer.parseInt(part);
        operands.push(val);
      }
    }

    int result = operands.pop();

    if (!operands.isEmpty())
      throw new IllegalArgumentException();

    return result;
  }
}
