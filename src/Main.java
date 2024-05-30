import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        BankAccount account1 = new BankAccount();
        System.out.println("#########################");
        System.out.println("######## Welcome! #######");
        System.out.println("#########################");
        
        System.out.println("");
        System.out.println("Let's get to know you first!");
        System.out.println("What is the name to open account for?");
        
        String name = scanner.nextLine();
        account1.setCustomerName(name);
        System.out.println("Account created with number: " + account1.getAccountNumber());
        System.out.println("Please provide an email address in order to contact you.");
        String email = scanner.nextLine();
        account1.setCustomerEmail(email);
        System.out.println("Please enter a phone number through which we can reach out to you if needed.");
        String phoneNumberStr = scanner.nextLine();
        long phoneNumber = Long.parseLong(phoneNumberStr);
        account1.setPhoneNumber(phoneNumber);
        
        
        //Case for withdrawal or deposit
        System.out.println("You have a starting balance of: " + account1.getAccountBalance());
        
        do {
            System.out.println("Select transaction: Deposit or Withdrawal.");
            String transaction = scanner.nextLine();
            switch (transaction) {
                case "Deposit":
                    System.out.println("Deposit amount: ");
                    account1.depositFunds(Double.parseDouble(scanner.nextLine()));
                    break;
                case "Withdrawal":
                    System.out.println("Withdrawal amount: ");
                    account1.withdrawFunds(Double.parseDouble(scanner.nextLine()));
                    break;
                default:
                    break;
            }
        } while (true);
    }

}
