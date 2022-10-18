import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class check{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int remainder;
        int sum =0;
        int temp;
        int n; //It is  the number variable to be checked for parlindrome
        System.out.print("INPUT A VALUE TO CHECK FOR PALINDROME.\n >> ");
       
        n = sc.nextInt();
        System.out.println(n + "n");
       
        temp = n;
        System.out.println(temp + "temp");

        remainder =n%10; //getting remainder
        System.out.println(remainder + "r");
        sum=(sum*10) + remainder;
        System.out.println(sum + "sum");
        n=n/10;
        System.out.println(n + "n");
        double numbergh = 100.567;
        Math.round(numbergh);
        System.out.println(Math.round(numbergh));
       
       

        

    }
}