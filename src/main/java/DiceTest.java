import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

class DiceTest {

    @Test
    void tossAndSum() {
        Dice dice = new Dice(1);
        Integer actual = dice.tossAndSum();
        Integer min = 1;
        Integer max = 6;

        Assert.assertTrue(actual >= min && actual <= max);
    }
}