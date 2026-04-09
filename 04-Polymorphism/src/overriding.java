class Bank{
    public void interestRate(){
        System.out.println("general interest rate is 5% ");
    }
}
class SBI extends Bank{
    @Override
    public void interestRate() {
        System.out.println("SBI Bank interset rate is 7% ");
    }
}
class HDFC extends Bank{
    @Override
    public void interestRate() {
        System.out.println("HDFC Bank interset rate is 9% ");
    }
}
public class overriding {
    public static void main(String [] args){
         SBI obj = new SBI();
         obj.interestRate();
         Bank obj1 =new Bank();
         obj1.interestRate();
         HDFC obj2 = new HDFC();
         obj2.interestRate();
    }
}
