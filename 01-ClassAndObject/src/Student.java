public class Student{
    String name;
    int roll_no;

    public void study(){
        System.out.println(name + " is Studying in class");
    }
    public void displayDetails(){
        System.out.println("name:- " + name);
        System.out.println("Roll No. :- " + roll_no);
    }

    public static void main(String[] args) {
//        Student is a class
//        s1 = Object reference
      Student s1 = new Student();
      s1.name = "Abhishek";
      s1.roll_no = 22;
      s1.study();
      s1.displayDetails();


      Student s2 = new Student();
      s2.name = "Anand ";
      s2.roll_no = 23;
      s2.study();
      s2.displayDetails();
    }
}