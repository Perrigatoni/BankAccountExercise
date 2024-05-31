import java.util.Random;

public class BankAccount {
    
    private String customerName = "Set up required!";
    private String customerEmail;
    private long phoneNumber;
    private double accountBalance = 1000;
    private int accountNumber;

    // public void setCustomerName(String customerName) {
    //     this.customerName = customerName;
    //     setAccountNumber();
    // }

    // public void setCustomerEmail(String customerEmail) {
    //     this.customerEmail = customerEmail;
    // }

    // public void setPhoneNumber(long phoneNumber) {
    //     this.phoneNumber = phoneNumber;
    // }

    // public void setAccountBalance(int accounBalance) {
    //     this.accountBalance = accounBalance;
    // }

    // private void setAccountNumber() {
    //     Random random = new Random();
    //     this.accountNumber = random.nextInt(1000);
    // }

    public BankAccount (String customerName, String email, long phoneNumber,
                        double balance, int accountNumber) {
        this.customerName = customerName;
        customerEmail = email;
        this.phoneNumber = phoneNumber;
        accountBalance = balance;
        this.accountNumber = accountNumber;
                        }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void depositFunds (double ammountToDeposit) { 
        if (ammountToDeposit <= 0.0) {
            System.out.println("Cannot deposit... Invalid amount! try another amount.");
        } else {
            accountBalance += ammountToDeposit;
            System.out.println("Deposited " +ammountToDeposit + ". New balance is: " + accountBalance);
        }
    }

    public void withdrawFunds (double ammountToWithdraw) {
        if (ammountToWithdraw <= accountBalance) {
            accountBalance -= ammountToWithdraw;
            System.out.println("Withdrew " + ammountToWithdraw + ". Remaining balance is: " + accountBalance);
        } else if (ammountToWithdraw > accountBalance) {
            System.out.println("Insufficient balance. Available balance is: " + getAccountBalance());
        }
        if (accountBalance == 0.0) {
            System.out.println("Warning! Balance is now 0.");
        }
    }
}
