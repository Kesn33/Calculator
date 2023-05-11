package kesn.interview.calculator;

import java.math.BigDecimal;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {

    public static void main(String[] args) {
        CalculatorImpl calculator = new CalculatorImpl();
        //正常执行
        System.out.println("正常执行----------------------");
        calculator.add(BigDecimal.valueOf(1));
        calculator.sub(BigDecimal.valueOf(2));
        calculator.mul(BigDecimal.valueOf(3));
        calculator.div(BigDecimal.valueOf(4));
        calculator.getResult();

        //模拟redo，undo执行
        System.out.println("模拟redo，undo执行----------------------");
        calculator.redo();
        calculator.getResult();
        calculator.add(BigDecimal.valueOf(5));
        calculator.sub(BigDecimal.valueOf(6));
        calculator.mul(BigDecimal.valueOf(7));
        calculator.div(BigDecimal.valueOf(8));
        calculator.div(BigDecimal.valueOf(100));
        calculator.undo();
        calculator.getResult();
        calculator.undo();
        calculator.getResult();

        //模拟除数是0
        /*System.out.println("模拟除数是0----------------------");
        calculator.div(BigDecimal.ZERO);*/

        //模拟一直undo
        System.out.println("模拟一直undo----------------------");
        for (int i = 0; i < 10; i ++){
            calculator.undo();
        }

        //模拟多线程下的原子性
        System.out.println("模拟多线程下的原子性----------------------");
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
        executorService.shutdown();

    }
}
