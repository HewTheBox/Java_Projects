import java.util.Scanner;

public class money{
    public static void main(String[]args){
        float interest_rate;
        float principal;
        float period;
        float output;
        float percent = 100;
       
        System.out.println("Simple interest of Oborn International\n");

       
        Scanner user_input = new Scanner(System.in);
        System.out.print("What's your principal: ");
        principal = user_input.nextFloat();

        System.out.print("What's your interest rate: ");
        interest_rate = user_input.nextFloat();
        float rate = interest_rate / percent;

        System.out.print("How many years have you been saving: ");
        period = user_input.nextFloat();

        output = principal * rate * period;
        System.out.println("The Simple interest is $"+output);
        

        




    }
}
