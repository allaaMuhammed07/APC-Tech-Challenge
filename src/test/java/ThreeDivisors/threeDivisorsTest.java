package ThreeDivisors;

import org.junit.Test;

public class threeDivisorsTest {

    private threeDivisorsLogic threeDivisorsLogic = new threeDivisorsLogic();

    @Test
    public void ValidateNumberHasThreeDivisors(){
        System.out.println(threeDivisorsLogic.numberOfThreeDivisors(11,50));
    }
}
