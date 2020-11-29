package th.ac.ku.swt012020;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DepositCashPerTimeTest {

    private Agent agent;

    @BeforeEach
    void setUp() {
        agent = new Agent();
    }

    @Test
    void testDepositLessThan30000ThenResultShouldBeTrue() {
        float depositCash = 5000.00f;
        boolean actualResult = agent.depositPerTime(depositCash);
        assertTrue(actualResult);
    }

    @Test
    void testDepositEqualTo30000ThenResultShouldBeTrue() {
        float depositCash = 30000.00f;
        boolean actualResult = agent.depositPerTime(depositCash);
        assertTrue(actualResult);
    }

    @Test
    void testDepositMoreThan30000ThenResultShouldBeFalse() {
        float depositCash = 50000.00f;
        boolean actualResult = agent.depositPerTime(depositCash);
        assertFalse(actualResult);
    }

}
