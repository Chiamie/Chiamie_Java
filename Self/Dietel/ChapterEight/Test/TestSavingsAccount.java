import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSavingsAccount {
    @Test
    public void testSavingsAccountWhenAnnualInterestRateIs4Percent() {
        SavingsAccount saver1 = new SavingsAccount();
        SavingsAccount saver2 = new SavingsAccount();

        DecimalFormat df = new DecimalFormat("0.00");
        saver1.setSavingsBalance(2000);
        saver2.setSavingsBalance(3000);

        SavingsAccount.modifyInterestRate(4);

        saver1.calculateMonthlyInterest();
        assertEquals(2006.67, Double.parseDouble(df.format(saver1.getSavingsBalance())));
        saver2.calculateMonthlyInterest();
        assertEquals(3010, saver2.getSavingsBalance());

    }

    @Test
    public void testSavingsAccountWhenAnnualInterestRateIs5Percent() {
        SavingsAccount saver1 = new SavingsAccount();
        SavingsAccount saver2 = new SavingsAccount();

        DecimalFormat df = new DecimalFormat("0.00");
        saver1.setSavingsBalance(2000);
        saver2.setSavingsBalance(3000);

        SavingsAccount.modifyInterestRate(5);

        saver1.calculateMonthlyInterest();
        assertEquals(2008.33, Double.parseDouble(df.format(saver1.getSavingsBalance())));
        saver2.calculateMonthlyInterest();
        assertEquals(3012.5, saver2.getSavingsBalance());
    }
}
