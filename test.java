import java.util.Scanner;
public class test{
 public static void main(String [] args){
    System.out.print("Hello World");
Scanner sc = new Scanner(System.in);
System.out.print("Hello what's your first name: ");
String own = sc.nextLine();
System.out.println("Hello " + own + " Welcome to the shell");
while (True){
System.out.print("Enter a number: ");
int num = sc.nextInt();
if (num % 3 ==0){
System.out.println("You entered " + num + ", so you get Fizz");
}
}

}
}
