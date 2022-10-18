import java.util.Scanner;

public class zero {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a value \n> ");
        float number_to_check = sc.nextFloat();
        
        if (number_to_check>0){
            System.out.println(number_to_check + " is a positive number");
        }
        else if (number_to_check <0){
            System.out.println(number_to_check + " is a negative number");
        }
        else if (number_to_check ==0){
            System.out.println(number_to_check);
        }
        else{
            System.out.println("Wrong input. Please restart");
        }

    }
    
}
