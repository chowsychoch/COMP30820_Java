package ma.ma3.q1;

public class test {
    public static void main(String[] args) {
        //Q1 Test 
        Account account = new Account(101,20000);
        account.setAnnualInterestRate(0.045);
        account.withdraw(2500);
        account.deposit(3000);

        System.out.println(account.toString()+ ", Monthly interest rate: "+account.getMonthlyInterest());


    }

}
