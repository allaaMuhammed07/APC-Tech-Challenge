package ReverseUpperCase;

import ReverseUppercase.ReverseUppercaseLogic;
import org.junit.Test;

public class reverseUpperCaseTest {

    private ReverseUppercaseLogic reverseUppercaseLogic = new ReverseUppercaseLogic();
    private String stringInput = "just a simple string";

    @Test
    public void ValidateReverseUpperCase(){
        System.out.println(reverseUppercaseLogic.name_uppercase_reverse(stringInput));
    }
}
