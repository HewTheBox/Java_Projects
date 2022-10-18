import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class autoPalindrom{
    public static void main(String []args){
        // This is program to check for a palindrome number

        // Declaration of variables

        float number;
        float quotient;
        float remainder;
        float actual_quotient;
        float actual_reaminder;
        float ten = 10;
        float actual_number;
        float done_with;

        Scanner sc = new Scanner(System.in);
        
        System.out.print(
            "This application is to help you calculate for a palindrome.\n Press 1 to continue or 0 to quit \n >> ");
        int start = sc.nextInt();
        //while(start !=1 || start !=0){
            //System.out.print(
            //"This application is to help you calculate for a palindrome.\n Press 1 to continue or 0 to quit \n >> ");
            //int startu = sc.nextInt();
           
           // if (startu ==1 || startu ==0){
           //     break;

           // }
       // }

        if (start ==1){
            System.out.print("input a value to check for Palindrome.\n >> ");
            number = sc.nextFloat();
            System.out.println(number);
            remainder = number % ten;
            System.out.println(remainder);
            actual_reaminder = remainder/ten;
            System.out.println(actual_reaminder);
            quotient = number/ten;
            System.out.println(quotient);
            actual_quotient = quotient - actual_reaminder;
            System.out.println(actual_quotient);
            actual_number = ten * actual_quotient;
            System.out.println(actual_number);
            
            done_with = actual_number + remainder;
            System.out.println(done_with);
            if(done_with == number){
                System.out.println(done_with + " is a palindrome");
                System.out.println("******************");
            }


        }
        else if(start==0){
            System.out.println("You quit the program");
            System.out.println("*********************");
        }
        else{
            System.out.println("You input a wrong value. Please restart");
        }

    }
}