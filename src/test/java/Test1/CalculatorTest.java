package Test1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @org.junit.jupiter.api.Test
    void add() {
        //expect value and actual value
        int num1 = 4;
        int num2 = 4;
        int sum = Calculator.add(num1, num2);
        Assertions.assertEquals(8, sum);
    }

    @org.junit.jupiter.api.Test
    void subtract(){

    }

    @Test
    void toUpperCase() {
        String testInput = "testing";
        String actualValue = Calculator.toUpperCase(testInput);

        Assertions.assertEquals("TESTING", actualValue);
    }
}