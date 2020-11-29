package th.ac.ku.swt012020;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NotSuspendedAccountTest {

    private Agent agent;

    @BeforeEach
    void setUp() {
        agent = new Agent();
    }

     @Test
     void testSuspendedAccount() {
        String accountNumber = "2352665011";
         boolean actualResult = agent.suspendedAccount(accountNumber);
         assertFalse(actualResult);
     }

    @Test
    void testNotSuspendedAccount() {
        String accountNumber = "1464246853";
        boolean actualResult = agent.suspendedAccount(accountNumber);
        assertTrue(actualResult);
    }


}
