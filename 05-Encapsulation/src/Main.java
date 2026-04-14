class ATM {

    private int balance = 0;
    private int pin = 1234;

    // Set new PIN
    public void setPin(int oldPin, int newPin){
        if(this.pin == oldPin){
            this.pin = newPin;
            System.out.println("PIN changed successfully");
        } else {
            System.out.println("Wrong old PIN");
        }
    }

    // Check PIN
    public boolean checkPin(int inputPin){
        return this.pin == inputPin;
    }

    // Deposit
    public void deposit(int amount, int inputPin){
        if(checkPin(inputPin)){
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid PIN");
        }
    }

    // Withdraw
    public void withdraw(int amount, int inputPin){
        if(checkPin(inputPin)){
            if(amount > balance){
                System.out.println("Insufficient Balance");
            } else {
                balance -= amount;
                System.out.println("Withdrawn: " + amount);
            }
        } else {
            System.out.println("Invalid PIN");
        }
    }

    // Get Balance
    public void getBalance(int inputPin){
        if(checkPin(inputPin)){
            System.out.println("Balance: " + balance);
        } else {
            System.out.println("Invalid PIN");
        }
    }
}


public class Main {

    public static void main(String[] args){

        ATM atm = new ATM();

        // Correct PIN
        int pin = 1234;

        atm.deposit(5000, pin);
        atm.withdraw(2000, pin);
        atm.getBalance(pin);

        // Wrong PIN
        atm.withdraw(1000, 1111);

        // Change PIN
        atm.setPin(1234, 4321);

        // Use new PIN
        atm.getBalance(4321);
    }
}
