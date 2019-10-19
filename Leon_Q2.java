public class Leon_Q2 {
    private static double annualInterestRate;
    private double savingsBalance;

    public Leon_Q2(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }


    public void calculateMonthlyInterest()
    {
        double interest;
        System.out.println("Current Balance: " + savingsBalance);

        interest = (savingsBalance*annualInterestRate)/(12);
        savingsBalance = interest;
        System.out.println("New savings balance: " + savingsBalance);
    }

    public static void modifyInterestRate(double rate)
    {
        annualInterestRate = rate;
    }

}

class Test
{
    public static void main(String[] args)
    {
        Leon_Q2 saver1 = new Leon_Q2(2000);
        Leon_Q2 saver2 = new Leon_Q2(3000);
        saver1.modifyInterestRate(.04);
        saver1.calculateMonthlyInterest();
        saver2.modifyInterestRate(.04);
        saver2.calculateMonthlyInterest();
        saver1.modifyInterestRate(.05);
        saver1.calculateMonthlyInterest();
        saver2.modifyInterestRate(.05);
        saver2.calculateMonthlyInterest();

    }
}
