package rpn;

import java.rmi.ServerError;
import java.util.LinkedList;
import java.util.List;

public class RPNCaclutator {

    LinkedList<Integer> stack = new LinkedList<>();


    public void eval(String line) {
        String[] split = line.split(" ");
        for (String s : split) {
            try {
                int i = Integer.parseInt(s);
                stack.add(i);
            } catch (NumberFormatException e) {
                // try something else
            }
            if ("+".equals(s)) {
                if (stack.size() < 2) {
                    System.err.println("Must be two values on the stack");
                } else {
                    Integer val1 = stack.removeLast();
                    Integer val2 = stack.removeLast();
                    stack.add(val1 + val2);
                }
            }
            if ("*".equals(s)) {
                if (stack.size() < 2) {
                    System.err.println("Must be two values on the stack");
                } else {
                    Integer val1 = stack.removeLast();
                    Integer val2 = stack.removeLast();
                    stack.add(val1 * val2);
                }
            }
        }
    }

    @Override
    public String toString() {
        return stack.toString();
    }

    public List<Integer> getStack() {
        return stack;
    }
}
