class Employee{
    int salary;
    void salary(){
        System.out.println("Salary :- " +salary );
    }
}
class hr extends Employee{
    int bonus;
    void bonus(){
        System.out.println("Bonus :- " + bonus);
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
         hr obj = new hr();
         obj.salary= 60000;
         obj.salary();
         obj.bonus = 4500;
         obj.bonus();
    }
}
