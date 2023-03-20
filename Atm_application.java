import java.util.Scanner;

public class Atm_application {
    private static Scanner scanner = new Scanner(System.in);
    private static double balance = 1000;

    public static void main(String[] args) {
        int option = 0;
        do {
            System.out.println("Welcome to My ATM");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your option: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    System.out.println("Thank you for using My ATM!");
                    break;
                default:
                    System.out.println("Invalid option! Please try again.");
            }
        } while (option != 4);
    }

    private static void checkBalance() {
        System.out.println("Your current balance is $" + balance);
    }

    private static void deposit() {
        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();
        balance += amount;
        System.out.println("Deposit of $" + amount + " successful!");
        System.out.println("Your new balance is $" + balance);
    }

    private static void withdraw() {
        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();
        if (amount > balance) {
            System.out.println("Insufficient balance! Please try again.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful!");
            System.out.println("Your new balance is $" + balance);
        }
    }
}
