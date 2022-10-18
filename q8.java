import java.util.Scanner;

public class q8 {
    public static void main(String []args){
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input 3 numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if (a>=b && a>=c){
            System.out.println("The largest is " + a);
        }
        else if (b>=a && b>=c){
            System.out.println("The largest number is " + b);
        }
        else if (c>=a  && c>=b){
            System.out.println("The largest number is "  + c);
        }
        
        
    }
    
}
