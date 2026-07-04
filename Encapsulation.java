/*
Encapsulation is the process of wrapping data (variables) and methods (functions) into a single unit (class) and restricting direct access to the data by making it private.
Access to the data is provided through public getter and setter methods.
This helps achieve data hiding and protects the object's state.

Real-Time Example: ATM Machine 

Imagine you have an ATM card.

Your bank balance is not directly accessible.
You can only access or update it through operations like:
checkBalance()
deposit()
withdraw()

You cannot directly modify the balance.

This is Encapsulation.

Data (balance) → Hidden (private)
Methods (deposit, withdraw) → Public access
*/

class BankAccount {

    // Private data (Data Hiding)
    private double balance;

    // Setter
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Getter
    public double getBalance() {
        return balance;
    }
}

 class Main {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        account.setBalance(5000);

        System.out.println("Balance: " + account.getBalance());
    }
}
