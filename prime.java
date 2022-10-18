import java.util.Scanner;
public class prime {
    public static void main(String []args) {
        //Input number from user
       Scanner input = new Scanner(System.in);
       System.out.println("Input number");

       int number = input.nextInt();

       int indicator = 0 ;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                indicator++;        
            }
        }
        if(indicator == 0) {
            System.out.println("Prime number");
        }
        else{
            System.out.println("Not prime number");
        }
       input.close();
    }
}