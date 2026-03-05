class Student{
    int id;
    int age;
    Student(int id , int age){
        System.out.println("Hello using Default constructor");
        System.out.println(" Parameterized Constructor value " +id +"," +age );
    }
}
public class ConstructorDemo {
    public static void main(String[] args){
        Student obj = new Student(2,22);

    }
}
