import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String userInput;

        do {
            System.out.println("Type '1' if you would like to withdraw");
            System.out.println("Type '2' if you would like to deposit");
            System.out.println("Type '3' if you would like to see your balance");
            System.out.println("Type '4' if you would like to exit");

            BankAccount account = new BankAccount();
            userInput = sc.nextLine();

            switch (userInput) {
                case "1": {
                    System.out.println("How much would you like to withdraw?");
                    int amount = Integer.valueOf(sc.nextLine());
                    account.withdraw(amount);
                    break;
                }
                case "2": {
                    System.out.println("How much would you like to deposit?");
                    int amount = Integer.valueOf(sc.nextLine());
                    account.deposit(amount);
                    break;
                }
                case "3": {
                    System.out.println("Your balance is $" + account.getBalance());
                }

                case "4": {
                    System.out.println("See you soon...");
                }
                default:
                    System.out.println("There is no such option!");
            }

        }
        while (!userInput.equals("4"));

    }

}


