package MA2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        System.out.println("The amount invested: ");
        Scanner scanner = new Scanner(System.in);
        double amount = scanner.nextDouble();
        System.out.println("Annual interest rate: ");
        double monthlyRate = scanner.nextDouble();
        scanner.close();
        monthlyRate = monthlyRate / 1200;
        //Check error input
        if (amount <= 0 || monthlyRate <=0){
            System.out.println("Input should not be negative");
        }else{
            //Proceed
            int years = 30;
            System.out.println("Years\tValue");
            DecimalFormat f = new DecimalFormat("##.00");
            for (int i =1; i <= 30; i++ ){
                //call each function
                double result = futureValue(amount,monthlyRate,i);
                System.out.println(String.format(i + "\t\t"+ f.format(result)));
            }
        }

    }

    public static double futureValue(double amount, double monthlyRate, int year){
        return amount * (Math.pow((1 + monthlyRate),year * 12));
    }

}
