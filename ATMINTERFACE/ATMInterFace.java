import java.util.*;

public class ATMInterFace {
    
    public static void main(String args[]) {
        int balance = 100000, withdraw, deposit;
        System.out.println("WELCOME IN OUR ATM...!");
        System.out.println("Please Enter Your Choice...");
        Scanner sc = new Scanner(System.in);
        while (true) {
            
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 For Exit");
            System.out.print("Choose the operation you want to perform : ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter money to be withdraw:");
                    withdraw = sc.nextInt();
                    if (balance >= withdraw) {
                        balance = balance - withdraw;
                        System.out.println("Please collect your money...");
                    } else {
                        System.out.println("Insufficient Balance");
                    }
                    System.out.println("**********************************************************");
                    System.out.println("NOW YOUR CURRENT AVAILABLE BALANCE IS ..."+balance);
                    System.out.println("**********************************************************");
                    System.out.println(" ");
                    break;

                case 2:

                    System.out.println("Enter money to be deposited...");
                    deposit = sc.nextInt();

                    balance = balance + deposit;
                    System.out.println("**********************************************************");
                    System.out.println("Your Money has been successfully depsited...");
                    System.out.println("**********************************************************");
                    System.out.println("");
                    break;

                case 3:
                    System.out.println("**********************************************************");
                    System.out.println("YOUR ACCOUNT BALANCE IS : " + balance);
                    System.out.println("**********************************************************");
                    System.out.println("");
                    break;
                
                case 4:
                   System.exit(0);
                   System.out.println("");
                   break;

                default: 
                    System.out.println("*****You Entered Wrong Choice...!*****");
                    System.out.println("");
                    break;
            }
        }
    }
}