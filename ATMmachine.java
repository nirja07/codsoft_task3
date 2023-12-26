
import java.util.Scanner;

public class ATMmachine {
    public static void main(String args[]) {
        userAccount usa = new userAccount();
        Scanner sc = new Scanner(System.in);
        int option = 0;
        double amount;
        while (option < 4) {
            System.out.println("Enter 1 to withdraw amount");
            System.out.println("Enter 2 to deposit amount");
            System.out.println("Enter 3 to check account balance");
            System.out.println("Enter 4 to exit");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("enter the amount to be withdrawn");
                    amount = sc.nextDouble();
                    usa.withdraw(amount);
                    break;
                case 2:
                    System.out.println("enter the amount to be deposited");
                    amount = sc.nextDouble();
                    usa.deposit(amount);
                    break;
                case 3:
                    System.out.println("Account balance: " + usa.checkBalance());

            }
        }

    }
}

class userAccount {
    private double totalAmount = 0;

    void withdraw(double amt) {
        if (totalAmount < 100 || totalAmount < amt) {
            System.out.println("Insufficient balance \nwithdrawal not possible!!");
        } else {
            totalAmount = totalAmount - amt;
        }
    }

    void deposit(double amt) {
        totalAmount = totalAmount + amt;
    }

    double checkBalance() {
        return totalAmount;
    }

}
