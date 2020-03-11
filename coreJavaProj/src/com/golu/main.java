package com.golu;

import java.util.Scanner;

class Account{
	private int accountId;
    private String accountType;
    private int balance;
    public Account(int accountId, String accountType, int balance) {
		super();
		this.accountId = accountId;
		this.accountType = accountType;
		this.balance = balance;
	}
	
    public int getAccountId(){
        return this.accountId;
    }
    public void setAccountId(int accountId){
        this.accountId=accountId;
    }
    public String getAccounType(){
        return this.accountType;
    }
    public void setAccountType(String accountType){
        this.accountType=accountType;
    }
    public int getBalance(){
        return this.balance;
    }
    public void setBalance(int balance){
        this.balance=balance;
    }
   
    public boolean withdraw(int withdraw){
        if(balance > withdraw){
            this.balance = this.balance - withdraw;
            System.out.println(this.balance);
            return true;
        }
        else{
            System.out.println("No");
            return false;
        }
    }
    public class Main{
        public void main(String args[]){
            Scanner sc = new Scanner(System.in);
            public  Account getAccountDetails() {
                 Account ob = new Account(23,"");
                    int accountId = sc.nextInt();
                    ob.setAccountId(accountId);
                    String accountType = sc.next();
                    ob.setAccountType(accountType);
                    int balance = sc.nextInt();
                    ob.setBalance(balance);
                    return ob;
            }
            public int getWithdraw(){
                getAccountDetails();
                int withdraw = sc.nextInt();
                ob.withdraw(withdraw);
                }
               
           
           
        }
    }
}
