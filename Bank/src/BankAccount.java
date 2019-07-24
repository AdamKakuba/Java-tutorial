public class BankAccount implements Account {
    private double balance;


    public BankAccount(double balance){
        this.balance=balance;
    }
    @Override
    public void withdraw(int amount) {
        this.balance = balance - amount;
    }

    @Override
    public void deposit(int amount) {
        this.balance = balance + amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Stan konta wynosi: "+ getBalance();
    }
}
