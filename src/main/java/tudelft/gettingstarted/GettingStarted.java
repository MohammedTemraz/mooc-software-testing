package tudelft.gettingstarted;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class GettingStarted {
    public int addFive (int number) {
        return number + 5;
    }

    @Test
    public void addFiveToTwenty() {
        int result = new GettingStarted().addFive(20);
        Assertions.assertEquals(25,result);
    }

    @Test
// Add the correct numbers
    public void addFiveToThree() {
        int result = new GettingStarted().addFive(3);
        Assertions.assertEquals(8,result);
    }

    @Test
// Add the correct numbers
    public void addFiveToZero() {
        int result = new GettingStarted().addFive(0);
        Assertions.assertEquals(5,result);
    }

    @Test
// Add the correct numbers
    public void addFiveTwelve() {
        int result = new GettingStarted().addFive(12);
        Assertions.assertEquals(17,result);
    }

    @Test
// Write this test
    public void addFiveToMinusTwenty() {
        int result = new GettingStarted().addFive(-20);
        Assertions.assertEquals(-15, result);
    }
}
