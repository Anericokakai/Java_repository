public class BankAcount {


    public class BankAccount {
        int acNo;
        String acName, acPhone, acEmail;
        double AcBal;

        public BankAccount(int acNo, String acName, String acPhone, String acEmail, double AcBal) {
            this.acNo = acNo;
            this.acName = acName;
            this.acPhone = acPhone;
            this.acEmail = acEmail;
            this.AcBal = AcBal;
        }

        public void accountholder() {
            System.out.println("Account Number: " + acNo);
            System.out.println("Account Holder Name: " + acName);
            System.out.println("Account Holder Address: " + acEmail);
            System.out.println("Account Holder Phone: " + acPhone);
            System.out.println("Account Holder Balance: " + AcBal);
        }

        public void deposit(double amount) {
            AcBal += amount;
            System.out.println("Deposited: $" + amount);
        }

        public void displayBalance() {
            System.out.println("Account Number: " + acNo + " Balance: " + AcBal);
        }
    }

    static class SavingsAccount extends BankAccount {
        public SavingsAccount(int acNo, String acName, String acPhone, String acEmail, double AcBal) {
            super(acNo, acName, acPhone, acEmail, AcBal);
        }
    }

    static   class CurrentAccount extends BankAccount {
        public CurrentAccount(int acNo, String acName, String acPhone, String acEmail, double AcBal) {
            super(acNo, acName, acPhone, acEmail, AcBal);
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
