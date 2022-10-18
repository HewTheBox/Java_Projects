import java.util.Scanner;

public class q1{
    public static void main(String[]args){
        int num = 1;
        int us;
        Scanner sc = new Scanner(System.in);
        System.out.print(">");
        us = sc.nextInt();
        
        if (us ==2 || us ==3)
        System.out.println(us + " is  a prime number");
        else if(us%2 ==0 || us%3 ==0)
        System.out.println( us + " is not a prime number");
        else if (us!=1)
        System.out.println(us + " is a prime number"); 
        else
        System.out.println(us + " is not a prime number");

    }

    
}