import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import testing.hamcrest.SquareRoot;
import testing.hamcrest.Vector;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class HamcrestFirstTest {

    @BeforeEach
    public void initTest() {
        System.out.println("Starting Hamcrest test.");
    }

    @AfterEach
    public void completeTest() {
        System.out.println("Hamcrest test completed.");
    }

    @Test
    public void squareRootCalcShouldBeRight() {
        SquareRoot root = new SquareRoot();
        double input = 121;
        double expected = 11.0;
        double actual = root.calcSquareRoot(input);
        assertThat(expected, equalTo(actual));
    }

    @Test
    public void vectorShouldBeNotNull() {
        Vector vector = new Vector();
        assertThat(vector, notNullValue());
    }

}// class
