import  java.util.Scanner;
public class Main {
    public  static  void  main (String[] args){
        // Create the simple if-else statement ez to understand
        Scanner scanner = new Scanner(System.in);
//        int age = 21;
//
//        System.out.print("Input your age: ");
//        age = scanner.nextInt();
//
//      //System.out.println(age);
//        if(age >= 22){
//            System.out.print("Your are in class!");
//        } else if (age < 22) {
//            System.out.println("Your cannot join this class!");
//
//        }
//        System.out.println("\n================================================");
//        System.out.println("this your age: " + age);


        //Create the simple exercise talking about student score "Step by Step "

        //Step1 declare variable
        String subject;
        String subject1 = "CA";
        String subject2 = "CND";
        String subject3 = "ENG";
        String subject4 = "JAVA";
        String subject5 = "LINUX";
        String subject6 = "ORACLE";
        String subject7 = "PYTHON";
        String subject8 = "SA";
        String subject9 = "WP";
        double score1;
        double score2;
        double score3;
        double score4;
        double score5;
        double score6;
        double score7;
        double score8;
        double score9;
        double totalScore;
        double totalAvg;

        String simbol1 = "🙄" , simbol2 = "😄" , simbol3 = "😁" ,simbol4 = "😉" ,simbol5 = "😙" ,simbol6 = "😍" , simbol7 = "🤩";

        //Step2 Create inputSystem
        System.out.print("Please input the subject name: ");
        subject1 = scanner.nextLine();
        System.out.print("Please input score of subject1 " + subject1 + ":" );
        score1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Please input the subject name: ");
        subject2 = scanner.nextLine();
        System.out.print("Please input score of subject2 " + subject2 + ":");
        score2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Please input the subject name: ");
        subject3 = scanner.nextLine();
        System.out.print("Please input score of subject3 " + subject3 + ":");
        score3 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Please input the subject name: ");
        subject4 = scanner.nextLine();
        System.out.print("Please input score of subject4 " + subject4 + ":");
        score4 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Please input the subject name: ");
        subject5 = scanner.nextLine();
        System.out.print("Please input score of subject5 " + subject5 + ":");
        score5 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Please input the subject name: ");
        subject6 = scanner.nextLine();
        System.out.print("Please input score of subject6 " + subject6 + ":");
        score6 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Please input the subject name: ");
        subject7 = scanner.nextLine();
        System.out.print("Please input score of subject7 " + subject7 + ":");
        score7 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Please input the subject name: ");
        subject8 = scanner.nextLine();
        System.out.print("Please input score of subject8 " + subject8 + ":");
        score8 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Please input the subject name: ");
        subject9 = scanner.nextLine();
        System.out.print("Please input score of subject9 " + subject9 + ":" );
        score9 = scanner.nextDouble();
        scanner.nextLine();

        // Process the system
        totalScore = score1 + score2 + score3 + score4 + score5 + score6 + score6 + score7 + score8 + score9;
        totalAvg = totalScore / 9;
        //Print the output
        //condition
        if( totalScore >= 150){
            System.out.print("your exam is A++ " + simbol7);
        } else if (totalScore >= 110) {
            System.out.print("your exam is B+ " + simbol6);
        } else if (totalScore >= 80) {
            System.out.print("your get is B " + simbol5);
        } else if (totalScore >= 70) {
            System.out.print("your get is C " + simbol4);
        } else if (totalScore >= 60) {
            System.out.print("your get is D " + simbol3);
        } else if (totalScore <= 50) {
            System.out.print("your get is E " + simbol2);
        }
        else {
            System.out.print("your exam is false " + simbol1);
        }

        System.out.println("\n========================================================");

        System.out.println("\nCA: " + subject1 + ": " + score1  + "\nCND: " + subject2 + ": " + score2+ "\nENG: " + subject3 + ": " + score3 + "\nJAVA: " + subject4 + ": " +score4 + "\nLINUX: " + subject5 + ": " +score5 + "\nORACLE: " + subject6 + ": " + score6 + "\nPYTHON: " + subject7 + ": " + score7 + "\nSA: " + subject8 + ": " + score8 + "\nWP: " + subject9 + ": " + score9);
        System.out.println("\n======================================================");

        System.out.println("\nyour totalScore is: " + totalScore);
        System.out.println("\nyour totalAvg is: " + totalAvg);
        scanner.close();
    }
}
