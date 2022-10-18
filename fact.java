import java.util.Scanner;

public class fact{
    public static void main(String[]args){
        long i;
        long num = 1;
        long input;
         Scanner sc = new Scanner(System.in);
         System.out.print(">");
         input = sc.nextLong();
         for (i=1; i<=input; i++){
            num = num*i;

         }
         System.out.println("Factorial of " + input + " is:" + num);

    }
}
