package ma;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //prompt for user integer
        System.out.println("Enter a year: ");
        int year = input.nextInt();
        //prompt for a month
        System.out.println("Enter a month: ");
        int month = input.nextInt();
        input.close();
        //Close the Scanner input
        //if invalid month is entered, can exit
        if ( month >12 || month <=0 ){
            System.exit(-1);
        }
        int answer = -1;
        //check if month match the 1 to 12 integer
        switch (month) {
            case 1,3,5,7,8,10,12:
                answer = 31;
                break;
            case 2:
                //call the leap year method
                if (isLeapYear(year)) {
                    //if it is return 29 days
                    answer = 29;
                    break;
                }
                //if it is not, return 28 days
                answer = 28;
                break;
            case 4,6,9,11:
                answer = 30;
                break;
            default:
                answer = -1;
                break;
        }
        //print out result
        System.out.println(answer + " days.");

    }
    //a leep year method to check a year is a leap year or not
    public static boolean isLeapYear(int year) {
            if (year % 4 == 0 && year % 100 != 0 ) {
                return true;
            }
            else if (year % 4 ==0 || year % 400 == 0){
                return true;
            }
            return false;
    }
}
