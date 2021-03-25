package ma.ma3.q1;

import java.util.Date;

public class Account {
    private int id;
    private float balance;
    private Date dateCreated;
    private static double annualInterestRate;

    public Account(){
        this.dateCreated = new Date();
        this.id = 0;
        this.balance = 0;
        this.annualInterestRate = 0;

    }

    public Account(int id, float balance){
        this.setId(id);
        this.setBalance(balance);
        this.dateCreated = new Date();
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public Date getDateCreated(){
        return dateCreated;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setBalance(float balance){
        this.balance = balance;
    }

    public static void setAnnualInterestRate(double annualInterestRate) {
        Account.annualInterestRate = annualInterestRate;
    }

    public float getMonthlyInterest(){
        return (float) (balance * annualInterestRate / 12);
    }

    public void withdraw(int amount){
        if (this.balance - amount < 0){
            System.out.println("Not enough Cash for withdrawal");
        }else{
            this.balance -= amount;
        }
        System.out.println("Withdraw: "+amount);
    }

    public void deposit(int amount){
        this.balance +=amount;
        System.out.println("Deposit: "+amount);
    }

    public String toString(){
        return "id: "+this.getId()+" ,balance: "+getBalance()+" ,date Created: " + this.getDateCreated();
    }
}
