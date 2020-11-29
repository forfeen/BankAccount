package th.ac.ku.swt012020;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MinimumDepositTest {

    private Agent agent;
    private final float minimumDeposit = 100.00f;

    @BeforeEach
    void setUp() {
        agent = new Agent();
    }

    @Test
    void testDepositEqualToMinimum() {
        float depositCash = 100.00f;
        boolean actualResult = agent.minimumDeposit(depositCash);
        assertTrue(actualResult);
    }

    @Test
    void testDepositLessThanMinimum() {
        float depositCash = 50.00f;
        boolean actualResult = agent.minimumDeposit(depositCash);
        assertFalse(actualResult);
    }

    @Test
    void testDepositMoreThanMinimum() {
        float depositCash = 150.00f;
        boolean actualResult = agent.minimumDeposit(depositCash);
        assertTrue(actualResult);
    }

}
