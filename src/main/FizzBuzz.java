public class FizzBuzz {

    public String findNumberString(int number) {

        String numberString = "";
        boolean flag = true;

        if(number % 3 == 0) {
            numberString += "Fizz";
            flag = false;
        }

        if(number % 5 == 0) {
            numberString += "Buzz";
            flag = false;
        }

        if(flag) {
            numberString = "Blah";
        }

        return numberString;
    }

    public String startGame(int numberRange) {

        String numberString = "";

        for(int i = 1; i <= numberRange; i++) {

            boolean flag = true;
            numberString += (findNumberString(i) + " ");

        }
        return numberString;
    }
}
