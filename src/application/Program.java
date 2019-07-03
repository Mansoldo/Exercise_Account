package application;

// @author diego.almeida
import java.util.Scanner;
import model.Account;

public class Program {

    public static int menu() {

        Scanner sc = new Scanner(System.in);
        int opc = 0;

        System.out.println("*** Account Practice System ***");
        System.out.println("1 - Insert data about account");
        System.out.println("2 - Deposit amount");
        System.out.println("3 - Withdraw amount");
        System.out.println("4 - Exit");
        opc = sc.nextInt();

        return opc;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opc = 0;

        Account acc = new Account();
        try {
            do {
                opc = menu();
                switch (opc) {
                    case 1:
                        System.out.println("");
                        System.out.println("Enter account data: ");
                        System.out.print("Number: ");
                        int number = sc.nextInt();
                        System.out.print("Holder: ");
                        sc.nextLine();
                        String holder = sc.nextLine();
                        System.out.print("Initial Balance: ");
                        double balance = sc.nextDouble();
                        System.out.print("Withdraw Limit: ");
                        double withdraw = sc.nextDouble();
                        System.out.println("");

                        acc.setNumber(number);
                        acc.setHolder(holder);
                        acc.setBalance(balance);
                        acc.setWithdrawLimit(withdraw);
                        break;

                    case 2:
                        System.out.println("");
                        System.out.print("Enter amount to deposit: ");
                        double deposit = sc.nextDouble();
                        acc.deposit(deposit);
                        System.out.println("New balance: " + acc.getBalance() + "\n");
                        break;

                    case 3:
                        System.out.println("");
                        System.out.print("Enter amount for withdraw: ");
                        double withdraw_amount = sc.nextDouble();
                        acc.withdraw(withdraw_amount);
                        System.out.println("New balance: " + acc.getBalance() + "\n");
                        break;

                    default:

                        if (opc != 4) {
                            System.out.println("Invalid Option");
                            opc = menu();
                        }
                        break;
                }
            } while (opc != 4);

        } catch (NumberFormatException nfe) {
            System.out.println("It wasn't able to convert String to number");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Unexpected error");
        }
        sc.close();
    }
}
