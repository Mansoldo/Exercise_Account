
package application;

// @author diego.almeida

import java.util.Scanner;
import model.Account;
 
public class Program {
    
   public static void main(String[] args) {
        
       Scanner sc = new Scanner (System.in);
       
       try{
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
           
           Account acc = new Account(number, holder, balance, withdraw);
           
           System.out.println("\n");
           System.out.print("Enter amount for withdraw: ");
           double withdraw_amount = sc.nextDouble();
           acc.withdraw(withdraw_amount);
           
           System.out.println("New balance: " + acc.getBalance());           
           
       }catch(IllegalArgumentException e){
           System.out.println("Withdraw error: " + e.getMessage());
       }catch(RuntimeException e){
           System.out.println("Unexpected error");
       }               
       sc.close();
    }    
}
