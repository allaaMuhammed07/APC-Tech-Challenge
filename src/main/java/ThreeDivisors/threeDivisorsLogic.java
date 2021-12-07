package ThreeDivisors;

public class threeDivisorsLogic {

    public int numberOfThreeDivisors(int number1, int number2){
        int count = 0;
        for (int i = number1; i <= number2; i++){
            for (int x = 3; x <= Math.sqrt(i); x += 2)
            {
                if (x % i == 0)
                    count++;
            }
        }
        return count;
    }
}
