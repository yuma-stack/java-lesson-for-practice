//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        String name = "yuma";
        String age = "24";
        String address = "PP";
        String phone = "089 56 23 712";

        System.out.println("This Student Information " +name);
        System.out.println("This Student Information " +age);
        System.out.println("This Student Information " +address);
        System.out.println("This Student Information " +phone);

        //input
        Scanner sc = new Scanner(System.in);//create scanner object
        System.out.print("Enter your name :");
        String studentName = sc.nextLine();// read string

        System.out.print("Enter your age: ");
        int studentAge = sc.nextInt();// read integer
        sc.nextLine();

        System.out.print("Your phoneNumber: ");
        int studentPhoneNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter your gmail: ");
        String studentGmail = sc.nextLine();

        System.out.print("Enter address: ");
        String studentAddress = sc.nextLine();

        System.out.print("description: ");
        String description = sc.nextLine();

        //message
        System.out.println("=========== message for student =============");

        //procesing
        if(studentAge <= 18){
            System.out.println(" This student cannot join the lesson");
        }else{
            System.out.println("Register sucessfly");
            System.out.println();
        }
        //output
        System.out.println("\nHello: " + studentName + ", \nAge: " + studentAge + ", \nPhoneNumber: " + studentPhoneNumber + ", \nGmail: " + studentGmail + ", \nAddress: " + studentAddress + ", \ndescription: " + description);

    }
}