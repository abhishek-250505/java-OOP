class Student{
    private String name;
    private int age;
    private int roll_no;

//    public → everywhere
//private → only class
//protected → class + child
//default → package only

   Student(String name, int age , int roll_no){
       this.name=name;
       this.age=age;
       this.roll_no=roll_no;
   }

    void print(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(roll_no);
    }


}
public class AccessModifier {
    public static void main(String[] args){
        Student s1 = new Student("Abhishek" , 22 , 14);
        s1.print();
    }
}
