package th.ac.ku.swt012020;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DepositCashPerDayTest {

    private Agent agent;
    private String sameBranch = new String();
    private String differentBranch = new String();

    @BeforeEach
    void setUp() {
        agent = new Agent();
    }

    @Test
    void testDepositEqualTo50000AndSameBranch() {
        float depositCash = 50000.00f;
        boolean actualResult = agent.depositPerDay( depositCash, sameBranch);
        assertTrue(actualResult);
    }

    @Test
    void testDepositLessThan50000AndSameBranch() {
        float depositCash = 30000.00f;
        boolean actualResult = agent.depositPerDay( depositCash, sameBranch);
        assertTrue(actualResult);
    }

    @Test
    void testDepositMoreThan50000AndSameBranch() {
        float depositCash = 60000.00f;
        boolean actualResult = agent.depositPerDay( depositCash, sameBranch);
        assertFalse(actualResult);
    }

    @Test
    void testDepositEqualTo50000AndDifferentBranch() {
        float depositCash = 50000.00f;
        boolean actualResult = agent.depositPerDay( depositCash, differentBranch);
        assertTrue(actualResult);
    }

    @Test
    void testDepositLessThan50000AndDifferentBranch() {
        float depositCash = 30000.00f;
        boolean actualResult = agent.depositPerDay( depositCash, differentBranch);
        assertTrue(actualResult);
    }

    @Test
    void testDepositMoreThan50000AndDifferentBranch() {
        float depositCash = 60000.00f;
        boolean actualResult = agent.depositPerDay( depositCash, differentBranch);
        assertFalse(actualResult);
    }
}
