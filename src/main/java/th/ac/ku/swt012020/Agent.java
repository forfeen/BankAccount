package th.ac.ku.swt012020;

public class Agent {

    public boolean depositPerTime(float depositCash) {
        float depositPerTime = 30000.00f;
        if (depositCash < depositPerTime || depositCash == depositPerTime) return true;
        return false;
    }

    public boolean depositPerDay(float depositCash, String branch) {
        float depositPerDay = 50000.00f;
        String sameBranch = "sameBranch";
        String differentBranch = "differentBranch";
        if (depositCash <= depositPerDay || branch.equalsIgnoreCase(sameBranch)) return true;
        if (depositCash <= depositPerDay || branch.equalsIgnoreCase(differentBranch)) return true;
        return false;
    }

    public boolean suspendedAccount(String statusAccount) {
        String notSuspended = "1464246853";
        if (statusAccount.equals(notSuspended)) return true;
        return false;
    }


    public boolean minimumDeposit(float depositCash) {
        float minimumDeposit = 100.00f;
        if (depositCash >= minimumDeposit ) return true;
        return false;
    }
}
