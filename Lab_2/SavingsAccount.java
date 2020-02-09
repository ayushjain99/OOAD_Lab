public class SavingsAccount{
    static float annualInterestRate;
    private float savingsBalance;

    public SavingsAccount(float b){
        savingsBalance = b;
    }

    public void calculateMonthlyInterest(){
        float i;
        i = (savingsBalance*annualInterestRate)/1200.0f;
        savingsBalance = savingsBalance + i;
    }

    public static void modifyInterestRate(float r){
        annualInterestRate = r;
    }

    public float getSavingsBalance(){
        return savingsBalance;
    }

    // Testing
    public static void main(String[] args) {
        float a,b;
        SavingsAccount saver1 = new SavingsAccount(2000.0f);
        SavingsAccount saver2 = new SavingsAccount(3000.0f);
        SavingsAccount.modifyInterestRate(4.0f);
        a = saver1.getSavingsBalance();
        saver1.calculateMonthlyInterest();
        b = saver1.getSavingsBalance();
        System.out.println("Balance of saver1 = " + a);
        System.out.println("Interest for saver1 = " + (b-a));
        System.out.println("New balance of saver1 = " + b);
        a = saver2.getSavingsBalance();
        saver2.calculateMonthlyInterest();
        b = saver2.getSavingsBalance();
        System.out.println("Balance of saver2 = " + a);
        System.out.println("Interest for saver2 = " + (b-a));
        System.out.println("New balance of saver2 = " + b);
        System.out.println();
        // Modify Interest Rate
        SavingsAccount.modifyInterestRate(5.0f);

        a = saver1.getSavingsBalance();
        saver1.calculateMonthlyInterest();
        b = saver1.getSavingsBalance();
        System.out.println("Balance of saver1 = " + a);
        System.out.println("Interest for saver1 = " + (b-a));
        System.out.println("New balance of saver1 = " + b);
        a = saver2.getSavingsBalance();
        saver2.calculateMonthlyInterest();
        b = saver2.getSavingsBalance();
        System.out.println("Balance of saver2 = " + a);
        System.out.println("Interest for saver2 = " + (b-a));
        System.out.println("New balance of saver2 = " + b);
    }
}
