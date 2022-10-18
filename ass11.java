import java.util.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

import java.text.SimpleDateFormat;

public class ass11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "";
        int age;
        int preference;
        String index_number;
        String which_school;
        String telephone;
        String which_trade;
        int start_year;
        int end_year;
        int apprentice_fee = 2000;
        int initial_deposite = 100;
        int amount_to_collect_student;
        int amount_to_collect_trade;


        while(true){
            System.out.print(
            "Please choose a preference\n 1. Student           2. Trade\n >> ");
            preference = sc.nextInt();
            
            if (preference ==1 || preference==2){
                break;
            }
            else{
                System.out.println("Wrong input. Please try again");
            }
            

        }
        

        if(preference ==1){
            System.out.println("Welcome to student Portal");
            System.out.print("What is your name?\n >> ");
            name = sc.next();

            System.out.print("What's your age?\n >> ");
            age = sc.nextInt();
            if(age>=18 && age<=30){
                System.out.print("Which school do you want to attend?\n >> ");
                which_school = sc.next();

                System.out.print("Which year do you want to started?\n >> ");
                start_year = sc.nextInt();
                System.out.print("Which year will you completed?\n >> ");
                end_year = sc.nextInt();
                amount_to_collect_student = (end_year - start_year) * initial_deposite;
                System.out.println("Hello " + name + " of " + which_school + ", your balance is $" + amount_to_collect_student + ".");

            }
            else{
                System.out.println("Hey " + name + ", we are very sorry. You don't qualify for enrolment.\n Thank You");
            }
        }
        else if(preference ==2){
            System.out.println("Welcome to traders portal");
            System.out.print("What's your name?\n >> ");
            name = sc.next();
            System.out.print("How old are you?\n >> ");
            age = sc.nextInt();
            System.out.println(name);
            if(age>=18 && age<=30){
                System.out.print("Input start year\n >> ");
                start_year = sc.nextInt();
                System.out.print("Input end year\n >> ");
                end_year = sc.nextInt();
                amount_to_collect_trade = (end_year - start_year) * initial_deposite + apprentice_fee;
                System.out.println("Hey " + name + ", your balance is $" + amount_to_collect_trade);


            }
            else{
                System.out.println("hey " + name + ", we are very sorry. You dont qualify for enrolment");
            }

        }
        else{
            System.out.println("Wrong input");
        }
        
        

    }
    
}
