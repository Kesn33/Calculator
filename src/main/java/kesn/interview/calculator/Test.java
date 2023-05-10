package kesn.interview.calculator;

import java.math.BigDecimal;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {

    public static void main(String[] args) {
        CalculatorImpl calculator = new CalculatorImpl();
        calculator.redo();
        calculator.add(BigDecimal.valueOf(1));
        calculator.redo();
        calculator.redo();
        calculator.redo();
        calculator.sub(BigDecimal.valueOf(2));
        calculator.mul(BigDecimal.valueOf(3));
        calculator.div(BigDecimal.valueOf(4));
        calculator.undo();
        calculator.add(BigDecimal.valueOf(5));
        calculator.sub(BigDecimal.valueOf(6));
        calculator.mul(BigDecimal.valueOf(7));
        calculator.div(BigDecimal.valueOf(8));
        calculator.div(BigDecimal.valueOf(100));
        calculator.undo();
        calculator.undo();
        calculator.undo();
        calculator.undo();
        calculator.redo();
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i< 30; i ++){
            executorService.submit(() -> {
                calculator.add(BigDecimal.valueOf(100));
            });
            executorService.submit(() -> {
                calculator.sub(BigDecimal.valueOf(99));
            });
        }

    }
}
