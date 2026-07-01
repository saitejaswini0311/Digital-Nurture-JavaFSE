import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorAAATest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Setup Completed");
    }

    @Test
    public void testAddition() {

        // Arrange
        int a = 20;
        int b = 30;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals(50, result);
    }

    @After
    public void tearDown() {
        System.out.println("Resources Released");
    }
}