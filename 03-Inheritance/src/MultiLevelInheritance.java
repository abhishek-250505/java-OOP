class A {
    void methodA(){
        System.out.println("Method of A class");
    }
}
class B extends A {
    void methodB(){
        System.out.println("Method of B class");
    }
}
class C extends B{
    void methodC(){
        System.out.println("Method of C class");
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {


        C obj = new C();
        obj.methodC();
        obj.methodB();
        obj.methodA();
    }
}

//Multilevel Inheritance means a class inherits from another class, and then another class inherits from it.
//Grandparent → Parent → Child