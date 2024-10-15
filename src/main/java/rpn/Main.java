package rpn;

import java.io.Console;

public class Main {
    public static void main(String[] args) {
        Console console = System.console();
        RPNCaclutator calc = new RPNCaclutator();
        while(true) {
            String line = console.readLine("> ").trim();
            if (line.equals("quit")) {
                System.exit(1);
            }
            calc.eval(line);
            System.out.println(calc.toString());
        }
    }
}