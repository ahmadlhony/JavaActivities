package OOP.Classes;

public class BankAccount {
    //create a bank account class named like this: BankAccount
    //fields of this class are:
    //String ownerName, double balance
    //pass this value via Constructor
    private String ownerName;
    private double balance;

    public BankAccount(String ownerName, double balance){
        this.ownerName = ownerName;
        this.balance = balance;
    }



    //Encapsulation
    //make the fields private and add getter and setter for them
    //setter for the balance should have condition, the new balance should be greater then 0
    public double getBalance(){
        return this.balance;
    }

    private void setBalance(double balance){
        if (balance>0){
            this.balance = balance;
        }
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    //Abstraction
    //make setter for the balance private
    //create deposit(put money to account) and withdraw(get money out of the account) methods
    //deposit(double amount)
    //withdraw(double amount)
    //with needed conditions to satisfy the actions
    //exp: for deposit the amount you want to deposit should be greater then 0
    //for withdraw the balance should be greater then the amount you want to withdraw
    //for deposit you should add the amount to the balance
    //for withdraw you should subtract the amount from the balance
    //both should return boolean if the operation succeed return true
    //else return false
    public boolean deposit(double amount){
        if (amount<0){
            System.out.println("Amount should be greater then 0");
            return false;
        }
        double newBalance = this.balance + amount;
        this.setBalance(newBalance);
        return true;
    }

    public boolean withdraw(double amount){
        if (this.balance<=amount || amount<0){
            System.out.println("Amount should be greater then 0");
            return false;
        }else{
            double newBalance = this.balance - amount;
            this.setBalance(newBalance);
            return true;

        }
    }


    //Optional Activity but IMPORTANT
    //make a STATIC(it should be class member) method to send money from an account to an other
    //the method signature should be like this sendMoney(BankAccount sender, BankAccount receiver, double amountToSend)
    // it have two parameters of type BankAccount(the class we have created)
    //and one of type double which is the amount to send
    //the amount to send should be greater then zero
    //sender should withdraw the amount to send
    //receiver should deposit the amount if the withdrawal succeed
    //the method should return true if both operation succeed otherwise false

    public static boolean sendMoney(BankAccount sender, BankAccount receiver, double amount ){

        if (amount<0){
            System.out.println("Insufficient fund");
            return false;
        }

        if (sender.withdraw(amount)){
            if(receiver.deposit(amount))
                return true;
        }
        return false;
    }
}
