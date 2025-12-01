import java.util.Scanner;
public class Main {
    public  static void main(String[] args){

        //let create some funny game java

        //create Scanner object
        Scanner scanner = new Scanner(System.in);

        // create variable
        String adjective1;
        String none1;
        String adjective2;
        String verb1;
        String adjective3;

        // Create input
        System.out.print("Enter your adjective (description): ");
        adjective1 = scanner.nextLine();
        System.out.print("Enter your none (animal or person): ");
        none1 = scanner.nextLine();
        System.out.print("Enter your adjective (description): ");
        adjective2 = scanner.nextLine();
        System.out.print("Enter your verb end with -ing (action): ");
        verb1 = scanner.nextLine();
        System.out.print("Enter your adjective (description): ");
        adjective3 = scanner.nextLine();

        //Create output
        System.out.println("\n Today I went to a " + adjective1 + " zoom");
        System.out.println("In an exhibit. I saw a " + none1 + ".");
        System.out.println(none1 + "was" + adjective2 + "and" + verb1 + "!");
        System.out.println("I was " + adjective3 + "! ");

        scanner.close();

    }
}
