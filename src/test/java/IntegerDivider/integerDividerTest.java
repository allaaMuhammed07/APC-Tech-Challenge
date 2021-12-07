package IntegerDivider;

import org.junit.Test;

public class integerDividerTest {

    private IntegerDividerLogic integerDividerLogic = new IntegerDividerLogic();
    private int dividor = 2;
    private int dividedBy = 7;

    @Test
    public void ValidateIntegerDivider(){
        System.out.println("Division Result is: " + integerDividerLogic.integer_divider(dividor,dividedBy));
    }
}
