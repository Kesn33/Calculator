package kesn.interview.calculator;

import java.math.BigDecimal;

public class Test {

    public static void main(String[] args) {
        CalculatorImpl calculator = new CalculatorImpl();
        calculator.add(BigDecimal.valueOf(1));
        calculator.redo();
        calculator.sub(BigDecimal.valueOf(2));
        calculator.mul(BigDecimal.valueOf(3));
        calculator.div(BigDecimal.valueOf(4));
        calculator.undo();
        calculator.add(BigDecimal.valueOf(5));
        calculator.sub(BigDecimal.valueOf(6));
        calculator.mul(BigDecimal.valueOf(7));
        calculator.div(BigDecimal.valueOf(8));
        calculator.undo();
        calculator.undo();
        calculator.undo();
        calculator.undo();
        calculator.undo();
    }
}
