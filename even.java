import java.util.Scanner;

public class even{
    public static void main(String [] args){
        int num = 2;
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number: ");
        x = sc.nextInt();
        if (x%2 ==0)
        System.out.println("is a even");
        else
        System.out.println("is not");

    }
}