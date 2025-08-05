package Assignment6;

import java.sql.SQLOutput;

// Design a class named`BankAccount that uses the concept of encapsulation. The class should have the following private data members:
//        account number, account holder name, and balance. Provide public getter and setter methods to access and modify these fields.
//        Also, include a method to deposit
//        and withdraw amount ensuring that the balance cannot go negative

 class BankAccount {
    private  long account_number;
    private  String  account_holder_name;
    private  int balance;

    public long getAccount_number() {
        return account_number;
    }

    public void setAccount_number(long account_number) {
        this.account_number = account_number;
    }

    public String getAccount_holder_name() {
        return account_holder_name;
    }

    public void setAccount_holder_name(String account_holder_name) {
        this.account_holder_name = account_holder_name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public  int withdraw(int amount){
        int total_amount=getBalance();
        if(!(total_amount ==0)) {

            if (total_amount > amount) {
                int min = total_amount - amount;
                setBalance(min);
                return amount;
            }
            else{
                System.out.println("your withdraw amount less then your balance amount");
                return 0;

            }
        }
        return  0;
    }
    public  void deposit(int amount){
        this.balance+=amount;

    }
}

public  class Bank_Account_main{
    public static void main(String[] args) {
       BankAccount bank =new BankAccount();
       bank.setAccount_number(12345678);
       bank.setBalance(5000);
       bank.setAccount_holder_name("sathya");

       System.out.println(bank.withdraw(150000));


        System.out.println(bank.getBalance());
        bank.deposit(2000);
        System.out.println(bank.getBalance());



    }
}
