class Parents{
    String name;
    int age;

    void displayInfo(){
        System.out.println("Name:" + name);
        System.out.println("Age :" + age);
    }

}
class Child extends Parents{
    int roll;
    void display(){
        System.out.println("Roll no :" + roll);

    }
}

public class Main {
    public static void main (String[] args){
        Child obj1 = new Child();
        obj1.name = "Abhishek ";
        obj1.age= 22;
        obj1.roll=101;
        obj1.displayInfo();
        obj1.display();
    }
}
