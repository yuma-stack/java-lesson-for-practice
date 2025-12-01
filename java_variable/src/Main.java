import  java.util.Scanner;
public class Main {
    public static  void main(String[] args){
        //create variable use int
        int age = 30;
        int year = 2025;

        //create variable use double
        double quantity = 12.8;
        double price = 8.2;

        //create variable use char
        char grade = 'A';
        char symbol = '@';
        char current = '$';

        //create variable use boolean

        boolean isStudent = true ;
        boolean isSale = false;
        boolean isNotStudent = true;
        System.out.println("your age is " + current);

        if (isStudent){
            System.out.println("You are a student!");
        }
        else{
            System.out.println("you are not a student!");
        }
        //practice the Exercise Create the  product info  and print the  Iformation
        //Step 1 Create a variable

        String name ;
        double productPrice;
        int qty;
        String description;
        double totalPrice;
        char symbolCurrent = '$';

        //Step 2 input the System

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your productName: ");
        name = sc.nextLine();

        System.out.print("Enter your productPrice: ");
        productPrice = sc.nextDouble();

        System.out.print("Enter product quantity: ");
        qty = sc.nextInt();
        sc.nextLine();

        System.out.print("description; ");
        description = sc.nextLine();

        System.out.println("============================================================");
        //Step 3 process the System
        totalPrice = productPrice * qty;

        // Step 4 display input
        System.out.println("\nInformation of product" + "\nProductName: " + name + "\nProductPrice: " + productPrice + symbolCurrent + "\nProductQty: " + qty + "\ndescription: " + description);

        // step 5 display result

        System.out.println("total: " + totalPrice + symbolCurrent);

    }
}
