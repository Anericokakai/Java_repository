public class BankAcount {


    public class BankAccount {
        int acNo;
        String accountName, accountPhoneNumber, accountEmail;
        double accountNumber;

        public BankAccount(int acNo, String accountName, String accountPhoneNumber, String accountEmail, double accountNumber) {
            this.acNo = acNo;
            this.accountName = accountName;
            this.accountPhoneNumber = accountPhoneNumber;
            this.accountEmail = accountEmail;
            this.accountNumber = accountNumber;
        }

        public void accountholder() {
            System.out.println("Account Number: " + acNo);
            System.out.println("Account Holder Name: " + accountName);
            System.out.println("Account Holder Address: " + accountEmail);
            System.out.println("Account Holder Phone: " + accountPhoneNumber);
            System.out.println("Account Holder Balance: " + accountNumber);
        }

        public void deposit(double amount) {
            accountNumber += amount;
            System.out.println("Deposited: $" + amount);
        }

        public void displayBalance() {
            System.out.println("Account Number: " + acNo + " Balance: " + accountNumber);
        }
    }

    static class SavingsAccount extends BankAccount {
        public SavingsAccount(int acNo, String accountName, String accountPhoneNumber, String accountEmail, double accountNumber) {
            super(acNo, accountName, accountPhoneNumber, accountEmail, accountNumber);
        }
    }

    static   class CurrentAccount extends BankAccount {
        public CurrentAccount(int acNo, String accountName, String accountPhoneNumber, String accountEmail, double accountNumber) {
            super(acNo, accountName, accountPhoneNumber, accountEmail, accountNumber);
        }

    }

    class Account {
        public static void main(String[] args) {
            System.out.println("SAVING ACCOUNT DETAILS");
            SavingsAccount sac = new SavingsAccount(1, "Ann Kamau", "072392020", "kakai@gmail.com", 1000);
            sac.accountholder();
            sac.deposit(500);
            sac.displayBalance();

            System.out.println("\nCURRENT ACCOUNT DETAILS");
            CurrentAccount cac = new CurrentAccount(2, "Anerico kakai", "0748492026", "kakai@gmail.com", 10);
            cac.accountholder();
            cac.deposit(300);
            cac.displayBalance();
        }
    }
}
