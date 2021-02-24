package MA2;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        System.out.println("Enter a password: ");
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        scanner.close();
        Boolean result = atLeast2Character(password) &&
                onlyLetterssandDigits(password) && atLeastThreeDigits(password);
        if (result == false){
            System.out.println("Invalid Password");
        }else {
            System.out.println("Valid Password");
        }
    }
    public static boolean atLeast2Character(String password){
        if (password.length() >=2){
            return true;
        }
        return false;
    }

    public static boolean onlyLetterssandDigits(String password){
        for (int i = 0; i < password.length();i++){
            if (!Character.isLetter(password.charAt(i)) && !Character.isDigit(password.charAt(i))){
                return false;
            }
        }
        return true;
    }

    public static boolean atLeastThreeDigits(String password){
        int count =0;
        for (int i=0; i < password.length();i++){
            if (Character.isDigit(password.charAt(i))){
                count ++;
            }
            if (count ==3){
                return true;
            }
        }
        return false;
    }


}
