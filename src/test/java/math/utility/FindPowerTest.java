package math.utility;


import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class FindPowerTest {
    @Test
    public void oneRaisedToOneShouldReturnOne() {
        assert FindPower.calculatePower(1,1) == 1;
    }

    @Test
    public void twoRaisedToOneShouldReturnTwo() {

        assert FindPower.calculatePower(2,1) == 2;
    }

    @Test
    public void twoRaisedToTwoShouldReturnFour() {
        assert FindPower.calculatePower(2, 2) == 4;
    }

    @Test
    public void threeRaisedToTwoShouldReturnNine() {
        assert FindPower.calculatePower(3, 2) == 9;
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();
    @Test
    public void negativesAsExponentShouldThrowException(){

        thrown.expect(IllegalArgumentException.class);
        FindPower.calculatePower(2,-1);

    }
}
