
class StudentDetail{
    String name;

    StudentDetail(String name){
        this.name= name;
//        System.out.println(this);
    }
}
public class ShallowConstructor {
    public static void main (String [] args){
        StudentDetail s1 = new StudentDetail("Abhishek");
        StudentDetail s2 =s1;
        s2.name= "Anand";
        System.out.println(s1.name);
    }
}
//in shallow copy it does not create new object it copy the reference or same memory address  of the object
//both object share same memory
//if i assign value in s2 object it automatically change the value of obj s1.