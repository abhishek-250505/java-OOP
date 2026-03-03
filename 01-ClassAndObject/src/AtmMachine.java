import java.util.Scanner;

class Atm{
    Float Balance;
    int PIN = 5678;
    public void checkPin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Pin ");
        int accPin = sc.nextInt();
        if (PIN == accPin){
            menu();
        }else {
            System.out.println("Enter valid Pin");
            checkPin();
        }
    }
    public void menu(){
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. Exit");
        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();
        if (opt == 1){
            checkBalance();
        } else if (opt==2) {
            withdrawMoney();
        } else if (opt== 3) {
            DepositMoney();

        } else if (opt ==4) {
            Exit();
            return;
        }else{
            System.out.println("Enter a valid choice");
        }
    }
    public void checkBalance(){
        System.out.println("Balance" + Balance);
        menu();
    }
    public void withdrawMoney(){
        System.out.println("Enter Amount");
        Scanner sc = new Scanner(System.in);
       float  amount =sc.nextFloat();
       if (amount >Balance){
           System.out.println("Insufficient Fund");
       }else{
           Balance= Balance - amount;
           System.out.println("Money withdraw Sucessfully");
       }
        menu();
    }


    public void DepositMoney(){
        System.out.println("Enter the Amount");
        Scanner sc = new Scanner(System.in);
        float amount =sc.nextFloat();
        Balance = Balance+amount;
        System.out.println("Money Deposit Sucessfully");
        menu();

    }
    public void Exit(){

    }




}
public class AtmMachine {
   public static void main(String[] args) {
       Atm obj = new Atm();
       obj.checkPin();

    }
}
