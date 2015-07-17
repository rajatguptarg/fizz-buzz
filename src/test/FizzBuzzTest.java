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
}