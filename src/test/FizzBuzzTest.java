import static org.junit.Assert.*;

/**
 * Created by rajatg on 17/07/15.
 */

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class FizzBuzzTest {

    private FizzBuzz fb;

    @Test
    public void  shouldPrintFizzIfNumberIsThree() {
        fb = new FizzBuzz();

        String result = fb.findNumberString(3);

        assertEquals("Fizz", result);
        assertThat(result, is("Fizz"));
    }

    @Test
    public void shouldPrintBuzzIfNumberIsFive() {
        fb = new FizzBuzz();

        String result = fb.findNumberString(5);

        assertEquals("Buzz", result);
        assertThat(result, is("Buzz"));
    }

    @Test
    public void shouldPrintFizzBuzzIfNumberIsFifteen() {
        fb = new FizzBuzz();

        String result = fb.findNumberString(15);

        assertEquals("FizzBuzz", result);
        assertThat(result, is("FizzBuzz"));
    }
}