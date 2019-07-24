public class Bank implements BankTransfer{
    private double balance;

    public void transfer(BankAccount from, BankAccount to, int amount) {
        from.withdraw(amount+1);
        this.balance = balance+1;
        to.deposit(amount);
    }
}
