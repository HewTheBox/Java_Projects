import java.util.Scanner;

import org.w3c.dom.UserDataHandler;

public class volume{
    public static void main(String[]args){
        // Volume of Cylinder
        double pie = Math.PI;
        double radius_input;
        double height;
        double multiple = 2;

        Scanner sc = new Scanner(System.in);
        System.out.print(
"What do you want to calculate for...\n If it's Volume of a cylinder input \"1\"\n If it's Area of a Cylinder input \"2\"\n> ");
        int determine = sc.nextInt();
        
            
        if (determine ==1){

        System.out.print("input the height of the cylinder\n > ");
        height = sc.nextDouble();
        
        System.out.print("input the radius \n> ");
        radius_input = sc.nextDouble();
        double radius = Math.pow(radius_input, multiple);
        double volume_of_cylinder = pie * radius * height;
        System.out.println("The volume of the cylinder is " + volume_of_cylinder);

        }
        else if(determine ==2){
            
            System.out.print("input the height of the cylinder\n> ");
            height = sc.nextDouble();
        
            System.out.print("input the radius\n> ");
            radius_input = sc.nextDouble();
            double radius = Math.pow(radius_input, multiple);

            double two = 2;
        
            double areaOfCylinder = (two * pie * radius) + (two * pie * radius * height);
            System.out.println("The Area of the cylinder is " + areaOfCylinder);
        }
        else{
            System.out.println("Wrong input. Please restart");
        }
        
        





        
        

    }
}
