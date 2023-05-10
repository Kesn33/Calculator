package kesn.interview.calculator;

import java.math.BigDecimal;

public interface Calculator {

    /**
     * 加法运算
     * @param value
     * @return
     */
    Calculator add(BigDecimal value);

    /**
     * 减法运算
     * @param value
     * @return
     */
    Calculator sub(BigDecimal value);

    /**
     * 乘法运算
     * @param value
     * @return
     */
    Calculator mul(BigDecimal value);

    /**
     * 除法运算
     * @param value
     * @return
     */
    Calculator div(BigDecimal value);

    /**
     * 重新计算
     * @return
     */
    Calculator redo();

    /**
     * 撤回上一步操作
     * @return
     */
    Calculator undo();

    BigDecimal getResult();

}
