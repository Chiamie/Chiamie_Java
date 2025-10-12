public class SavingsAccount {
    private static double annualInterestRate;
    private double savingsBalance;


    public void calculateMonthlyInterest() {
        this.savingsBalance += (savingsBalance * annualInterestRate)/12;
    }

    public static void modifyInterestRate(double rate) {
        annualInterestRate = rate / 100;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }
    public double getSavingsBalance() {
        return savingsBalance;
    }
}
