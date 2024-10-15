package rpn;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class RPNCalculatorTest {

    @Test
    public void testPushNumber() {
        RPNCaclutator calc = new RPNCaclutator();
        calc.eval("1");
        assertEquals(List.of(1), calc.getStack());
    }

    @Test
    public void testAddNumbers() {

    }



}
