import java.util.Scanner;

public class palindrome{
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
int r;
int sum =0;
int temp;
int n; //It is  the number variable to be checked for parlindrome
System.out.print("INPUT A VALUE TO CHECK FOR PALINDROME.\n >> ");
n = sc.nextInt();
temp = n;
while(n>0){
r=n%10; //getting remainder
sum=(sum*10) + r;
n=n/10;
}
if(temp ==sum){
System.out.println(temp+" is a Palindrome number");
System.out.println("*********************");
}
else {
    System.out.println(temp+ " is not a Palindrome");
    System.out.println("*****************");
}

}
}
