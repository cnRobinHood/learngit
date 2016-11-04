import java.util.Stack;

/**
 * Created by sky on 2016/10/30.
 */
public class Operation {
    Stack<Integer> numStack = new Stack<>();
    Stack<Character> charStack = new Stack<>();
    StringBuilder numTemp = new StringBuilder();

    public int Operation(String a) {

        StringBuilder b = new StringBuilder(a);
        while (b.length() != 0) {

            Character temp1 = b.charAt(0);
            b.delete(0, 1);
            if (!Character.isDigit(temp1)) {
                if (numTemp.toString().isEmpty()) {
                    numStack.push(Integer.parseInt(numTemp.toString()));
                    numTemp.delete(0, numTemp.length());
                }
                if (jurge(temp1) == false && charStack.empty() == false) {
                    operation1();
                }
                charStack.push(temp1);
                if (charStack.peek() == ')') {
                    charStack.pop();
                    charStack.pop();
                }


            } else {
                numTemp.append(temp1);
            }

        }
        return numStack.pop();
    }

    public void operation1() {
        char ope = charStack.pop();
        if (ope == '+') {
            numStack.push(numStack.pop() + numStack.pop());
        }
        if (ope == '-') {
            numStack.push(numStack.pop() - numStack.pop());
        }
        if (ope == '*') {
            numStack.push(numStack.pop() * numStack.pop());
        }
        if (ope == '/') {
            numStack.push(numStack.pop() / numStack.pop());
        }
    }

    public boolean jurge(Character str) {
        if (charStack.empty()) {
            return true;
        }
        Character top = charStack.peek();
        if (top == '(') {
            return true;
        }
        if (str == '(') {
            return true;
        }
        if (str == '/') {
            if (top == '+' || top == '-') {
                return true;
            } else {
                return false;
            }
        }
        if (str == '*') {
            if (top == '+' || top == '-') {
                return true;
            } else {
                return false;

            }
        }
        if (str == '+' || str == '-') {
            return false;
        }
        return true;
    }
}
