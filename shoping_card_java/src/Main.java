import  java.util.Scanner;
public class Main {
    public  static  void  main(String[] args){
        //Create Simple shoping card

        //create ObjectScanner for input
        Scanner scanner = new Scanner(System.in);
        //step1  declare variable

        String productName;
        double productPrice;
        int productQty;
        double total;
        char currency = '$';

        //step2 inputSystem

        System.out.print("what product do you like to Buy?: ");
        productName = scanner.nextLine();
        System.out.print("What is the price for each?: ");
        productPrice = scanner.nextDouble();
        System.out.print("How many would you like?: ");
        productQty = scanner.nextInt();

        // Process System
        total = productPrice * productQty;

        // Print outputSystem
        System.out.print("==============================================");

        System.out.print("\nitem: " + productName + "\nprice: " + productPrice + currency + "\nquantity: " + productQty);
        System.out.println("\nyour invoice is: " + total + currency);
        //close input

        scanner.close();


    }
}
