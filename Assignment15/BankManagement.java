
import java.util.Scanner;

class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;

    public BankAccount(String accountHolder, String accountNumber,
                       double initialBalance) {
        if (accountHolder == null || accountHolder.trim().isEmpty()) {
            throw new IllegalArgumentException(
                "Account holder name cannot be empty."
            );
        }

        if (initialBalance < 0) {
            throw new IllegalArgumentException(
                "Initial balance cannot be negative."
            );
        }

        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException(
                "Deposit amount must be positive."
            );
        }

        balance += amount;
        System.out.println("Deposit successful.");
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException(
                "Withdrawal amount must be positive."
            );
        }

        if (amount > balance) {
            throw new IllegalArgumentException(
                "Insufficient balance."
            );
        }

        balance -= amount;
        System.out.println("Withdrawal successful.");
    }

    public void checkBalance() {
        System.out.printf("Available balance: Rs. %.2f%n", balance);
    }

    public void displayDetails() {
        System.out.println("\n----- Account Details -----");
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.printf("Balance: Rs. %.2f%n", balance);
        System.out.println("---------------------------");
    }
}

public class BankManagement {

    private static final Scanner sc = new Scanner(System.in);

    private static String readText(String message) {
        System.out.print(message);
        return sc.nextLine().trim();
    }

    private static int readInt(String message) {
        while (true) {
            try {
                System.out.print(message);
                return Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid whole number.");
            }
        }
    }

    private static double readAmount(String message) {
        while (true) {
            try {
                System.out.print(message);
                double amount = Double.parseDouble(sc.nextLine().trim());

                if (!Double.isFinite(amount)) {
                    System.out.println("Enter a finite amount.");
                    continue;
                }

                return amount;
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid amount.");
            }
        }
    }

    public static void main(String[] args) {
        BankAccount account = null;
        int nextAccountNumber = 1001;
        int choice;

        do {
            System.out.println("\n===== BANK MANAGEMENT SYSTEM =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance");
            System.out.println("5. Display Account Details");
            System.out.println("6. Exit");

            choice = readInt("Enter your choice: ");

            try {
                switch (choice) {
                    case 1:
                        if (account != null) {
                            System.out.println(
                                "An account has already been created."
                            );
                            break;
                        }

                        String name = readText(
                            "Enter account holder name: "
                        );
                        double initialBalance = readAmount(
                            "Enter initial deposit: Rs. "
                        );

                        account = new BankAccount(
                            name,
                            String.valueOf(nextAccountNumber),
                            initialBalance
                        );

                        nextAccountNumber++;
                        System.out.println("Account created successfully!");
                        System.out.println(
                            "Your account number is: "
                            + (nextAccountNumber - 1)
                        );
                        break;

                    case 2:
                        if (account == null) {
                            throw new IllegalStateException(
                                "Please create an account first."
                            );
                        }

                        account.deposit(
                            readAmount("Enter deposit amount: Rs. ")
                        );
                        break;

                    case 3:
                        if (account == null) {
                            throw new IllegalStateException(
                                "Please create an account first."
                            );
                        }

                        account.withdraw(
                            readAmount("Enter withdrawal amount: Rs. ")
                        );
                        break;

                    case 4:
                        if (account == null) {
                            throw new IllegalStateException(
                                "Please create an account first."
                            );
                        }

                        account.checkBalance();
                        break;

                    case 5:
                        if (account == null) {
                            throw new IllegalStateException(
                                "Please create an account first."
                            );
                        }

                        account.displayDetails();
                        break;

                    case 6:
                        System.out.println(
                            "Thank you for using our bank system!"
                        );
                        break;

                    default:
                        System.out.println(
                            "Invalid choice. Select 1 to 6."
                        );
                }
            } catch (IllegalArgumentException |
                     IllegalStateException e) {
                System.out.println("Error: " + e.getMessage());
            }

        } while (choice != 6);

        sc.close();
    }
}