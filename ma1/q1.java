package ma;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        //prompt user to enter a number v for speed, a number a for acceleration,
        //and a character ‘w’ or ‘d’ to indicate if the runway is wet or dry
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a speed: ");
        double v = input.nextInt();
        System.out.println("Enter a acceleration: ");
        double a = input.nextInt();
        System.out.println("Enter w for wet or d for dry runway: ");
        char runway = input.next().toLowerCase().charAt(0);
        //if neither w or d, output result
        input.close();
        if (runway !='w' && runway !='d'){
            System.out.println("Wrong input");
            System.exit(-1);
        }
        //calculate the input
        double length = Math.pow(v,2) / (2 * a);
        boolean status = runway == 'w' ? true : false;
        //check with runway, is it dry or wet ?
        if(status) {
            length = length * (1.15);
        }
        System.out.printf("%.2f",length);
    }
}
