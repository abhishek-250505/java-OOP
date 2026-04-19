class Student{
    String name;
    static String college="SIRT";
    void display(){
        System.out.println(name +" " + college);
    }

}

public class Main {
    public static void main(String[] args){
        System.out.println(Student.college);//static that why i access it
        Student obj = new Student();
        obj.name="Abhishek";
        obj.display();
        Student obj1 = new Student();
        obj1.name="Anand";
        obj1.display();
    }
}

//static is directly access in static class but non-static is not access in static class for accessing non-static class we use object.