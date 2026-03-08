class StudentDetails{
    String name;
    StudentDetails(String name){
        this.name =name;
    }
    //copy constructor
    StudentDetails (StudentDetails s){
        this.name = s.name;
    }
}
public class DeepCopy {
    static void main(String []args) {
        StudentDetails s1 = new StudentDetails("Abhishek");
        System.out.println(s1.name);
        StudentDetails s2 = new StudentDetails(s1);
        s2.name = "Anand";
        System.out.println(s2.name);

    }
}
// in deep constructor it create new object and copies the value
//i can change the value by calling the obj