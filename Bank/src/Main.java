public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank();
        BankAccount bankAccount1 = new BankAccount(3000);
        BankAccount bankAccount2 = new BankAccount(4000);

        bank.transfer(bankAccount1,bankAccount2,100);

        System.out.println(bankAccount1);
        System.out.println(bankAccount2);


    }
}
