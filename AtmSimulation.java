package AtmSimulation;
	import java.math.BigInteger;
	import java.util.Scanner;

	public class AtmSimulation {
	    public static void main(String[] args) {
	        int pin1 = 2222; // correct PIN (PIN stored in database)
	        int balance1 = 200000; // assumed balance of customer
	        BigInteger ac_no1 = new BigInteger("0123456789"); // account number of customer

	        System.out.println("Insert ATM card into ATM");
	        System.out.println("Enter 4-digit PIN:");

	        int pinAttempt = 0;
	        Scanner sc = new Scanner(System.in);

	        for (int i = 0; i < 3; i++) {
	            int pin2 = sc.nextInt();

	            if (pin1 == pin2) {
	                System.out.println("PIN is correct");
	                break;
	            } else {
	                pinAttempt++;
	                System.out.println("Please enter correct PIN:");
	            }
	        }

	        if (pinAttempt >= 3) {
	            System.out.println("System locked.");
	            return; 
	        }

	        System.out.println("Select Options:");
	        System.out.println("1 Balance Inquiry\n2 Cash Withdrawal\n3 Fund Transfer");
	        int choice = sc.nextInt();

	        boolean printReceipt = true;

	        if (choice == 1) {
	            BalanceInquiry(balance1);
	        } else if (choice == 2) {
	            balance1 = CashWithdrawal(sc, balance1);
	        } else if (choice == 3) {
	            balance1 = FundTransfer(sc, balance1, ac_no1);
	            printReceipt = false; 
	        } else {
	            System.out.println("Invalid choice");
	            return;
	        }

	        if (printReceipt) {
	            System.out.println("Would you like a receipt? (yes/no)");
	            String receiptChoice = sc.next();

	            if (receiptChoice.equalsIgnoreCase("yes")) {
	                PrintReceipt(choice, balance1);
	            } else {
	                System.out.println("Transaction completed without receipt.");
	            }
	        }
	    }

	    public static void BalanceInquiry(int balance) {
	        System.out.printf("Your balance is: %d%n", balance);
	    }

	    public static int CashWithdrawal(Scanner sc, int balance) {
	        System.out.println("Enter the amount to withdraw:");
	        int amount = sc.nextInt();

	        if (amount <= balance) {
	            balance -= amount;
	            System.out.printf("Please collect your cash. Remaining balance: %d%n", balance);
	        } else {
	            System.out.println("Insufficient Balance.");
	        }
	        return balance;
	    }

	    public static void PrintReceipt(int choice, int balance) {
	        System.out.println("----- Transaction Receipt -----");
	        if (choice == 1) {
	            System.out.printf("Balance Inquiry: Your current balance is %d%n", balance);
	        } else if (choice == 2) {
	            System.out.printf("Cash Withdrawal: Remaining balance is %d%n", balance);
	        }
	        System.out.println("-------------------------------");
	    }

	    public static int FundTransfer(Scanner sc, int balance1, BigInteger ac_no1) {
	        System.out.println("Enter the destination AC No to transfer (must be 10 digits):");
	        BigInteger ac_no2 = sc.nextBigInteger();

	        if (ac_no2.toString().length() != 10) {
	            System.out.println("Invalid account number. It must be exactly 10 digits.");
	            return balance1;
	        }

	        System.out.println("Enter amount to transfer:");
	        int amount = sc.nextInt();

	        
	        if (amount > balance1) {
	            System.out.println("Insufficient balance to complete the transfer.");
	            return balance1;
	        }
	        balance1 -= amount;
	        
	        BigInteger balance2 = BigInteger.valueOf(amount);

	        System.out.println("Transfer successful.");
	        System.out.println("Remaining Balance of Ac no1: " + balance1);
	        System.out.println("Balance of Ac no2 after transfer: " + balance2);

	        return balance1;
	    }
	}


