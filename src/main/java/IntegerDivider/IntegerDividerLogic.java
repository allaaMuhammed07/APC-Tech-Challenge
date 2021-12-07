package IntegerDivider;

import org.apache.commons.math3.util.Precision;

public class IntegerDividerLogic {

    public IntegerDividerLogic(){

    }

    public double integer_divider(int number1, int number2){
        //return Math.round((1.0 * number1) / number2 * 10.0)/10.0;
        return Precision.round((1.0 * number1) / number2 * 10.0/10.0 , 4);
    }
}
