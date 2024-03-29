
package model;

// @author diego.almeida
 
public class Account {
    
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;
    
    public Account(){
        
    }
    
    public Account(Integer number, String holder, Double balance, Double withdrawLimit){
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }
    
    public void deposit(double deposit){
        
        if(deposit < 0){
            throw new IllegalArgumentException("Negative value isn't allow it to deposit");
        }
        
        if(deposit == 0){
            throw new IllegalArgumentException("It must be inserted a positive value");
        }
        this.balance += deposit;
    }
    
    public void withdraw(double withdraw){
        
        if(withdraw > withdrawLimit && withdraw > balance){                    
            throw new IllegalArgumentException("The amount exceeds withdraw limit and the balance");            
        }
        if(withdraw > withdrawLimit){
            throw new IllegalArgumentException("The amount exceeds withdraw limit");            
        }
        if(withdraw > balance){
            throw new IllegalArgumentException("Not enought balance to withdraw");            
        }                
        this.balance -= withdraw;
    }   
}
