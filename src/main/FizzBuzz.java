/**
 * Created by rajatg on 17/07/15.
 */

public class FizzBuzz {

    public String fizzBuzzString(int numberRange) {

        String numberString = null;

        for(int i = 0; i <= numberRange; i++) {

            boolean flag = true;
            if(i % 3 == 0) {
                numberString += "Fizz";
                flag = false;
            }
            if(i % 5 == 0) {
                numberString += "Buzz";
                flag = false;
            }
            if(flag) {
                numberString = "Blah";
            }
            numberString += " ";
        }
        return numberString;
    }
}
