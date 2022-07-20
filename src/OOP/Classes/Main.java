package OOP.Classes;

public class Main {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("amanj",12);
        System.out.println("Owner Name is: "+ acc.getOwnerName()+", and balance = "+acc.getBalance());
        BankAccount secondAcc = new BankAccount("shakar",20);
        System.out.println("Owner Name is: "+ secondAcc.getOwnerName()+", and balance = "+secondAcc.getBalance());

//        acc.setBalance(-1);
//        acc.setOwnerName("Dleir");
//        System.out.println("\n\nOwner Name is: "+ acc.getOwnerName()+", and balance = "+acc.getBalance());

//        acc.deposit(0);
//        System.out.println("\n\nOwner Name is: "+ acc.getOwnerName()+", and balance = "+acc.getBalance());


//        acc.withdraw(-1);
//        System.out.println("\n\nOwner Name is: "+ acc.getOwnerName()+", and balance = "+acc.getBalance());

//        BankAccount.sendMoney(acc,secondAcc,10);
//        System.out.println("\n\nOwner Name is: "+ acc.getOwnerName()+", and balance = "+acc.getBalance());
//        System.out.println("Owner Name is: "+ secondAcc.getOwnerName()+", and balance = "+secondAcc.getBalance());





    }

}
