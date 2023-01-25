import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import testing.hamcrest.SquareRoot;

public class SquareRootTest {
    @BeforeEach
    public void initTest() {
        System.out.println("Starting new SquareRoot test.");
    }

    @AfterEach
    public void endTest() {
        System.out.println("SquareRoot Test completed.");
    }

    @Test
    public void negativeArgumentShouldThrowException() {
        double a = -4;
        SquareRoot root = new SquareRoot();
        Assertions.assertThrows(ArithmeticException.class, () -> {
            root.calcSquareRoot(a);
        });
    }
}
