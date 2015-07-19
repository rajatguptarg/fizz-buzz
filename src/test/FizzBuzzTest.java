import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
// import static org.junit.Assert.assertThat;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() throws Exception {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void  shouldPrintFizzIfNumberIsThree() {
        String result = fizzBuzz.findNumberString(3);

        assertEquals("Fizz", result);
        //assertThat(result, is("Fizz"));
    }

    @Test
    public void shouldPrintBuzzIfNumberIsFive() {
        String result = fizzBuzz.findNumberString(5);

        assertEquals("Buzz", result);
        //assertThat(result, is("Buzz"));
    }

    @Test
    public void shouldPrintFizzBuzzIfNumberIsFifteen() {
        String result = fizzBuzz.findNumberString(15);

        assertEquals("FizzBuzz", result);
        //assertThat(result, is("FizzBuzz"));
     }
}