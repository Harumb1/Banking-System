public class BankAccount {
    private int balance = 0;

    public int getBalance() {
        return balance;
    }

    public void withdraw(int amount) {
        if (amount > getBalance()) {
            System.out.println("No money! Get a job, you broke ass...");
            return;
        }

        if (amount < 0) {
            System.out.println("Cannot withdraw negative amount");
            return;
        }

        System.out.println("You withdrew $" + amount);
        balance = balance - amount;
        System.out.println("Your balance is now $" + balance);
    }

    public void deposit(int amount) {
        if (amount < 0) {
            System.out.println("Cannot deposit negative amount");
            System.out.println(balance + amount);
            return;
        }

        balance = balance + amount;
        System.out.println("Your balance is now $" + balance);
    }
}